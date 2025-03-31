package main.java.edu.leandro.iphone.models.impl;

import main.java.edu.leandro.iphone.models.abstracts.Navegador;

public class NavegadorInternet extends Navegador {
	
	public void listarPaginas() {
		for(int i=0; i<this.abas.length;i++) {
			if (this.abas[i] == null) {
				System.out.println("Nenhuma aba disponível");
				return;
			} 
			System.out.printf("%d - %s%n%n",i,this.abas[i]);
		}
	}
	
	public void digitarPagina() {
		System.out.println("Digite o site");
	}
	
}