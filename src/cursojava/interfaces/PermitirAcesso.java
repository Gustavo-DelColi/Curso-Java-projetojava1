package cursojava.interfaces;


/*Essa inferface ser� o nosso contrato de autenti��o*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);

	public boolean autenticar();
	
}
