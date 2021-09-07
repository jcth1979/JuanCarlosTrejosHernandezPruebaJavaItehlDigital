/**
 * 
 */
package prueba.cursos.itehl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.cursos.itehl.model.Modalidad;
import prueba.cursos.itehl.repository.ModalidadRepository;
import prueba.cursos.itehl.service.ModalidadService;

/**
 * @author Juan Carlos Trejos
 *
 */
@Service
public class ModalidadServiceImpl implements ModalidadService {

	@Autowired
	private ModalidadRepository modalidadRepository;
	
	@Override
	public void guardarModalidad(Modalidad modalidad) {
		modalidadRepository.save(modalidad);
	}

}
