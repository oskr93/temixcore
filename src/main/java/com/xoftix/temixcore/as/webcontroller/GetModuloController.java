package com.xoftix.temixcore.as.webcontroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoftix.temixcore.as.data.GetModulo;
import com.xoftix.temixcore.as.service.GetModuloService;
import com.xoftix.temixcore.common.data.type.TipoEstado;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="getModulo",tags="controlador de modulo")
@RequestMapping("/temixcore/get_modulo")
public class GetModuloController {
	
	@Autowired
	private GetModuloService getModuloService;	
	
	@PostMapping("/guardar")	
	@ApiOperation(value= "Guarda un modulo")
	public GetModulo Guardar(@RequestBody GetModulo getModulo){					
		
		return getModuloService.guardarGetModulo(getModulo);
		
		 
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ApiOperation(value= "Elimina un modulo")
	public void eliminar(@PathVariable("id") Long Id){			
		
		getModuloService.eliminarGetModulo(Id);		
		
	}
	
	@GetMapping("/consultar/{id}")	
	@ApiOperation(value= "Consulta un modulo")
	public GetModulo consultar(@PathVariable("id") Long Id){		
		
		return getModuloService.consultarGetModulo(Id);
	}
	
	@GetMapping("/listar")
	@ApiOperation(value= "Lista todos los modulos")
	public List<GetModulo> listar(){
		return getModuloService.listarGetModulo();
	}
	
	
	@GetMapping("/listar_por_estado/{estado}")
	@ApiOperation(value= "Lista modulos por estado")
	public List<GetModulo> listarPorEstado(@PathVariable("estado") TipoEstado estado){
		return getModuloService.listarGetModuloPorEstado(estado);		
	}
	
	

}
