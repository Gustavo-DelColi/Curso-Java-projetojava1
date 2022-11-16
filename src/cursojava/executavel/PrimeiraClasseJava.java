package cursojava.executavel;

import java.sql.Date;

public class PrimeiraClasseJava {

	/*Main é um metodo auto executavel em Java*/
	public static void main(String[] args) {
		
		/*Escreve texto no console*/
		System.out.println("Hello World");
		System.out.println("My first program in Java");
		System.out.println("Testing commit on github");
	}
		private String nome;
		
		private String sobrenome;
		
		private int idade;
		
		private Date dataNascimento;
		
		private Date dataCadastro;
		
		
				
		public Date getDataCadastro() {
			return dataCadastro;
		}

		public void setDataCadastro(Date dataCadastro) {
			this.dataCadastro = dataCadastro;
		}

		public Date getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		
		
}
