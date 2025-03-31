package main.java.edu.leandro.iphone.models.enums;

import main.java.edu.leandro.iphone.models.enums.EstadoChamada;

public enum EstadoChamada {
	ATIVA("ativa"),
	EM_ESPERA("em espera"),
	FINALIZADA("finalizada");
	
	private String estado;
	
	EstadoChamada(String estado){
		this.estado = estado;
	}
	
	public String getEstado () {
		return this.estado;
	}
	
}