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

import com.xoftix.temixcore.as.data.AstElemento;
import com.xoftix.temixcore.as.service.AstElementoService;
import com.xoftix.temixcore.common.data.type.TipoEstado;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="astDataSource",tags="controlador de astElemento")
@RequestMapping("/temixcore/ast_elemento")
public class AstElementoController {
	@Autowired
	private AstElementoService astElementoService;	
	
	@PostMapping("/guardar")	
	@ApiOperation(value= "Guarda un elemento")
	public AstElemento GuardarAstElemento(@RequestBody AstElemento astElemento){					
		
		return astElementoService.guardarAstElemento(astElemento);		 
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ApiOperation(value= "Elimina un elemento")
	public void eliminar(@PathVariable("id") Long Id){			
		
		astElementoService.eliminarAstElemento(Id);		
		
	}
	
	@GetMapping("/consultar/{id}")	
	@ApiOperation(value= "Consulta un elemento")
	public AstElemento consultar(@PathVariable("id") Long Id){		
		
		return astElementoService.consultarAstElemento(Id);
	}
	
	@GetMapping("/listar")
	@ApiOperation(value= "Lista todos los elementos")
	public List<AstElemento> listar(){
		return astElementoService.listarAstElemento();
	}
	
	@GetMapping("/listar_por_estado/{estado}")
	@ApiOperation(value= "Lista los  elementos por estado")
	public List<AstElemento> listarPorEstado(@PathVariable("estado") TipoEstado estado){
		return astElementoService.listarAstElementoPorEstado(estado);		
	}

	
}
