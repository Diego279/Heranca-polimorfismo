package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

/*Classe filha de pessoa que extende de pessoa */
public class Diretor extends Pessoa implements PermitirAcesso{
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	
	private String login;
	private String senha;
	
	
	public Diretor(String login, String senha) {
		this.login = login;
     	this.senha = senha;
	}
	
	
	
	public Diretor() {
	}


	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
	
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((registroEducacao == null) ? 0 : registroEducacao.hashCode());
		result = prime * result + tempoDirecao;
		result = prime * result + ((titulacao == null) ? 0 : titulacao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		if (registroEducacao == null) {
			if (other.registroEducacao != null)
				return false;
		} else if (!registroEducacao.equals(other.registroEducacao))
			return false;
		if (tempoDirecao != other.tempoDirecao)
			return false;
		if (titulacao == null) {
			if (other.titulacao != null)
				return false;
		} else if (!titulacao.equals(other.titulacao))
			return false;
		return true;
	}
	/*Metodo obrigatorio em todas as classes filha*/
	@Override
	public double salario() {
		
		return 3900.78;
	}
	
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

/*Segundo método*/
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin123");
	}
	
	

	
	
	
	

}
