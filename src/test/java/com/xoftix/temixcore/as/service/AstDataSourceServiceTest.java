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

import com.xoftix.temixcore.as.data.AstDataSource;
import com.xoftix.temixcore.as.service.AstDataSourceService;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class AstDataSourceServiceTest {	


	@Autowired
	private AstDataSourceService astDataSourceService;
	
	@Test
    public void contexLoads() throws Exception {
        assertNotNull(astDataSourceService);
    }
	
	@Test
	public void testGuardar() {
		/* AstDataSource astDataSourceGua = astDataSourceService.guardarAstDataSource(getAstDataSource());
		 AstDataSource astDataSourceCon = astDataSourceService.consultarAstDataSource(getAstDataSource().getId());
		 assertEquals(astDataSourceGua.getId(),astDataSourceCon.getId());*/
		 assertNotNull(astDataSourceService.guardarAstDataSource(getAstDataSourceActivo()));
		 		 		
	}
	
	@Test
	public void testEliminar() {
		AstDataSource astDataSourceGua = astDataSourceService.guardarAstDataSource(getAstDataSourceActivo());
		Long id = astDataSourceGua.getId();
		astDataSourceService.eliminarAstDataSource(id);;
		AstDataSource astDataSourceCon = astDataSourceService.consultarAstDataSource(id);
		assertNull(astDataSourceCon);
		
	}	
	
	@Test
    public void testListar() throws Exception {
		Integer registros = 5;
		Long registrosActual = (long) astDataSourceService.listarAstDataSource().size();
		for (int i = 0; i < registros; i++) {
			astDataSourceService.guardarAstDataSource(getAstDataSourceActivo());
		}
		Long registrosFinal = (long) astDataSourceService.listarAstDataSource().size();
		Long diferencia = registrosActual+registros;
		assertEquals(registrosFinal, diferencia);
    }
	
	@Test
	public void testListarPorEstado() {
		Integer registros = 5;
		for(int i=0;i < registros; i++) {
			astDataSourceService.guardarAstDataSource(getAstDataSourceActivo());
		}
		for(int i=0;i < registros; i++) {
			astDataSourceService.guardarAstDataSource(getAstDataSourceInactivo());
		}
		Long registrosTotal = (long) astDataSourceService.listarAstDataSource().size();
		Long registrosActivo = (long) astDataSourceService.listarAstDataSourcePorEstado(TipoEstado.ACTIVO).size();
		
		assertNotEquals(registrosTotal, registrosActivo);
		
	}
	
	
	
	private AstDataSource getAstDataSourceActivo() {	
	
		AstDataSource dataSource = new AstDataSource();
		dataSource.setCodigo("0001");;
		dataSource.setNombre("prueba1");
		dataSource.setEstado(TipoEstado.ACTIVO);
		dataSource.setDriver("dfts");
		dataSource.setUrl("http");
		dataSource.setClave("clave");
		dataSource.setMaxActive((long)7845);
		dataSource.setMaxIdle((long)1278);;
		dataSource.setMaxWait((long)78245);
		dataSource.setQueryValidation("query");
		dataSource.setJdni("gfhg");
		dataSource.setDocumentacion("documentacion");
		dataSource.setUsuario("prueba1");
		
		return dataSource;
	}
	
	private AstDataSource getAstDataSourceInactivo() {	
		
		AstDataSource dataSource = new AstDataSource();
		dataSource.setCodigo("0001");;
		dataSource.setNombre("pruebaInactivo");
		dataSource.setEstado(TipoEstado.INACTIVO);
		dataSource.setDriver("dfts");
		dataSource.setUrl("http");
		dataSource.setClave("clave");
		dataSource.setMaxActive((long)7845);
		dataSource.setMaxIdle((long)1278);;
		dataSource.setMaxWait((long)78245);
		dataSource.setQueryValidation("query");
		dataSource.setJdni("gfhg");
		dataSource.setDocumentacion("documentacion");
		dataSource.setUsuario("pruebaInactivo");
		
		return dataSource;
	}
	
	

}
