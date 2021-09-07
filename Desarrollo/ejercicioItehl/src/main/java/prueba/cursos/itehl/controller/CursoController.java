/**
 * 
 */
package prueba.cursos.itehl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prueba.cursos.itehl.dto.CursoDTO;
import prueba.cursos.itehl.dto.DescuentoDTO;
import prueba.cursos.itehl.dto.ModalidadDTO;
import prueba.cursos.itehl.model.Curso;
import prueba.cursos.itehl.model.Descuento;
import prueba.cursos.itehl.model.Modalidad;
import prueba.cursos.itehl.service.CursoService;
import prueba.cursos.itehl.service.DescuentoService;
import prueba.cursos.itehl.service.ModalidadService;
import prueba.cursos.itehl.util.MapperUtil;

/**
 * @author Juan Carlos Trejos
 *
 */
@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@Autowired
	private ModalidadService modalidadService;
	
	@Autowired
	private DescuentoService descuentoService;
	

	@GetMapping(value = "/porModalidad")
	public ResponseEntity<List<CursoDTO>> getCursosByModalidad(@RequestBody final ModalidadDTO modalidadDto) {
		return new ResponseEntity<>(
				MapperUtil.mapAll(cursoService.findCursosByModalidad(MapperUtil.map(modalidadDto, Modalidad.class)),
						CursoDTO.class),
				HttpStatus.OK);
	}
	
	@GetMapping(value = "/descuentos")
	public ResponseEntity<List<DescuentoDTO>> getDescuentos() {
		return new ResponseEntity<>(MapperUtil.mapAll(descuentoService.findDescuentosAll(), DescuentoDTO.class), HttpStatus.OK);
	}

	@GetMapping(value = "/")
	public ResponseEntity<List<CursoDTO>> getCursosAll() {
		return new ResponseEntity<>(MapperUtil.mapAll(cursoService.findCursosAll(), CursoDTO.class), HttpStatus.OK);
	}

	@PostMapping(value = "/crear/curso")
	public ResponseEntity<?> crearCurso(@RequestBody final CursoDTO cursoDTO) {
		cursoService.guardarCurso(MapperUtil.map(cursoDTO, Curso.class));
		return new ResponseEntity<>("Curso Creado!!", HttpStatus.OK);
	}

	@PostMapping(value = "/crear/modalidad")
	public ResponseEntity<?> crearModalidad(@RequestBody final ModalidadDTO modalidadDTO) {
		modalidadService.guardarModalidad(MapperUtil.map(modalidadDTO, Modalidad.class));
		return new ResponseEntity<>("Modalidad Creada!!", HttpStatus.OK);
	}

	@PostMapping(value = "/crear/descuento")
	public ResponseEntity<?> crearDescuento(@RequestBody final DescuentoDTO descuentoDTO) {
		descuentoService.guardarDescuento(MapperUtil.map(descuentoDTO, Descuento.class));
		return new ResponseEntity<>("Descuento Creado!!", HttpStatus.OK);
	}

}
