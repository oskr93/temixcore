package com.xoftix.temixcore.as.service;


import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoftix.temixcore.as.data.AstDataSource;
import com.xoftix.temixcore.as.data.repository.AstDataSourceRepository;
import com.xoftix.temixcore.common.data.type.TipoEstado;



@Service
public class AstDataSourceService{
	
	@Autowired 
	private AstDataSourceRepository astDataSourceRepository;
	
	
	
	public AstDataSource guardarAstDataSource(AstDataSource astDataSource) {
		
		return astDataSourceRepository.save(astDataSource);
	}
	
	public void eliminarAstDataSource(Long id) {		
		astDataSourceRepository.deleteById(id);
	}
	
	public AstDataSource consultarAstDataSource(Long id) {
		
		try {
			return astDataSourceRepository.findById(id).get();
		} catch (NoSuchElementException ex) {
			return null;
		}
	}
	
	public List<AstDataSource> listarAstDataSource(){
		return astDataSourceRepository.findAll();
	}
	
	public List<AstDataSource> listarAstDataSourcePorEstado(TipoEstado estado) {
		return astDataSourceRepository.findByEstado(estado);
	}
	
	
}
