package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		
		Aluno aluno = new Aluno();
		aluno.setNome("Gustavo Jdev");
		aluno.setNomeEscola("Jdev Treinamento");
		aluno.setIdade(20);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("450451pr");
		diretor.setNome("Alex");
		diretor.setIdade(50);
		
		Secretario secretaio = new Secretario();
		secretaio.setExperiencia("Administração");
		secretaio.setNumeroCpf("123.321");
		secretaio.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretaio);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretaio.pessoaMaiorIdade());
		
		
		Aluno aluno2 = new Aluno();
	}

}
