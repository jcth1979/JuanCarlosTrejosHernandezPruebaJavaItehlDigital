package prueba.cursos.itehl.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "descuentos")
public class Descuento {

	@Id
	private String id;
	private String nombre;
	private Modalidad modalidad;
	private String pais;
	private Integer descuento;
	private Curso curso;
	private Date fechaFinal;
	
	
	public Descuento() {
		//Empty constructor
	}
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param modalidad
	 * @param pais
	 * @param descuento
	 * @param curso
	 * @param fechaFinal
	 */
	public Descuento(String id, String nombre, Modalidad modalidad, String pais, Integer descuento, Curso curso,
			Date fechaFinal) {
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
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
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
	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}
	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
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
	public void setFechaFinal(Date fechaFinal) {
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
	public void setId(String id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "DescuentoDTO [nombre=" + nombre + ", modalidad=" + modalidad + ", pais=" + pais + ", descuento="
				+ descuento + ", curso=" + curso + ", fechaFinal=" + fechaFinal + "]";
	}
	
	
	
	
	
}
