package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main � um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* new Aluno() � uma instancia (Cria��o de Obejto)*/
		/*aluno1 � uma referencia para o objeto aluno*/
		/*
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Qual o nome da m�e?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String matricula = JOptionPane.showInputDialog("Qual o nome da matricula?");
		String serie = JOptionPane.showInputDialog("Qual a s�rie?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");
		
		Aluno aluno1 = new Aluno(); /*Aqui ser� o Jo�o*/
		/*
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai("Francisco");
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
	
		Aluno aluno = new Aluno();
		System.out.println(aluno1); /*Descri��o do objeto na mem�ria*/
		/*System.out.println("M�dia do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		*/
		
		/*Equals e hashcode (diferenciar objetos)*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Gustavo");
		aluno1.setNumeroCpf("1234");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Gustavo");
		aluno2.setNumeroCpf("4321");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos s�o iguais");
		}else {
			System.out.println("Alunos n�o s�o iguais");
		}
		
	}
}
