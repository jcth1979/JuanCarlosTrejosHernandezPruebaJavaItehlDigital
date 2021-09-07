package prueba.cursos.itehl.service;

import java.util.List;

import prueba.cursos.itehl.model.Descuento;

/**
 * The Interface DescuentoService.
 */
public interface DescuentoService {

	/**
	 * Guardar descuento.
	 *
	 * @param descuento the descuento
	 */
	void guardarDescuento(Descuento descuento);

	/**
	 * Find descuentos all.
	 *
	 * @return the list
	 */
	List<Descuento> findDescuentosAll();
}