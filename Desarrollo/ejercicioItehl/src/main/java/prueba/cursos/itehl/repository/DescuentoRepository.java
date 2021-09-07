/**
 * 
 */
package prueba.cursos.itehl.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import prueba.cursos.itehl.model.Descuento;

/**
 * 
 *
 */
public interface DescuentoRepository extends MongoRepository<Descuento, String> {
	
}
