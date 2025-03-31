package main.java.edu.leandro.iphone.models.abstracts;
import main.java.edu.leandro.iphone.models.enums.EstadoMidia;
public abstract class ReprodutorMidia {
	
	protected EstadoMidia estado;
	protected  int volume;
	protected  String midiaAtual = "";
	protected  String[] todasMidias = new String[5];
	
  public void tocar() {
		if (this.midiaAtual.equals("")) {
			System.out.printf("Nenhuma mídia em reprodução");
			return;
		}
		System.out.printf("Tocando a música %s%n%n",this.midiaAtual);
		
	}
	
	public void aumentarVolume() {
		if (this.volume == 10) {
			System.out.println("O volume está no máximo");
			return ;
		}
		this.volume += 1;
		System.out.printf("Aumentando para volume %d",this.volume);
	}
	
	public void diminuirVolume () {
		if (this.volume == 0) {
			System.out.println("O volume está no mínimo");
			return;
		}
		this.volume -= 1;
		System.out.printf("Diminuindo o volume para %d",this.volume);
	}
	
	public void pausar() {
		if (this.midiaAtual.equals("")) {
			System.out.printf("Nenhuma mídia em reprodução");
			return;
		}
		System.out.printf("Música %s pausada%n%n",this.midiaAtual);
	}
	
	public void parar() {
		if (this.midiaAtual.equals("")) {
			System.out.printf("Nenhuma mídia em reprodução%n%n");
			return;
		}
		System.out.printf("Música %s parada%n%n",this.midiaAtual);
		this.midiaAtual = "";
	}
	
}