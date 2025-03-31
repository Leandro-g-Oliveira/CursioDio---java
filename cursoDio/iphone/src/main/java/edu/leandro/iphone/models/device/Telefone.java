package main.java.edu.leandro.iphone.models.device;

import main.java.edu.leandro.iphone.models.impl.AparelhoTelefonico;
import java.util.Scanner;
public class Telefone {
	private AparelhoTelefonico aparelhotelefonico;
	private Scanner scan;
	
	public Telefone (Scanner scan,AparelhoTelefonico aparelhotelefonico) {
		this.aparelhotelefonico = aparelhotelefonico;
		this.scan = scan;
		this.opcoesTelefone();
	}
	
	public void opcoesTelefone() {
		int oper = 0;
		while (oper != 7) {
			System.out.println("======Telefone======");
			System.out.println("1 - Discar número");
			System.out.println("2 - Selecionar na agenda");
			System.out.println("3 - Atender");
			System.out.println("4 - Iniciar correio de voz");
			System.out.println("5 - Adicionar contato aos favoritos");
			System.out.println("6 - Remover contato dos favoritos");
			System.out.println("7 - Sair");
			oper = scan.nextInt();
			switch (oper) {
				case 1:
					aparelhotelefonico.discarNumero();
					String numero = scan.next();
					aparelhotelefonico.ligar(numero);
					break;
				case 2:
					aparelhotelefonico.listarContatos();
					int contato = scan.nextInt();
					aparelhotelefonico.ligarViaAgenda(contato);
					break;
				case 3:
					aparelhotelefonico.atender();
					break;
				case 4:
					aparelhotelefonico.escolherCorreioVoz();
					int correioVoz = scan.nextInt();
					aparelhotelefonico.iniciarCorreioVoz(correioVoz);
					break;
				case 5:
					aparelhotelefonico.selecContFavoritos();
					int favoritos = scan.nextInt();
					aparelhotelefonico.adicionarFavoritos(favoritos);
					break;
				case 6:
					aparelhotelefonico.selecRmFavoritos();
					break;
				default:
					System.out.println("Opção inválida!\n");
			}
		}
	}
	
	
}