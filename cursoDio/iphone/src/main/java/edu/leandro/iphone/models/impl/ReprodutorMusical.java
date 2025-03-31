package main.java.edu.leandro.iphone.models.impl;
import main.java.edu.leandro.iphone.models.abstracts.ReprodutorMidia;
import main.java.edu.leandro.iphone.models.enums.EstadoMidia;
import main.java.edu.leandro.iphone.models.impl.ReprodutorMusical;
public class ReprodutorMusical extends ReprodutorMidia{
	
	public ReprodutorMusical() {
		this.setMusicas();
	}
	
	private void setMusicas () {
		this.todasMidias[0] = "Musica 1";
		this.todasMidias[1] = "Musica 2";
		this.todasMidias[2] = "Musica 3";
		this.todasMidias[3] = "Musica 4";
		this.todasMidias[4] = "Musica 5";
	}
	
	public void selecionarMidia(int midia) {
		this.midiaAtual = this.todasMidias[midia];
		System.out.printf("Tocando música %s%n%n",this.midiaAtual);
	}
	
	public void pularProxima() {
		if (this.midiaAtual.equals("")) {
			System.out.printf("Nenhuma música atual%n%n");
			return;
		}
		int posicao = -1;
		for(int i=0;i<this.todasMidias.length;i++){
			if (this.todasMidias[i] == this.midiaAtual) {
				posicao = i;
				break;
			}
		}
		
		if (posicao >= 0 && posicao <= this.todasMidias.length -1) {
			this.midiaAtual = this.todasMidias[posicao+1];
		} else {
			this.midiaAtual = this.todasMidias[0];
		}
		System.out.printf("Tocando próxima música: %s%n%n",this.midiaAtual);
	}
	
	public void listarMusica () {
		if (this.midiaAtual.equals("")) {
			System.out.printf("Nenhuma mídia em reprodução");
		}
		System.out.printf("Tocando a música %s%n%n",this.midiaAtual);
		System.out.printf("Escolha o número da musica%n%n");
		for (int i=0; i<this.todasMidias.length; i++) {
			System.out.printf("%d - %s.mp3%n",i,this.todasMidias[i]);
		}
	}
}