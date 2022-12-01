package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main � um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* new Aluno() � uma instancia (Cria��o de Obejto)*/
		/*aluno1 � uma referencia para o objeto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui ser� o Jo�o*/
		aluno1.setNome("Jo�o da Silva");
		aluno1.setIdade(30);
		aluno1.setDataNascimento("02/01/1992");
		aluno1.setRegistroGeral("10.945.052-9");
		aluno1.setNumeroCpf("062.181.009-60");
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("Francisco");
		aluno1.setDataMatricula("01/12/2022");
		aluno1.setSerieMatriculado("9");
		aluno1.setNomeEscola("Escola JDev Treinamento");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome � = " + aluno1.getNome());
		System.out.println("Idade � = " + aluno1.getIdade());
		System.out.println("Nascimento � = " + aluno1.getDataNascimento());
		System.out.println("M�dia da nota � " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		System.out.println("Resuldado 2 = " + aluno1.getAlunoAprovado2());

	/*===============================================================================================*/
		System.out.println("------------------------------------------------------");
		
		Aluno aluno2 = new Aluno(); /*Aqui ser� o Pedro*/
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		
		System.out.println("Aluno 2 Nome � = " + aluno2.getNome());
		System.out.println("Aluno 2 Idade � = " + aluno2.getIdade());
		System.out.println("Aluno 2 Nascimento � = " + aluno2.getDataNascimento());
		
		Aluno aluno3 = new Aluno(); /*Aqui ser� o Alex*/
		
		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("Jose", 50);
		
	}
}
