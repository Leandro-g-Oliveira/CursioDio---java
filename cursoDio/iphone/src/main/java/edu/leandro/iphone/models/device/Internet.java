package main.java.edu.leandro.iphone.models.device;
import main.java.edu.leandro.iphone.models.impl.NavegadorInternet;
import java.util.Scanner;

public class Internet {
	
	private Scanner scan;
	private NavegadorInternet navegador;
	
	public Internet (Scanner scan, NavegadorInternet navegador) {
		this.scan = scan;
		this.navegador = navegador;
		this.opcoesNavegador(this.scan,this.navegador);
	}
	
	public void opcoesNavegador (Scanner scan,NavegadorInternet navegador) {
		int oper = 0;
		while (oper != 5) {
			System.out.println("======Navegador======");
			System.out.println("1 - Selecionar página");
			System.out.println("2 - Exibir página");
			System.out.println("3 - Aicionar nova aba");
			System.out.println("4 - Atualizar página");
			System.out.println("5 - Fechar");
			oper = scan.nextInt();
			int param = 0;
			switch(oper) {
				case 1:
						navegador.listarPaginas();
						param = this.scan.nextInt();
						navegador.selecionarPagina(param);
					break;
				case 2:
						navegador.digitarPagina();
						String pagina = scan.next();
						navegador.exibirPagina(pagina);
					break;
				case 3:
					navegador.adicionarNovaAba();
					break;
				case 4:
					navegador.atualizarPagina();
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		}
	}
}