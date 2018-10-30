import java.util.LinkedList;
import java.util.List;

public class Escola {
  private int cnpj;
  private String nome, tipo;
  private Contato contato;
  private List<Curso> cursos = new LinkedList<Curso>();
  private List<Professor> professores = new LinkedList<Professor>();

  public Escola(String nome, String tipo, Contato informacoesContato) {
    this.nome = nome;
    this.tipo = tipo;
    this.contato = informacoesContato
  }

  public String getNome() {
    return this.nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipo() {
    return this.nome;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Int getCnpj() {
    return this.cnpj;
  }
  public void setCnpj(Int cnpj) {
    this.cnpj = cnpj;
  }

  public Contato getContato() {
    return this.contato;
  }
  public void setContato(Contato contato) {
    this.contato = contato;
  }

  public void adicionarCurso(Curso novo_curso) {
    cursos.add(novo_curso);
  }

  public void cadastrarProfessor(Professor novo_professor) {
    professores.add(novo_professor);
  }
}
