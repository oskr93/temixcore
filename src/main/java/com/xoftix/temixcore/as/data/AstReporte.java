package com.xoftix.temixcore.as.data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.xoftix.temixcore.as.data.type.TipoOrigen;

@Entity
@Table(schema="temixcore", name="ast_reporte")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AstReporte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ast_data_source",referencedColumnName="id")
	private AstDataSource dataSource;
	@Enumerated(EnumType.STRING) 
	private TipoOrigen origen;
	private String cosultaSql;
	private String exportarPdf;
	private String exportarXls;
	private String exportarCsv;
	private String exportarHtml;
	private String exportarImg;
	
	
	
	public AstReporte() {
		super();
		
	}


	public AstReporte(Long id, AstDataSource dataSource, TipoOrigen origen, String cosultaSql, String exportarPdf,
			String exportarXls, String exportarCsv, String exportarHtml, String exportarImg) {
		super();
		this.id = id;
		this.dataSource = dataSource;
		this.origen = origen;
		this.cosultaSql = cosultaSql;
		this.exportarPdf = exportarPdf;
		this.exportarXls = exportarXls;
		this.exportarCsv = exportarCsv;
		this.exportarHtml = exportarHtml;
		this.exportarImg = exportarImg;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public AstDataSource getDataSource() {
		return dataSource;
	}



	public void setDataSource(AstDataSource dataSource) {
		this.dataSource = dataSource;
	}



	public TipoOrigen getOrigen() {
		return origen;
	}



	public void setOrigen(TipoOrigen origen) {
		this.origen = origen;
	}



	public String getCosultaSql() {
		return cosultaSql;
	}



	public void setCosultaSql(String cosultaSql) {
		this.cosultaSql = cosultaSql;
	}



	public String getExportarPdf() {
		return exportarPdf;
	}



	public void setExportarPdf(String exportarPdf) {
		this.exportarPdf = exportarPdf;
	}



	public String getExportarXls() {
		return exportarXls;
	}



	public void setExportarXls(String exportarXls) {
		this.exportarXls = exportarXls;
	}



	public String getExportarCsv() {
		return exportarCsv;
	}



	public void setExportarCsv(String exportarCsv) {
		this.exportarCsv = exportarCsv;
	}



	public String getExportarHtml() {
		return exportarHtml;
	}



	public void setExportarHtml(String exportarHtml) {
		this.exportarHtml = exportarHtml;
	}



	public String getExportarImg() {
		return exportarImg;
	}



	public void setExportarImg(String exportarImg) {
		this.exportarImg = exportarImg;
	}
	
	
	
	
	
}
