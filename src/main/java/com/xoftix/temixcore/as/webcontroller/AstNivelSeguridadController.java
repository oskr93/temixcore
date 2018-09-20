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

import com.xoftix.temixcore.as.data.AstNivelSeguridad;
import com.xoftix.temixcore.as.service.AstNivelSeguridadService;
import com.xoftix.temixcore.common.data.type.TipoEstado;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="temixcore", tags="controlador de nivel de seguridad")
@RequestMapping("/temixcore/ast_nivel_seguridad")
public class AstNivelSeguridadController {
	
	@Autowired
	private AstNivelSeguridadService astNivelSeguridadService;	
	
	@PostMapping("/guardar")	
	@ApiOperation(value= "Guarda un nivel de seguridad")
	public AstNivelSeguridad Guardar(@RequestBody AstNivelSeguridad astNivelSeguridad){					
		
		return astNivelSeguridadService.guardarAstNivelSeguridad(astNivelSeguridad);		 
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ApiOperation(value= "Elimina un nivel de seguridad")
	public void eliminar(@PathVariable("id") Long Id){			
		
		astNivelSeguridadService.eliminarAstNivelSeguridad(Id);		
		
	}
	
	@GetMapping("/consultar/{id}")	
	@ApiOperation(value= "Consulta un nivel de seguridad")
	public AstNivelSeguridad consultar(@PathVariable("id") Long Id){		
		
		return astNivelSeguridadService.consultarAstNivelSeguridad(Id);
	}
	
	@GetMapping("/listar")
	@ApiOperation(value= "Lista todos los niveles de seguridad")
	public List<AstNivelSeguridad> listar(){
		return astNivelSeguridadService.listarAstNivelSeguridad();
	}
	
	@GetMapping("/listar_por_estado/{estado}")
	@ApiOperation(value= "Lista los  niveles de seguridad por estado")
	public List<AstNivelSeguridad> listarPorEstado(@PathVariable("estado") TipoEstado estado){
		return astNivelSeguridadService.listarAstNivelSeguridadPorEstado(estado);		
	}

	
}
