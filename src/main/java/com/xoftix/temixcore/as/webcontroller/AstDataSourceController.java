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

import com.xoftix.temixcore.as.data.AstDataSource;
import com.xoftix.temixcore.as.service.AstDataSourceService;
import com.xoftix.temixcore.common.data.type.TipoEstado;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="astDataSource",tags="controlador de dataSource")
@RequestMapping("/temixcore/ast_data_source")
public class AstDataSourceController {
	@Autowired
	private AstDataSourceService astDataSourceService;	
	
	@PostMapping("/guardar")	
	@ApiOperation(value= "Guarda un dataSource")
	public AstDataSource Guardar(@RequestBody AstDataSource astDataSource){					
		
		return astDataSourceService.guardarAstDataSource(astDataSource);		 
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ApiOperation(value= "Elimina un dataSource")
	public void eliminar(@PathVariable("id") Long Id){			
		
		astDataSourceService.eliminarAstDataSource(Id);		
		
	}
	
	@GetMapping("/consultar/{id}")	
	@ApiOperation(value= "Consulta un dataSource")
	public AstDataSource consultar(@PathVariable("id") Long Id){		
		
		return astDataSourceService.consultarAstDataSource(Id);
	}
	
	@GetMapping("/listar")
	@ApiOperation(value= "Lista todos los dataSource")
	public List<AstDataSource> listar(){
		return astDataSourceService.listarAstDataSource();
	}	
	
	@GetMapping("/listar_por_estado/{estado}")
	@ApiOperation(value= "Lista los dataSource por estado")
	public List<AstDataSource> listarPorEstado(@PathVariable("estado") TipoEstado estado){
		return astDataSourceService.listarAstDataSourcePorEstado(estado);		
	}

	
	
	
}

