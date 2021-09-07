package prueba.cursos.itehl.dto;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "descuentos")
public class DescuentoDTO {

	@Id
	private String id;
	private String nombre;
	private ModalidadDTO modalidad;
	private String pais;
	private Integer descuento;
	private CursoDTO curso;
	private Date fechaFinal;

	public DescuentoDTO() {
		// Empty constructor
	}

	/**
	 * @param nombre
	 * @param modalidad
	 * @param pais
	 * @param descuento
	 * @param curso
	 * @param fechaFinal
	 */
	public DescuentoDTO(final String id, final String nombre, final ModalidadDTO modalidad, final String pais,
			final Integer descuento, final CursoDTO curso, final Date fechaFinal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.modalidad = modalidad;
		this.pais = pais;
		this.descuento = descuento;
		this.curso = curso;
		this.fechaFinal = fechaFinal;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the modalidad
	 */
	public ModalidadDTO getModalidad() {
		return modalidad;
	}

	/**
	 * @param modalidad the modalidad to set
	 */
	public void setModalidad(final ModalidadDTO modalidad) {
		this.modalidad = modalidad;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(final String pais) {
		this.pais = pais;
	}

	/**
	 * @return the descuento
	 */
	public Integer getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(final Integer descuento) {
		this.descuento = descuento;
	}

	/**
	 * @return the curso
	 */
	public CursoDTO getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(final CursoDTO curso) {
		this.curso = curso;
	}

	/**
	 * @return the fechaFinal
	 */
	public Date getFechaFinal() {
		return fechaFinal;
	}

	/**
	 * @param fechaFinal the fechaFinal to set
	 */
	public void setFechaFinal(final Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DescuentoDTO [nombre=" + nombre + ", modalidad=" + modalidad + ", pais=" + pais + ", descuento="
				+ descuento + ", curso=" + curso + ", fechaFinal=" + fechaFinal + "]";
	}

}
