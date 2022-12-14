package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		
		Aluno aluno = new Aluno();
		aluno.setNome("Gustavo Jdev");
		aluno.setNomeEscola("Jdev Treinamento");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("450451pr");
		diretor.setNome("Alex");
		
		Secretario secretaio = new Secretario();
		secretaio.setExperiencia("Administração");
		secretaio.setNumeroCpf("123.321");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretaio);
		
	}

}
