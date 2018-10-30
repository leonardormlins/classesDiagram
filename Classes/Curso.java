import java.util.LinkedList;
import java.util.List;

public class Curso {
  private List<Disciplina> disciplinas = new LinkedList<Disciplina>();
  private List<Professor> professores = new LinkedList<Professor>();
  private Float duracao;

  public Curso(List<Disciplina> disciplinas, Float duracao){
    this.disciplinas = disciplinas;
    this.duracao = duracao;
  }

  public List<Disciplina> getDisciplinas() {
    return this.disciplinas;
  }
  public void setDisciplinas(List<Disciplina> disciplinas) {
    this.disciplinas = disciplinas;
  }

  public List<Professor> getProfessores() {
    return this.professores;
  }
  public void setProfessores(List<Professor> professores) {
    this.professores = professores;
  }

  public Float getDuracao() {
    return this.duracao;
  }
  public void setDuracao(Float duracao) {
    this.duracao = duracao;
  }

}
