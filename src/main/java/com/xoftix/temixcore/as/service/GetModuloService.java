package com.xoftix.temixcore.as.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoftix.temixcore.as.data.GetModulo;
import com.xoftix.temixcore.as.data.repository.GetModuloRepository;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@Service
public class GetModuloService{
	@Autowired 
	private GetModuloRepository getModuloRepository;
	
	
	
	public GetModulo guardarGetModulo(GetModulo getModulo) {
		
		return getModuloRepository.save(getModulo);
	}
	
	public void eliminarGetModulo(Long id) {		
		getModuloRepository.deleteById(id);
	}
	
	public GetModulo consultarGetModulo(Long id) {
		
		try {
			return getModuloRepository.findById(id).get();
		} catch (NoSuchElementException ex) {
			return null;
		}
	}
	
	public List<GetModulo> listarGetModulo(){
		return getModuloRepository.findAll();
	}

	public List<GetModulo> listarGetModuloPorEstado(TipoEstado estado){
		return getModuloRepository.findByEstado(estado);
	}
	
}
