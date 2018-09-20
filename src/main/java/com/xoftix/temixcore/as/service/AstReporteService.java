package com.xoftix.temixcore.as.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoftix.temixcore.as.data.AstReporte;
import com.xoftix.temixcore.as.data.repository.AstReporteRepository;

@Service
public class AstReporteService {
	@Autowired 
	private AstReporteRepository astReporteRepository;
	
	
	
	public AstReporte guardarAstReporte(AstReporte astReporte) {
		
		return astReporteRepository.save(astReporte);
	}
	
	public void eliminarAstReporte(Long id) {		
		astReporteRepository.deleteById(id);
	}
	
	public AstReporte consultarAstReporte(Long id) {
		
		try {
			return astReporteRepository.findById(id).get();
		} catch (NoSuchElementException ex) {
			return null;
		}
	}
	
	public List<AstReporte> listarAstReporte(){
		return astReporteRepository.findAll();
	}

	
}
