/**
 * 
 */
package prueba.cursos.itehl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.cursos.itehl.model.Curso;
import prueba.cursos.itehl.model.Modalidad;
import prueba.cursos.itehl.repository.CursoRepository;
import prueba.cursos.itehl.service.CursoService;

/**
 * @author Juan Carlos Trejos
 *
 */
@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public List<Curso> findCursosByModalidad(Modalidad modalidad) {
		return cursoRepository.findByModalidad(modalidad);
	}

	@Override
	public List<Curso> findCursosAll() {
		return cursoRepository.findAll();
	}

	@Override
	public void guardarCurso(Curso curso) {
		cursoRepository.save(curso);
	}
	
	

}
