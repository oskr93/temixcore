package com.xoftix.temixcore.as.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xoftix.temixcore.common.data.type.TipoEstado;

@Entity
@Table(schema="temixcore", name="ast_data_source")
public class AstDataSource {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;	
	@Column(name="codigo")
	private String codigo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="estado")
	@Enumerated(EnumType.STRING) 
	private TipoEstado estado;
	@Column(name="driver")
	private String driver;
	@Column(name="url")
	private String url;
	@Column(name="usuario")
	private String usuario;
	@Column(name="clave")
	private String clave;
	@Column(name="max_idle")
	private Long maxIdle;
	@Column(name="max_active")
	private Long maxActive;
	@Column(name="max_wait")
	private Long maxWait;
	@Column(name="query_validation")
	private String queryValidation;
	@Column(name="jdni")
	private String jdni;
	@Column(name="documentacion")
	private String documentacion;
	
		
	public AstDataSource() {
		super();
		
	}

	
	public AstDataSource(Long id, String codigo, String nombre, TipoEstado estado, String driver, String url,
			String usuario, String clave, Long maxIdle, Long maxActive, Long maxWait, String queryValidation,
			String jdni, String documentacion) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.driver = driver;
		this.url = url;
		this.usuario = usuario;
		this.clave = clave;
		this.maxIdle = maxIdle;
		this.maxActive = maxActive;
		this.maxWait = maxWait;
		this.queryValidation = queryValidation;
		this.jdni = jdni;
		this.documentacion = documentacion;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public String getDriver() {
		return driver;
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public Long getMaxIdle() {
		return maxIdle;
	}


	public void setMaxIdle(Long maxIdle) {
		this.maxIdle = maxIdle;
	}


	public Long getMaxActive() {
		return maxActive;
	}


	public void setMaxActive(Long maxActive) {
		this.maxActive = maxActive;
	}


	public Long getMaxWait() {
		return maxWait;
	}


	public void setMaxWait(Long maxWait) {
		this.maxWait = maxWait;
	}


	public String getQueryValidation() {
		return queryValidation;
	}


	public void setQueryValidation(String queryValidation) {
		this.queryValidation = queryValidation;
	}


	public String getJdni() {
		return jdni;
	}


	public void setJdni(String jdni) {
		this.jdni = jdni;
	}


	public String getDocumentacion() {
		return documentacion;
	}


	public void setDocumentacion(String documentacion) {
		this.documentacion = documentacion;
	}

	
	
	
	
}
