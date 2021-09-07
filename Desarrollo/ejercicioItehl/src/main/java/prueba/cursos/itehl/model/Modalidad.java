package prueba.cursos.itehl.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "modalidades")
public class Modalidad {
	
	@Id
	private String id;
	private String nombre;
	private String descripcion;
	
	public Modalidad() {
		
	}
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 */
	public Modalidad(String id, String nombre, String descripcion) {
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
