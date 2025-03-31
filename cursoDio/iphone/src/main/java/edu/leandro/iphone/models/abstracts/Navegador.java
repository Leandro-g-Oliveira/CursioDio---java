package main.java.edu.leandro.iphone.models.abstracts;

public abstract class Navegador {
	
	protected String[] abas = new String[5];
	protected String abaAtual;
	
	public void selecionarPagina(int pagina) {
		if (pagina > 4) {
			System.out.println("Você pode usar somente até o 5");
			return;
		}
		abaAtual = this.abas[pagina];
		System.out.printf("Aba atual: %s%n",this.abaAtual);
	}
	
	public void exibirPagina(String pagina) {
		if (this.abaAtual == null) {
			this.abas[0] = pagina;
			this.abaAtual = this.abas[0];
			System.out.printf("Abrindo a página %s na aba %d%n%n",this.abaAtual,0);
			return;
		}
		
		for (int i=0; i<this.abas.length;i++) {
			if (this.abaAtual.equals(this.abas[i])) {
				this.abas[i] = pagina;
				this.abaAtual = this.abas[i];
				System.out.printf("Abrindo a página %s na aba %d%n%n",this.abaAtual,i);
			}
		}
	}
	public void adicionarNovaAba() {
		for (int i=0; i<this.abas.length;i++) {
			if (abas[i] == null) {
				this.abas[i] = "pagina livre";
				this.abaAtual = this.abas[i];
				System.out.printf("Sua aba atual é: %s%n%n",this.abaAtual);
				return;
			} else {
				System.out.println("Você já está no máximo das abas");
			}
		}
	}
	public void atualizarPagina() {
		if (this.abaAtual == null) {
			System.out.println("Nenhuma página atual");
			return;
		}
		System.out.printf("Atualizando a página %s%n%n",this.abaAtual);
	}
}