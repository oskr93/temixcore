package com.xoftix.temixcore.as.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoftix.temixcore.as.data.AstRecurso;
import com.xoftix.temixcore.as.data.repository.AstRecursoRepository;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@Service
public class AstRecursoService {
	@Autowired 
	private AstRecursoRepository astRecursoRepository;
	
	
	
	public AstRecurso guardarAstRecurso(AstRecurso astRecurso) {
		
		return astRecursoRepository.save(astRecurso);
	}
	
	public void eliminarAstRecurso(Long id) {		
		astRecursoRepository.deleteById(id);
	}
	
	public AstRecurso consultarAstRecurso(Long id) {
		
		try {
			return astRecursoRepository.findById(id).get();
		} catch (NoSuchElementException ex) {
			return null;
		}
	}
	
	public List<AstRecurso> listarAstRecurso(){
		return astRecursoRepository.findAll();
	}
	
	public List<AstRecurso> listarAstRecursoPorEstado(TipoEstado estado){
		return astRecursoRepository.findByEstado(estado);
	}
}
