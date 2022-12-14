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
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administra��o");
		secretario.setNumeroCpf("123.321");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Sal�rio aluno � = " + aluno.salario());
		System.out.println("Sal�rio diretor � = " + diretor.salario());
		System.out.println("Sal�rio secret�rio � = " + secretario.salario());
	}

}
