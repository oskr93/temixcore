package com.xoftix.temixcore.as.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoftix.temixcore.as.data.AstNivelSeguridad;
import com.xoftix.temixcore.as.data.repository.AstNivelSeguridadRepository;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@Service
public class AstNivelSeguridadService{
	@Autowired 
	private AstNivelSeguridadRepository astNivelSeguridadRepository;
	
	
	
	public AstNivelSeguridad guardarAstNivelSeguridad(AstNivelSeguridad astNivelSeguridad) {
		
		return astNivelSeguridadRepository.save(astNivelSeguridad);
	}
	
	public void eliminarAstNivelSeguridad(Long id) {		
		astNivelSeguridadRepository.deleteById(id);
	}
	
	public AstNivelSeguridad consultarAstNivelSeguridad(Long id) {
		
		try {
			return astNivelSeguridadRepository.findById(id).get();
		} catch (NoSuchElementException ex) {
			return null;
		}
	}
	
	public List<AstNivelSeguridad> listarAstNivelSeguridad(){
		return astNivelSeguridadRepository.findAll();
	}
	
	public List<AstNivelSeguridad> listarAstNivelSeguridadPorEstado(TipoEstado estado){
		return astNivelSeguridadRepository.findByEstado(estado);
	}

}
