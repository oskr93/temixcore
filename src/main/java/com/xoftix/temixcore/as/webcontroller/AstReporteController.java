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

import com.xoftix.temixcore.as.data.AstReporte;
import com.xoftix.temixcore.as.service.AstReporteService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="astReporteController",tags="controlador de astReporte")
@RequestMapping("/temixcore/ast_reporte")
public class AstReporteController {
	@Autowired
	private AstReporteService astReporteService;	
	
	@PostMapping("/guardar")	
	@ApiOperation(value= "Guarda un reporte")
	public AstReporte Guardar(@RequestBody AstReporte astReporte){					
		
		return astReporteService.guardarAstReporte(astReporte);
		
		 
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ApiOperation(value= "Elimina un reporte")
	public void eliminar(@PathVariable("id") Long Id){			
		
		astReporteService.eliminarAstReporte(Id);		
		
	}
	
	@GetMapping("/consultar/{id}")	
	@ApiOperation(value= "Consulta un reporte")
	public AstReporte consultar(@PathVariable("id") Long Id){		
		
		return astReporteService.consultarAstReporte(Id);
	}
	
	@GetMapping("/listar")
	@ApiOperation(value= "Lista todos los reportes")
	public List<AstReporte> listar(){
		return astReporteService.listarAstReporte();
	}
}
