package main.java.edu.leandro.iphone.models.device;
import java.util.Scanner;
import main.java.edu.leandro.iphone.models.impl.ReprodutorMusical;
public class Musica {
	
	private ReprodutorMusical reprodutormusical;
	private Scanner scan;
	public Musica (Scanner scan,ReprodutorMusical reprodutormusical) {
		this.scan = scan;
		this.reprodutormusical = reprodutormusical;
		this.reprodutorMusica(this.scan, this.reprodutormusical);
	}
	
	public void reprodutorMusica(Scanner scan, ReprodutorMusical reprodutormusical) {
		int oper = 0;
		while(oper != 8) {
			System.out.println("======Reprodutor musical======");
			System.out.println("1 - Escolher uma música");
			System.out.println("2 - Tocar música existente");
			System.out.println("3 - Pular para a próxima");
			System.out.println("4 - Pausar");
			System.out.println("5 - Parar");
			System.out.println("6 - Aumentar volume");
			System.out.println("7 - Diminuir volume");
			System.out.println("8 - Sair");
			oper = scan.nextInt();
			switch (oper) {
				case 1:
					this.reprodutormusical.listarMusica();
					int musica = scan.nextInt();
					if (musica > 4) {
						System.out.println("Você só pode escolher até o número 4");
						break;
					}
					this.reprodutormusical.selecionarMidia(musica);
					break;
				case 2:
					this.reprodutormusical.tocar();
					break;
				case 3:
					this.reprodutormusical.pularProxima();
					break;
				case 4:
					this.reprodutormusical.pausar();
					break;
				case 5:
					this.reprodutormusical.parar();
					break;
				case 6:
					this.reprodutormusical.aumentarVolume();
					break;
				case 7:
					this.reprodutormusical.diminuirVolume();
					break;
				default:
					System.out.println("Opção não válida");
			}
				
		}
	}
	
}