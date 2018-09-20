package com.xoftix.temixcore.as.data.type;

public enum TipoNivelLog {
	APAGADO(0), FATAL(10), ERROR(20), WARNING(30), INFO(40), DEBUG(50);
	
	private Integer valor;
	
	private TipoNivelLog(Integer valor) {
		this.valor=valor;
	}

	public Integer getValor() {
		return valor;
	}

		
}
