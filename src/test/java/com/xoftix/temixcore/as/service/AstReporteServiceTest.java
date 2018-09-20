package com.xoftix.temixcore.as.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xoftix.temixcore.as.data.AstReporte;
import com.xoftix.temixcore.as.data.type.TipoOrigen;

public class AstReporteServiceTest {


	@Autowired
	private AstReporteService astReporteService;
	
	@Test
    public void contexLoads() throws Exception {
        assertNotNull(astReporteService);
    }
	
	@Test
	public void testGuardar() {
		/* AstDataSource astDataSourceGua = astDataSourceService.guardarAstDataSource(getAstDataSource());
		 AstDataSource astDataSourceCon = astDataSourceService.consultarAstDataSource(getAstDataSource().getId());
		 assertEquals(astDataSourceGua.getId(),astDataSourceCon.getId());*/
		 assertNotNull(astReporteService.guardarAstReporte(getAstReporte()));
		 		 		
	}
	
	@Test
	public void testEliminar() {
		AstReporte GetModuloGua = astReporteService.guardarAstReporte(getAstReporte());
		Long id = GetModuloGua.getId();
		astReporteService.eliminarAstReporte(id);
		AstReporte GetModuloCon = astReporteService.consultarAstReporte(id);
		assertNull(GetModuloCon);
		
	}	
	
	@Test
    public void testListar() throws Exception {
		Integer registros = 5;
		Long registrosActual = (long) astReporteService.listarAstReporte().size();
		for (int i = 0; i < registros; i++) {
			astReporteService.guardarAstReporte(getAstReporte());
		}
		Long registrosFinal = (long) astReporteService.listarAstReporte().size();
		Long diferencia = registrosActual+registros;
		assertEquals(registrosFinal, diferencia);
    }
	private AstReporte getAstReporte() {
		AstReporte astReporte = new AstReporte();
		astReporte.setExportarCsv("csv");
		astReporte.setExportarHtml("html");
		astReporte.setExportarImg("img");
		astReporte.setExportarPdf("pdf");
		astReporte.setExportarXls("xls");
		astReporte.setOrigen(TipoOrigen.CONSULTA);
		astReporte.setCosultaSql("select");
		astReporte.setDataSource(null);		
		return astReporte;
	}
	
	
	
	

}
