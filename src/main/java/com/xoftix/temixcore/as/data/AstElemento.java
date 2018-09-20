package com.xoftix.temixcore.as.data;

import javax.persistence.Column;
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
import com.xoftix.temixcore.common.data.type.TipoEstado;

@Entity
@Table(schema="temixcore", name="ast_elemento")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AstElemento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ast_recurso",referencedColumnName="id")
	private AstRecurso recurso;
	@Column(name="codigo")
	private String codigo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="estado")
	@Enumerated(EnumType.STRING) 
	private TipoEstado estado;
	@Column(name="documentacion")
	private String documentacion;
	
	
	
	public AstElemento() {
		super();
		
	}
	public AstElemento(java.lang.Long id, AstRecurso recurso, String codigo, String nombre, TipoEstado estado, String documentacion) {
		super();
		this.id = id;
		this.recurso = recurso;
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.documentacion = documentacion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public AstRecurso getRecurso() {
		return recurso;
	}
	public void setRecurso(AstRecurso recurso) {
		this.recurso = recurso;
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
	public String getDocumentacion() {
		return documentacion;
	}
	public void setDocumentacion(String documentacion) {
		this.documentacion = documentacion;
	}
	
	
	
	
}
