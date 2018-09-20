package com.xoftix.temixcore.as.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoftix.temixcore.as.data.AstElemento;
import com.xoftix.temixcore.as.data.repository.AstElementoRepository;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@Service
public class AstElementoService {
	
	@Autowired 
	private AstElementoRepository astElementoRepository;
	
	
	
	public AstElemento guardarAstElemento(AstElemento astElemento) {
		
		return astElementoRepository.save(astElemento);
	}
	
	public void eliminarAstElemento(Long id) {		
		astElementoRepository.deleteById(id);
	}
	
	public AstElemento consultarAstElemento(Long id) {
		
		try {
			return astElementoRepository.findById(id).get();
		} catch (NoSuchElementException ex) {
			return null;
		}
	}
	
	public List<AstElemento> listarAstElemento(){
		return astElementoRepository.findAll();
	}

	public List<AstElemento> listarAstElementoPorEstado(TipoEstado estado){
		return astElementoRepository.findByEstado(estado);
	}

}
