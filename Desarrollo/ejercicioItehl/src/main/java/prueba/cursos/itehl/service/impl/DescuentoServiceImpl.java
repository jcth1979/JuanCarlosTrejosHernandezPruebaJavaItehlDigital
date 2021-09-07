/**
 * 
 */
package prueba.cursos.itehl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.cursos.itehl.model.Descuento;
import prueba.cursos.itehl.repository.DescuentoRepository;
import prueba.cursos.itehl.service.DescuentoService;

/**
 * @author Juan Carlos Trejos
 *
 */
@Service
public class DescuentoServiceImpl implements DescuentoService {

	/** The descuento repository. */
	@Autowired
	private DescuentoRepository descuentoRepository;

	/**
	 * Guardar descuento.
	 *
	 * @param descuento the descuento
	 */
	@Override
	public void guardarDescuento(final Descuento descuento) {
		descuentoRepository.save(descuento);
	}

	/**
	 * Find descuentos all.
	 *
	 * @return the list
	 */
	@Override
	public List<Descuento> findDescuentosAll() {
		return descuentoRepository.findAll();
	}

}
