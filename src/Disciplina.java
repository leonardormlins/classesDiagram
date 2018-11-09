import java.util.LinkedList;
import java.util.List;

public class Disciplina{
	
	private String nome, ementa;
	private int numeroAulas;
	private List<String> arquivos = new LinkedList<String>();
	
	// constructor
	
	public Disciplina(String nome, String ementa, int numeroAulas) {
		this.nome = nome;
		this.ementa = ementa;
		this.numeroAulas = numeroAulas;
	}
	
	// getter and setter
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmenta() {
		return ementa;
	}
	
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	public int getNumeroAulas() {
		return numeroAulas;
	}
	
	public void setNumeroAulas(int numeroAulas) {
		this.numeroAulas = numeroAulas;
	}
	
	public List<String> getArquivos() {
		return arquivos;
	}
	public void setArquivos(List<String> arquivos) {
		this.arquivos = arquivos;
	}
	
	
	
	
	
}