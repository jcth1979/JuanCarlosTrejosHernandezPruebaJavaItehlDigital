/**
 * 
 */
package prueba.cursos.itehl.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 *
 */
@Document(collection = "cursos")
public class Curso {

	@Id
	private String id;
	private String nombre;
	private BigDecimal costo;
	private String descripcion;
	private Integer horas;
	private String dirigidoA;
	private Modalidad modalidad;
	
	public Curso() {
		
	}
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param costo
	 * @param descripcion
	 * @param horas
	 * @param dirigidoA
	 * @param modalidad 
	 * @param modalidad
	 * @param id 
	 */
	public Curso(String id, String nombre, BigDecimal costo, String descripcion, Integer horas, String dirigidoA, Modalidad modalidad) {
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
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
	public void setCosto(BigDecimal costo) {
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
	public void setDescripcion(String descripcion) {
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
	public void setHoras(Integer horas) {
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
	public void setDirigidoA(String dirigidoA) {
		this.dirigidoA = dirigidoA;
	}
	/**
	 * @return the modalidad
	 */
	public Modalidad getModalidad() {
		return modalidad;
	}
	/**
	 * @param modalidad the modalidad to set
	 */
	public void setModalidad(Modalidad modalidad) {
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
	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", costo=" + costo + ", descripcion=" + descripcion
				+ ", horas=" + horas + ", dirigidoA=" + dirigidoA + "]";
	}
	
	
	
	
	
	
	
}
