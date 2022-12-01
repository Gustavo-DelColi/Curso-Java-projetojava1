package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* new Aluno() é uma instancia (Criação de Obejto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		aluno1.setNome("João da Silva");
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
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		System.out.println("Resuldado 2 = " + aluno1.getAlunoAprovado2());

	/*===============================================================================================*/
		System.out.println("------------------------------------------------------");
		
		Aluno aluno2 = new Aluno(); /*Aqui será o Pedro*/
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		
		System.out.println("Aluno 2 Nome é = " + aluno2.getNome());
		System.out.println("Aluno 2 Idade é = " + aluno2.getIdade());
		System.out.println("Aluno 2 Nascimento é = " + aluno2.getDataNascimento());
		
		Aluno aluno3 = new Aluno(); /*Aqui será o Alex*/
		
		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("Jose", 50);
		
	}
}
