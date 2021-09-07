/**
 * 
 */
package prueba.cursos.itehl.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import prueba.cursos.itehl.model.Curso;
import prueba.cursos.itehl.model.Modalidad;

/**
 * 
 *
 */
public interface CursoRepository extends MongoRepository<Curso, String> {

	List<Curso> findByModalidad(Modalidad modalidad);
	
}
