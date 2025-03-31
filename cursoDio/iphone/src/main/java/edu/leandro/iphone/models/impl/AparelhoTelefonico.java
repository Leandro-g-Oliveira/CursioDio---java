package main.java.edu.leandro.iphone.models.impl;
import main.java.edu.leandro.iphone.models.abstracts.Telefone;
import main.java.edu.leandro.iphone.models.impl.AparelhoTelefonico;

public class AparelhoTelefonico extends Telefone {
	
	public AparelhoTelefonico() {
		this.setContatos();
		this.setCorreioVoz();
	}
	
	private void setContatos() {
		this.agendaContatos[0] = "Contato 1";
		this.agendaContatos[1] = "Contato 2";
		this.agendaContatos[2] = "Contato 3";
		this.agendaContatos[3] = "Contato 4";
		this.agendaContatos[4] = "Contato 5";
	}
	
	private void setCorreioVoz() {
		this.correioDeVoz[0] = "Correio de Voz 1";
		this.correioDeVoz[1] = "Correio de Voz 2";
		this.correioDeVoz[2] = "Correio de Voz 3";
	}
	
	public void discarNumero() {
		if (!this.chamadaAtual.equals("")) {
			System.out.printf("Você já está em uma chamada, com %s.%nTermine a chamada para fazer outra%n%n",this.chamadaAtual);
			return;
		}
		System.out.printf("Digite o número para ligar%n");
	}
	
	public void escolherCorreioVoz() {
		if (!this.chamadaAtual.equals("")) {
			System.out.printf("Você já está em uma chamada, com %s.%nTermine a chamada para fazer outra%n%n",this.chamadaAtual);
			return;
		}
		System.out.println("Escolha o correio de voz para ouvir");
		for (int i=0; i<this.correioDeVoz.length;i++){
			System.out.printf("%d - %s%n",i,this.correioDeVoz[i]);
		}
	}
	
	public void selecRmFavoritos() {
		for(int i=0; i<this.favoritos.length;i++) {
			System.out.printf("Remover favoritos: %n%n");
			System.out.printf("%d - %s%n",i,this.favoritos[i]);
		}
	}
	
	public void selecContFavoritos(){
		this.listarContatos();
	}
	
}