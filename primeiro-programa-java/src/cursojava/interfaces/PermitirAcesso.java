package cursojava.interfaces;

/*Essa interface ser� o nosso contrato de autenticac�o*/
public interface PermitirAcesso {
	/* Interface recebendo parametros*/
	public boolean autenticar(String login, String senha);
	
	
	public boolean autenticar();
} 
