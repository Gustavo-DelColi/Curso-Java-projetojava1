package cursojava.interfaces;


/*Essa inferface será o nosso contrato de autentição*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);

	public boolean autenticar();
	
}
