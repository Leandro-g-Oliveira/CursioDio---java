package main.java.edu.leandro.iphone.models.enums;

import main.java.edu.leandro.iphone.models.enums.EstadoMidia;

public enum EstadoMidia {
	TOCANDO("tocando"),
	PAUSADA("pausada"),
	PARADA("parada");
	
	private String estado;
	
	EstadoMidia(String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
}