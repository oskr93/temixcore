package com.xoftix.temixcore.as.data;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@Entity
@Table(schema="temixcore", name="ast_nivel_seguridad")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AstNivelSeguridad {
	
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
	@Column(name="longitud_maxima")
	private Long longitudMaxima;
	@Column(name="control_vencimiento")
	private Boolean controlVencimiento;
	@Column(name="factor_vencimiento")
	private Integer factorVencimiento;
	@Column(name="control_reutilizacion")
	private Boolean controlReutilizacion;
	@Column(name="factor_reutilizacion")
	private Integer factorReutilizacion;
	@Column(name="control_reintentos")
	private Boolean controlReintentos;
	@Column(name="factor_reintentos")
	private Integer factorReintentos;
	@Column(name="control_caracteres")
	private Boolean controlCaracteres;
	@Column(name="requiere_mayusculas")
	private Boolean requiereMayusculas;
	@Column(name="requiere_minusculas")
	private Boolean requiereMinusculas;
	@Column(name="requiere_numeros")
	private Boolean requiereNumeros;
	@Column(name="requiere_especiales")
	private Boolean requiereEspeciales;
	@Column(name="documentacion")
	private String documentacion;
	
	public AstNivelSeguridad() {
		super();
		
	}
	public AstNivelSeguridad(Long id, String codigo, String nombre, TipoEstado estado, Long longitudMaxima,
			Boolean controlVencimiento, Integer factorVencimiento, Boolean controlReutilizacion,
			Integer factorReutilizacion, Boolean controlReintentos, Integer factorReintentos, Boolean controlCaracteres,
			Boolean requiereMayusculas, Boolean requiereMinusculas, Boolean requiereNumeros, Boolean requiereEspeciales,
			String documentacion) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.longitudMaxima = longitudMaxima;
		this.controlVencimiento = controlVencimiento;
		this.factorVencimiento = factorVencimiento;
		this.controlReutilizacion = controlReutilizacion;
		this.factorReutilizacion = factorReutilizacion;
		this.controlReintentos = controlReintentos;
		this.factorReintentos = factorReintentos;
		this.controlCaracteres = controlCaracteres;
		this.requiereMayusculas = requiereMayusculas;
		this.requiereMinusculas = requiereMinusculas;
		this.requiereNumeros = requiereNumeros;
		this.requiereEspeciales = requiereEspeciales;
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
	public Long getLongitudMaxima() {
		return longitudMaxima;
	}
	public void setLongitudMaxima(Long longitudMaxima) {
		this.longitudMaxima = longitudMaxima;
	}
	public Boolean getControlVencimiento() {
		return controlVencimiento;
	}
	public void setControlVencimiento(Boolean controlVencimiento) {
		this.controlVencimiento = controlVencimiento;
	}
	public Integer getFactorVencimiento() {
		return factorVencimiento;
	}
	public void setFactorVencimiento(Integer factorVencimiento) {
		this.factorVencimiento = factorVencimiento;
	}
	public Boolean getControlReutilizacion() {
		return controlReutilizacion;
	}
	public void setControlReutilizacion(Boolean controlReutilizacion) {
		this.controlReutilizacion = controlReutilizacion;
	}
	public Integer getFactorReutilizacion() {
		return factorReutilizacion;
	}
	public void setFactorReutilizacion(Integer factorReutilizacion) {
		this.factorReutilizacion = factorReutilizacion;
	}
	public Boolean getControlReintentos() {
		return controlReintentos;
	}
	public void setControlReintentos(Boolean controlReintentos) {
		this.controlReintentos = controlReintentos;
	}
	public Integer getFactorReintentos() {
		return factorReintentos;
	}
	public void setFactorReintentos(Integer factorReintentos) {
		this.factorReintentos = factorReintentos;
	}
	public Boolean getControlCaracteres() {
		return controlCaracteres;
	}
	public void setControlCaracteres(Boolean controlCaracteres) {
		this.controlCaracteres = controlCaracteres;
	}
	public Boolean getRequiereMayusculas() {
		return requiereMayusculas;
	}
	public void setRequiereMayusculas(Boolean requiereMayusculas) {
		this.requiereMayusculas = requiereMayusculas;
	}
	public Boolean getRequiereMinusculas() {
		return requiereMinusculas;
	}
	public void setRequiereMinusculas(Boolean requiereMinusculas) {
		this.requiereMinusculas = requiereMinusculas;
	}
	public Boolean getRequiereNumeros() {
		return requiereNumeros;
	}
	public void setRequiereNumeros(Boolean requiereNumeros) {
		this.requiereNumeros = requiereNumeros;
	}
	public Boolean getRequiereEspeciales() {
		return requiereEspeciales;
	}
	public void setRequiereEspeciales(Boolean requiereEspeciales) {
		this.requiereEspeciales = requiereEspeciales;
	}
	public String getDocumentacion() {
		return documentacion;
	}
	public void setDocumentacion(String documentacion) {
		this.documentacion = documentacion;
	}
	
	
}
