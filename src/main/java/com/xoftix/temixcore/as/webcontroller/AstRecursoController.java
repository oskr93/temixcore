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

import com.xoftix.temixcore.as.data.AstRecurso;
import com.xoftix.temixcore.as.service.AstRecursoService;
import com.xoftix.temixcore.common.data.type.TipoEstado;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="temixcore", tags="controlador de astRecurso")
@RequestMapping("/temixcore/ast")

public class AstRecursoController {
	@Autowired
	private AstRecursoService astRecursoService;	
	
	@PostMapping("/guardar")	
	@ApiOperation(value= "Guarda un recurso")
	public AstRecurso Guardar(@RequestBody AstRecurso astRecurso){					
		
		return astRecursoService.guardarAstRecurso(astRecurso);
		
		 
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ApiOperation(value= "Elimina un recurso")
	public void eliminar(@PathVariable("id") Long Id){			
		
		astRecursoService.eliminarAstRecurso(Id);		
		
	}
	
	@GetMapping("/consultar/{id}")	
	@ApiOperation(value= "Consulta un recurso")
	public AstRecurso consultar(@PathVariable("id") Long Id){		
		
		return astRecursoService.consultarAstRecurso(Id);
	}
	
	@GetMapping("/listar")
	@ApiOperation(value= "Lista todos los recurso")
	public List<AstRecurso> listar(){
		return astRecursoService.listarAstRecurso();
	}
	
	
	@GetMapping("/listar_por_estado/{estado}")
	@ApiOperation(value= "Lista la informacion por estado de los recursos")
	public List<AstRecurso> listarPorEstado(@PathVariable("estado") TipoEstado estado){
		return astRecursoService.listarAstRecursoPorEstado(estado);		
	}

}
