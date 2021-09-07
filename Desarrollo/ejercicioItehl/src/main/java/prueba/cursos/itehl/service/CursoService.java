/*
 * 
 */
package prueba.cursos.itehl.service;

import java.util.List;

import prueba.cursos.itehl.model.Curso;
import prueba.cursos.itehl.model.Modalidad;

/**
 * The Interface CursoService.
 */
public interface CursoService {

	/**
	 * Find cursos by modalidad.
	 *
	 * @param modalidad the modalidad
	 * @return the list
	 */
	List<Curso> findCursosByModalidad(Modalidad modalidad);

	/**
	 * Find cursos all.
	 *
	 * @return the list
	 */
	List<Curso> findCursosAll();

	/**
	 * Guardar curso.
	 *
	 * @param map the map
	 */
	void guardarCurso(Curso map);
}
