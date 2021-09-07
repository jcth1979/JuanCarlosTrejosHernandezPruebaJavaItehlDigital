/**
 * 
 */
package prueba.cursos.itehl.dto;

import java.math.BigDecimal;

/**
 * @author Juan Carlos Trejos
 *
 */
public class CursoDTO {

	private String id;
	private String nombre;
	private BigDecimal costo;
	private String descripcion;
	private Integer horas;
	private String dirigidoA;
	private ModalidadDTO modalidad;

	public CursoDTO() {
		// Emtpy Constructor
	}

	/**
	 * @param nombre
	 * @param costo
	 * @param descripcion
	 * @param horas
	 * @param dirigidoA
	 * @param modalidad
	 */
	public CursoDTO(final String id,final String nombre, final BigDecimal costo, final String descripcion,
			final Integer horas, final String dirigidoA, final ModalidadDTO modalidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.costo = costo;
		this.descripcion = descripcion;
		this.horas = horas;
		this.dirigidoA = dirigidoA;
		this.modalidad = modalidad;
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
	 * @return the costo
	 */
	public BigDecimal getCosto() {
		return costo;
	}

	/**
	 * @param costo the costo to set
	 */
	public void setCosto(final BigDecimal costo) {
		this.costo = costo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the horas
	 */
	public Integer getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(final Integer horas) {
		this.horas = horas;
	}

	/**
	 * @return the dirigidoA
	 */
	public String getDirigidoA() {
		return dirigidoA;
	}

	/**
	 * @param dirigidoA the dirigidoA to set
	 */
	public void setDirigidoA(final String dirigidoA) {
		this.dirigidoA = dirigidoA;
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

}
