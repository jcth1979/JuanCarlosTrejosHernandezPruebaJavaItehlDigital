package prueba.cursos.itehl.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class ModalidadDTO {
	
	@Id
	private String id;
	private String nombre;
	private String descripcion;
	
	
	public ModalidadDTO() {
		// Emtpy Constructor
	}
	
	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 */
	public ModalidadDTO(String id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
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
		return "Modalidad [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
	
	
	
}
