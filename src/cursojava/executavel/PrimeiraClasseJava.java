package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

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
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3?");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");
		
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
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina1(disciplina2);
		aluno1.getDisciplina().setDisciplina1(disciplina3);
		aluno1.getDisciplina().setDisciplina1(disciplina4);
		
	
		Aluno aluno = new Aluno();
		System.out.println(aluno1); /*Descrição do objeto na memória*/
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
		
	}
}
