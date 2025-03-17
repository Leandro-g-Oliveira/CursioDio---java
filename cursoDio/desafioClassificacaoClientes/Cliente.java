public class Cliente {
  private String nome;
  private float saldo;
  private boolean confirm;
  public Cliente () {
    
  }
  
  public void setNome(String nome) {
    this.nome=nome;
  }
  public String getNome() {
    return this.nome;
  }
  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
  public float getSaldo() {
    return this.saldo;
  }
}