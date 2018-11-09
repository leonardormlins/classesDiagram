public class Contato {
  private String localidade, telefone;

  public Contato (String localidade, String telefone) {
    this.localidade = localidade;
    this.telefone = telefone;
  }

  public String getLocalidade() {
    return this.localidade;
  }
  public void setLocalidade(String localidade) {
    this.localidade = localidade;
  }

  public String getTelefone() {
    return this.telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
};
