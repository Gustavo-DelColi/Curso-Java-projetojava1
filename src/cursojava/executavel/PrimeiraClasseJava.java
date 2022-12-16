package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {

	/* Main � um metodo auto executavel em Java */
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		if (permitirAcesso.autenticar(login, senha)) { /* se TRUE acesse se False n�o acessa*/
						
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*� uma lista que dentro dela temos uma chave que identifica uma sequencia de valores tamb�m*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


		for (int qtd = 1; qtd <= 5; qtd++) {

			/* new Aluno() � uma instancia (Cria��o de Obejto) */
			/* aluno1 � uma referencia para o objeto aluno */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento?"); String
			 * rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
			 * JOptionPane.showInputDialog("Qual o CPF?"); String mae =
			 * JOptionPane.showInputDialog("Qual o nome da m�e?"); String pai =
			 * JOptionPane.showInputDialog("Qual o nome do pai?"); String matricula =
			 * JOptionPane.showInputDialog("Qual a data da matricula?"); String serie =
			 * JOptionPane.showInputDialog("Qual a s�rie?"); String escola =
			 * JOptionPane.showInputDialog("Qual o nome da escola?");
			 */

			Aluno aluno1 = new Aluno(); /* Aqui ser� o Jo�o */

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae);
			 * aluno1.setNomePai("Francisco"); aluno1.setDataMatricula(matricula);
			 * aluno1.setSerieMatriculado(serie); aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota de disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) { /* Op��o SIM e Zero */

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
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

		for (Aluno aluno : alunos) {/* Separei em listas */
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);/* Reprovado */
			}
		}

		System.out.println("-----------------Lista dos aprovados-----------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}

		System.out.println("-----------------Lista dos reprovados-----------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}

		System.out.println("-----------------Lista de recupera��o-----------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}
	}else {
		JOptionPane.showMessageDialog(null, "Acesso n�o permitido");
		
	}
	}
}
