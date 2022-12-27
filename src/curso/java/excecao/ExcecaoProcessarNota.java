package curso.java.excecao;

public class ExcecaoProcessarNota extends Exception {

	public ExcecaoProcessarNota(String erro) {
		super("Erro em processamento das notas do aluno");
		
	}
	
}
