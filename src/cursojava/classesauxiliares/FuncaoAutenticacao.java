package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/* Realmento e somente receber alguem que tem o contrato da interface de PermitiAcesso e char o autenticar*/
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
