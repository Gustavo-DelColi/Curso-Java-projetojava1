package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main � um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* new Aluno() � uma instancia (Cria��o de Obejto)*/
		/*aluno1 � uma referencia para o objeto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui ser� o Jo�o*/
		
		Aluno aluno2 = new Aluno(); /*Aqui ser� o Pedro*/
		
		Aluno aluno3 = new Aluno(); /*Aqui ser� o Alex*/
		
		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("Jose", 50);
		
	}
}
