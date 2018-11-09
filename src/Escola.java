import java.util.LinkedList;
import java.util.List;

public class Escola {
  private int cnpj;
  private String nome, tipo;
  private Contato contato;
  private List<Curso> cursos = new LinkedList<Curso>();
  private List<Professor> professores = new LinkedList<Professor>();


  // Cons

  public Escola(int cnpj, String nome, String tipo, Contato contato) {
	this.cnpj = cnpj;
	this.nome = nome;
	this.tipo = tipo;
	this.contato = contato;

  }
  
  
  
  // getters and setters
  
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Contato getContato() {
		return contato;
	}
	
	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

// Methods
	
	  public void adicionarCurso(Curso novoCurso) {
	    cursos.add(novoCurso);
	  }

	  public void cadastrarProfessor(Professor novo_professor) {
	    professores.add(novo_professor);
	  }
}
