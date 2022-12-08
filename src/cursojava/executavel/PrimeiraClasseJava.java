package cursojava.executavel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			/* new Aluno() é uma instancia (Criação de Obejto) */
			/* aluno1 é uma referencia para o objeto aluno */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento?"); String
			 * rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
			 * JOptionPane.showInputDialog("Qual o CPF?"); String mae =
			 * JOptionPane.showInputDialog("Qual o nome da mãe?"); String pai =
			 * JOptionPane.showInputDialog("Qual o nome do pai?"); String matricula =
			 * JOptionPane.showInputDialog("Qual a data da matricula?"); String serie =
			 * JOptionPane.showInputDialog("Qual a série?"); String escola =
			 * JOptionPane.showInputDialog("Qual o nome da escola?");
			 */

			Aluno aluno1 = new Aluno(); /* Aqui será o João */

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae);
			 * aluno1.setNomePai("Francisco"); aluno1.setDataMatricula(matricula);
			 * aluno1.setSerieMatriculado(serie); aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota de disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) { /* Opção SIM e Zero */

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}

			alunos.add(aluno1);
		}

		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("alex")) {
				System.out.println(aluno); /* Descrição do objeto na memória */
				System.out.println("Média do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("-------------------------------------------------------");
				break;
			}
		}
	}
}
