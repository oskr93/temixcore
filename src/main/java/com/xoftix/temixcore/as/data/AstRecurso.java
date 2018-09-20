package com.xoftix.temixcore.as.data;

import java.util.Date;

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
import com.xoftix.temixcore.as.data.type.TipoRecurso;
import com.xoftix.temixcore.common.data.type.TipoEstado;


@Entity
@Table(schema="temixcore", name="ast_recurso")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AstRecurso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="get_modulo",referencedColumnName="id")
	private GetModulo modulo;
	private String codigo;
	private String nombre;
	@Enumerated(EnumType.STRING) 
	private TipoEstado estado;
	@Enumerated(EnumType.STRING) 
	private TipoRecurso tipo;
	private String recurso;
	private Integer nivelLog;
	private Date fechaCreacion;
	private Date fechaUltimaModificacion;
	private Boolean reporteRelacionado;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ast_reporte",referencedColumnName="id")
	private AstReporte recursoReporte;
	private Boolean requiereParametros;
	private String documentacion;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ast_recurso",referencedColumnName="id")
	private AstRecurso astRecurso;
	
	public AstRecurso() {
		super();
	}
	
	

	public AstRecurso(Long id, GetModulo modulo, String codigo, String nombre, TipoEstado estado, TipoRecurso tipo,
			String recurso, Integer nivelLog, Date fechaCreacion, Date fechaUltimaModificacion,
			Boolean reporteRelacionado, AstReporte recursoReporte, Boolean requiereParametros, String documentacion,
			AstRecurso astRecurso) {
		super();
		this.id = id;
		this.modulo = modulo;
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.tipo = tipo;
		this.recurso = recurso;
		this.nivelLog = nivelLog;
		this.fechaCreacion = fechaCreacion;
		this.fechaUltimaModificacion = fechaUltimaModificacion;
		this.reporteRelacionado = reporteRelacionado;
		this.recursoReporte = recursoReporte;
		this.requiereParametros = requiereParametros;
		this.documentacion = documentacion;
		this.astRecurso = astRecurso;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GetModulo getModulo() {
		return modulo;
	}

	public void setModulo(GetModulo modulo) {
		this.modulo = modulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoEstado getEstado() {
		return estado;
	}

	public void setEstado(TipoEstado estado) {
		this.estado = estado;
	}

	public TipoRecurso getTipo() {
		return tipo;
	}

	public void setTipo(TipoRecurso tipo) {
		this.tipo = tipo;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public Integer getNivelLog() {
		return nivelLog;
	}

	public void setNivelLog(Integer nivelLong) {
		this.nivelLog = nivelLong;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}

	public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}

	public Boolean getReporteRelacionado() {
		return reporteRelacionado;
	}

	public void setReporteRelacionado(Boolean reporteRelacionado) {
		this.reporteRelacionado = reporteRelacionado;
	}

	public AstReporte getRecursoReporte() {
		return recursoReporte;
	}

	public void setRecursoReporte(AstReporte recursoReporte) {
		this.recursoReporte = recursoReporte;
	}

	public Boolean getRequiereParametros() {
		return requiereParametros;
	}

	public void setRequiereParametros(Boolean requiereParametros) {
		this.requiereParametros = requiereParametros;
	}

	public String getDocumentacion() {
		return documentacion;
	}

	public void setDocumentacion(String documentacion) {
		this.documentacion = documentacion;
	}

	public AstRecurso getAstRecurso() {
		return astRecurso;
	}

	public void setAstRecurso(AstRecurso astRecurso) {
		this.astRecurso = astRecurso;
	}
	
	
	
	
	
}
