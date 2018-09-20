package com.xoftix.temixcore.as.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.xoftix.temixcore.as.data.AstNivelSeguridad;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class AstNivelSeguridadServiceTest {

	@Autowired
	private AstNivelSeguridadService astNivelSeguridadService;
	
	@Test
    public void contexLoads() throws Exception {
        assertNotNull(astNivelSeguridadService);
    }
	
	@Test
	public void testGuardar() {	
		
		 assertNotNull(astNivelSeguridadService.guardarAstNivelSeguridad(getAstNivelSeguridadActivo()));
		 		 		
	}	
	
	@Test
	public void testEliminar() {
		AstNivelSeguridad astNivelSeguridadGua = astNivelSeguridadService.guardarAstNivelSeguridad(getAstNivelSeguridadActivo());
		Long id = astNivelSeguridadGua.getId();
		astNivelSeguridadService.eliminarAstNivelSeguridad(id);
		AstNivelSeguridad astNivelSeguridadCon = astNivelSeguridadService.consultarAstNivelSeguridad(id);
		assertNull(astNivelSeguridadCon);
		
	}	
	
	@Test
    public void testListar() throws Exception {
		Integer registros = 5;
		Long registrosActual = (long) astNivelSeguridadService.listarAstNivelSeguridad().size();
		for (int i = 0; i < registros; i++) {
			astNivelSeguridadService.guardarAstNivelSeguridad(getAstNivelSeguridadActivo());
		}
		Long registrosFinal = (long) astNivelSeguridadService.listarAstNivelSeguridad().size();
		Long diferencia = registrosActual+registros;
		assertEquals(registrosFinal, diferencia);
    }
	
	@Test
	public void testListarPorEstado() {
		Integer registros = 5;
		for(int i=0;i < registros; i++) {
			astNivelSeguridadService.guardarAstNivelSeguridad(getAstNivelSeguridadActivo());
		}
		for(int i=0;i < registros; i++) {
			astNivelSeguridadService.guardarAstNivelSeguridad(getAstNivelSeguridadInactivo());
		}
		Long registrosTotal = (long) astNivelSeguridadService.listarAstNivelSeguridad().size();
		Long registrosActivo = (long) astNivelSeguridadService.listarAstNivelSeguridadPorEstado(TipoEstado.ACTIVO).size();
		
		assertNotEquals(registrosTotal, registrosActivo);
		
	}
	
	
	public AstNivelSeguridad getAstNivelSeguridadActivo() {
		AstNivelSeguridad astNivelSeguridad = new AstNivelSeguridad();
		astNivelSeguridad.setCodigo("002");
		astNivelSeguridad.setControlCaracteres(true);
		astNivelSeguridad.setControlReintentos(false);
		astNivelSeguridad.setControlReutilizacion(true);
		astNivelSeguridad.setControlVencimiento(true);
		astNivelSeguridad.setDocumentacion("documentacion");
		astNivelSeguridad.setEstado(TipoEstado.ACTIVO);
		astNivelSeguridad.setFactorReintentos(458);
		astNivelSeguridad.setFactorReutilizacion(789);
		astNivelSeguridad.setFactorVencimiento(4523);
		astNivelSeguridad.setLongitudMaxima((long)785);
		astNivelSeguridad.setNombre("prueba nivel de seguridad activo");
		astNivelSeguridad.setRequiereEspeciales(true);
		astNivelSeguridad.setRequiereMayusculas(false);
		astNivelSeguridad.setRequiereMinusculas(true);
		astNivelSeguridad.setRequiereNumeros(false);
		return astNivelSeguridad;
		
	}
	
	public AstNivelSeguridad getAstNivelSeguridadInactivo() {
		AstNivelSeguridad astNivelSeguridad = new AstNivelSeguridad();
		astNivelSeguridad.setCodigo("003");
		astNivelSeguridad.setControlCaracteres(true);
		astNivelSeguridad.setControlReintentos(false);
		astNivelSeguridad.setControlReutilizacion(true);
		astNivelSeguridad.setControlVencimiento(true);
		astNivelSeguridad.setDocumentacion("documentacion");
		astNivelSeguridad.setEstado(TipoEstado.INACTIVO);
		astNivelSeguridad.setFactorReintentos(458);
		astNivelSeguridad.setFactorReutilizacion(789);
		astNivelSeguridad.setFactorVencimiento(4523);
		astNivelSeguridad.setLongitudMaxima((long)785);
		astNivelSeguridad.setNombre("prueba nivel de seguridad inactivo");
		astNivelSeguridad.setRequiereEspeciales(true);
		astNivelSeguridad.setRequiereMayusculas(false);
		astNivelSeguridad.setRequiereMinusculas(true);
		astNivelSeguridad.setRequiereNumeros(false);
		return astNivelSeguridad;
		
	}
	
	

}
