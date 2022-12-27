package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {
		

		try {
			lerArquivo();


			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha))
					.autenticar()) { /* Vou traar o contrato para autorizar somente quem realmente tem o contrato */

				List<Aluno> alunos = new ArrayList<Aluno>();

				/*
				 * É uma lista que dentro dela temos uma chave que identifica uma sequencia de
				 * valores também
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					/* new Aluno() é uma instancia (Criação de Obejto) */
					/* aluno1 é uma referencia para o objeto aluno */

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");

					/*
					 * String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
					 * String rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
					 * JOptionPane.showInputDialog("Qual o CPF?"); String mae =
					 * JOptionPane.showInputDialog("Qual o nome da mãe?"); String pai =
					 * JOptionPane.showInputDialog("Qual o nome do pai?"); String matricula =
					 * JOptionPane.showInputDialog("Qual a data da matricula?"); String serie =
					 * JOptionPane.showInputDialog("Qual a série?"); String escola =
					 * JOptionPane.showInputDialog("Qual o nome da escola?");
					 */

					Aluno aluno1 = new Aluno(); /* Aqui será o João */

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));
					/*
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
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
				}

				System.out.println("-----------------Lista dos reprovados-----------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Aluno = " + aluno.getNome());
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
				}

				System.out.println("-----------------Lista de recuperação-----------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Aluno = " + aluno.getNome());
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");

			}

		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			/* Imprime erro no console Java */
			e.printStackTrace();

			/* Mensagem do erro ou causa */
			System.out.println(" Mensagem: " + e.getMessage());

			for (int i = 0; i < e.getStackTrace().length; i++) {

				saida.append("\n Clase de erro : " + e.getStackTrace()[i].getClassName());
				saida.append("\n Método de erro : " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro : " + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Class : " + e.getClass().getName());
			}

			JOptionPane.showMessageDialog(null, "Erro de convesão de numero : " + saida.toString());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opa um null pointer exception : " + e.getClass());

		} catch (ExcecaoProcessarNota e) { /* Captura todas exceções que não prevemos */
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro da excecao customizada : " + e.getClass().getName());

		} finally {/* Sempre é executado ocorrendo erros ou não. Porquê */
			/*
			 * Finally sempre é usado quando precisa executar um processo acontencendo erro
			 * ou não no sistema
			 */
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java comigo");
		}
	}

	public static void lerArquivo() throws ExcecaoProcessarNota {
		try {

			File fil = new File("c://lines.txt");
			Scanner scanner = new Scanner(fil);
		} catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		}
	}
}
