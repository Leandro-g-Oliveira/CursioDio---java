package main.java.edu.leandro.iphone.models.device;

import java.util.Scanner;
import main.java.edu.leandro.iphone.models.device.*;
import main.java.edu.leandro.iphone.models.impl.*;
import main.java.edu.leandro.iphone.models.device.Telefone;
import main.java.edu.leandro.iphone.models.impl.AparelhoTelefonico;
import main.java.edu.leandro.iphone.models.device.Internet;
import main.java.edu.leandro.iphone.models.impl.NavegadorInternet;

public class Iphone {
	
	private boolean ligado;
	private int opcao = 0;
	private ReprodutorMusical reprodutormusical = new ReprodutorMusical();
	private AparelhoTelefonico aparelhotelefonico = new AparelhoTelefonico();
	private NavegadorInternet navegadorinternet = new NavegadorInternet();
	//private ReprodutorVideo reprodutorvideo = new ReprodutorVideo();
	
	public Iphone () {
		this.ligar();
	}
	
	public void ligar() {
		if (this.ligado) {
			System.out.printf("Seu aparelho já está ligado %n%n");
			return;
		}
		System.out.printf("Ligando seu aparelho%n%n");
		this.ligado = true;
	}
	
	public void desligar() {
		if (!this.ligado) {
			System.out.printf("Seu aparelho já está desligado%n%n");
			return;
		}
		System.out.printf("Desligando seu aparelho%n%n");
		this.ligado = true;
	}
	
	public void menu (Scanner scan) {
		System.out.printf("====menu====%n");
		while(this.opcao != 4) {
			System.out.println("1 - Reprodutor de musica");
			System.out.println("2 - Aparelho telefôico");
			System.out.println("3 - Navegador internet");
			System.out.println("4 - Desligar ");
			this.opcao = scan.nextInt();
			switch (this.opcao) {
				case 1:
					Musica music = new Musica(scan,reprodutormusical);
					break;
				case 2:
					Telefone telefone = new Telefone(scan,aparelhotelefonico);
					break;
				case 3:
					Internet internet = new Internet(scan,this.navegadorinternet);
					break;
				default:
					System.out.println("Opção inválida");
			}
		}
	}
	
}