import java.util.LinkedList;
import java.util.List;

public class Sacad {
  private List<Escola> escolas = new LinkedList<Escola>();

  public void cadastrarEscola(Escola novaEscola){
    escolas.add(novaEscola);
  }

  public Escola buscarEscolaPorNome(String nomeEscola){
    // TODO
  }

}
