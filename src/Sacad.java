import java.util.LinkedList;
import java.util.List;

public class Sacad {
  public List<Escola> escolas = new LinkedList<Escola>();

  public void cadastrarEscola(Escola novaEscola){
    escolas.add(novaEscola);
  }
}
