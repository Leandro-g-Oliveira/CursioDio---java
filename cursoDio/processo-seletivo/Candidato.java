public class Candidato {
  private String nome;
  private double pretensaoSalarial;
  private Boolean selecao;
  public Candidato () {
    this.selecao = false;
  }
  
  public void setSelecao(Boolean selecao) {
    this.selecao = selecao;
  }
  
  public Boolean getSelecao() {
    return this.selecao;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setPretensaoSalarial(double pretensaoSalarial) {
    this.pretensaoSalarial = pretensaoSalarial;
  }
  
  public String getNome() {
    return this.nome;
  }
  
  public double getPretensaoSalarial() {
    return this.pretensaoSalarial;
  }
}