import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class JSacad {

	@Test
	void test() {
		
		Sacad plataforma = new Sacad();
		Contato contatoEscola = new Contato("São José dos Campos", "1225646845");
		
		Disciplina informaticaBasica = new Disciplina("Informatica Basica", "Textyo longo", 25);
		
		Curso informatica = new Curso(2.5f);
		informatica.addDisciplina(informaticaBasica);
		
		Curso eletronica = new Curso(2.5f);
		eletronica.addDisciplina(informaticaBasica);
		
		Escola novaEscola = new Escola(4151654, "ETEP", "Técnico", contatoEscola);
		novaEscola.adicionarCurso(informatica);
		novaEscola.adicionarCurso(eletronica);
		
		plataforma.cadastrarEscola(novaEscola);
	}

}
