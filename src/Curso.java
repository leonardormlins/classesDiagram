import java.util.LinkedList;
import java.util.List;

public class Curso {
	private List<Disciplina> disciplinas = new LinkedList<Disciplina>();
	private List<Professor> professores = new LinkedList<Professor>();
	private Float duracao;
	  
	public Curso(Float duracao) {
		
		this.duracao = duracao;
	}
	
	public void addDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Professor> getProfessores() {
		return professores;
	}
	
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	public Float getDuracao() {
		return duracao;
	}
	
	public void setDuracao(Float duracao) {
		this.duracao = duracao;
	}

}
