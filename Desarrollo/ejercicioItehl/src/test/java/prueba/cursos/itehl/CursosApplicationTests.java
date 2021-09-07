package prueba.cursos.itehl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@SpringBootTest
@AutoConfigureMockMvc
class CursosApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private TestRestTemplate template;

    
    /*
    private Curso curso;
    private Modalidad modalidad;
    private Descuento descuento;
    
    private final List<Curso> cursos = new ArrayList<>();
    private final List<Descuento> descuentos = new ArrayList<>();
    
    @Before
    public void setup() {
    	curso = new Curso();
    	curso.setNombre("Curso Test");
    	curso.setDescripcion("Prueba Test Curso");
    	curso.setDirigidoA("Cualquier persona");
    	curso.setHoras(30);
    	curso.setCosto(new BigDecimal(100000));
    	
    	modalidad = new Modalidad();
    	modalidad.setNombre("Online");
    	modalidad.setDescripcion("Descuento Online");
    	
    	curso.setModalidad(modalidad);
    	
    	
    	descuento = new Descuento();
    	descuento.setNombre("Descuento Online");
    	descuento.setPais("Colombia");
    	descuento.setCurso(curso);
    	descuento.setModalidad(modalidad);
    	descuento.setDescuento(30);
    	Calendar cal = Calendar.getInstance();
    	cal.set(2021, 12, 30);
    	descuento.setFechaFinal(cal.getTime());
    	
    	descuentos.add(descuento);
    	cursos.add(curso);
    	
    	Mockito.when(cursoRepository.findAll()).thenReturn(cursos);
    	
    }
    
    */
    
	@Test
	public void shouldCreateEntity() throws Exception {

		mockMvc.perform(post("/cursos/crear/curso").content(
				"{\n"
				+ "  \"nombre\": \"Curso 6\",\n"
				+ "  \"costo\": 65000,\n"
				+ "  \"descripcion\": \"Descripcion Curso 6\",\n"
				+ "  \"horas\": 35,\n"
				+ "  \"dirigidoA\": \"Adultos\",\n"
				+ "  \"modalidad\": {\n"
				+ "    \"nombre\": \"OnDemand\",\n"
				+ "    \"descripcion\": \"Descuento OnDemand\"\n"
				+ "  }\n"
				+ "}")).andExpect(
						status().isCreated()).andReturn();
	}
	
	
	@Test
	public void shouldReturnRepositoryIndex() throws Exception {

		ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).contains("nombre");
		
		
	}
	

    
//	@Test
//	void contextLoads() {
//	}

}
