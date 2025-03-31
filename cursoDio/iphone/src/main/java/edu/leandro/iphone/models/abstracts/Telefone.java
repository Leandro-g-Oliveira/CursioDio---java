package main.java.edu.leandro.iphone.models.abstracts;
import main.java.edu.leandro.iphone.models.enums.EstadoChamada;
//import main.java.edu.leandro.iphone.models.device.Video;

public abstract class  Telefone {
	protected String[] correioDeVoz = new String[3];
	protected String[] agendaContatos = new String[5];
	protected String[] favoritos = new String[5];
	protected String chamadaAtual = "";
	protected String correioVozAtual = "";
	
	public void ligar(String numero) {
		if (!this.chamadaAtual.equals("")) {
			System.out.printf("Você já está em uma chamada, com %s.%nTermine a chamada para fazer outra%n%n",this.chamadaAtual);
			return;
		}
		this.chamadaAtual = numero;
		System.out.printf("Ligação realizada! Chamada com %s%n%n",this.chamadaAtual);
	}
	public void atender() {
		if (!this.chamadaAtual.equals("")) {
			System.out.printf("Você já está em uma chamada, com %s.%nTermine a chamada para fazer outra%n%n",this.chamadaAtual);
			return;
		}
		System.out.printf("Atendendo ligação");
	}
	public void iniciarCorreioVoz(int opcao) {
		if (!this.chamadaAtual.equals("")) {
			System.out.printf("Você já está em uma chamada, com %s.%nTermine a chamada para fazer outra%n%n",this.chamadaAtual);
			return;
		}
		this.correioVozAtual = this.correioDeVoz[opcao];
		System.out.printf("%s%n",this.correioVozAtual);
	}
	
	public void listarContatos() {
		if (!this.chamadaAtual.equals("")) {
			System.out.printf("Você já está em uma chamada, com %s.%nTermine a chamada para fazer outra%n%n",this.chamadaAtual);
			return;
		}
		System.out.println("Escolha o contato");
		for (int i=0; i<this.agendaContatos.length;i++) {
			System.out.printf("%d - %s%n",i,this.agendaContatos[i]);
		}
	}
	
	public void ligarViaAgenda(int contato) {
		this.chamadaAtual = this.agendaContatos[contato];
		System.out.printf("Em ligação com %s%n%n",this.chamadaAtual);
	}
	
	public void adicionarFavoritos(int contato) {
		String contatoAdd = this.agendaContatos[contato];
		for(int i=0; i<this.favoritos.length;i++) {
			if (contatoAdd.equals(this.favoritos[i])) {
				System.out.printf("Contato %s já está favoritado%n%n",this.agendaContatos[contato]);
				return;
			}
			if (this.favoritos[i] == null) {
				favoritos[i] = contatoAdd;
				System.out.printf("Contato %s adicionado aos favoritos%n%n",contatoAdd);
				return;
			}
		}
		System.out.println("Não há mais espaços para favoritos");
	}
	
	
  public void removerFavoritos(int contato) {
    String contatoRemover = this.agendaContatos[contato];
    boolean encontrado = false;
    
    for (int i = 0; i < this.favoritos.length; i++) {
        if (this.favoritos[i].equals(contatoRemover)) {
            this.favoritos[i] = null;
            encontrado = true;
        }
    }
    
    if (!encontrado) {
        System.out.printf("Contato %s não está nos favoritos%n%n", contatoRemover);
    }
	}
}
	
