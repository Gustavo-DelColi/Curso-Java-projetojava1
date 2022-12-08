package cursojava.executavel;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* new Aluno() é uma instancia (Criação de Obejto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String matricula = JOptionPane.showInputDialog("Qual o nome da matricula?");
		String serie = JOptionPane.showInputDialog("Qual a série?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");
		
		
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		
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
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("matematica");
		disciplina2.setNota(80);
		
		aluno1.getDisciplinas().add(disciplina2);
		
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("geografia");
		disciplina3.setNota(97);
		
		aluno1.getDisciplinas().add(disciplina3);
		
	
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);
		
		aluno1.getDisciplinas().add(disciplina4);
		
		System.out.println(aluno1); /*Descrição do objeto na memória*/
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		

		
	}
}
