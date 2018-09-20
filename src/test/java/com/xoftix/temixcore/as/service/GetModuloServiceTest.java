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

import com.xoftix.temixcore.as.data.GetModulo;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class GetModuloServiceTest {

	@Autowired
	private GetModuloService getModuloService;
	
	@Test
    public void contexLoads() throws Exception {
        assertNotNull(getModuloService);
    }
	
	@Test
	public void testGuardar() {
		/* AstDataSource astDataSourceGua = astDataSourceService.guardarAstDataSource(getAstDataSource());
		 AstDataSource astDataSourceCon = astDataSourceService.consultarAstDataSource(getAstDataSource().getId());
		 assertEquals(astDataSourceGua.getId(),astDataSourceCon.getId());*/
		 assertNotNull(getModuloService.guardarGetModulo(getModuloActivo()));
		 		 		
	}
	
	@Test
	public void testEliminar() {
		GetModulo GetModuloGua = getModuloService.guardarGetModulo(getModuloActivo());
		Long id = GetModuloGua.getId();
		getModuloService.eliminarGetModulo(id);
		GetModulo GetModuloCon = getModuloService.consultarGetModulo(id);
		assertNull(GetModuloCon);
		
	}	
	
	@Test
    public void testListar() throws Exception {
		Integer registros = 5;
		Long registrosActual = (long) getModuloService.listarGetModulo().size();
		for (int i = 0; i < registros; i++) {
			getModuloService.guardarGetModulo(getModuloActivo());
		}
		Long registrosFinal = (long) getModuloService.listarGetModulo().size();
		Long diferencia = registrosActual+registros;
		assertEquals(registrosFinal, diferencia);
    }
	
	@Test
	public void testListarPorEstado() {
		Integer registros = 5;
		for(int i=0;i < registros; i++) {
			getModuloService.guardarGetModulo(getModuloActivo());
		}
		for(int i=0;i < registros; i++) {
			getModuloService.guardarGetModulo(getModuloInactivo());
		}
		Long registrosTotal = (long) getModuloService.listarGetModulo().size();
		Long registrosActivo = (long) getModuloService.listarGetModuloPorEstado(TipoEstado.ACTIVO).size();
		
		assertNotEquals(registrosTotal, registrosActivo);
		
	}
	
	
	private GetModulo getModuloActivo() {
		GetModulo modulo = new GetModulo();
		modulo.setNombre("prueba getmodulo activo");
		modulo.setCodigo("002");
		modulo.setEstado(TipoEstado.ACTIVO);
		modulo.setDocumentacion("documentacion");
		return modulo;
	}
	
	private GetModulo getModuloInactivo() {
		GetModulo modulo = new GetModulo();
		modulo.setNombre("prueba getmodulo inactivo");
		modulo.setCodigo("003");
		modulo.setEstado(TipoEstado.INACTIVO);
		modulo.setDocumentacion("documentacion");
		return modulo;
	}
}
