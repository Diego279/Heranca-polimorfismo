package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{
	
	
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	
	private String login;
	private String senha;
	
	/*Metodo construtor*/
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Secretario() {
			}
		
	public String getRegistro() {
		return registro;
	}
	
	
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
	}


	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((experiencia == null) ? 0 : experiencia.hashCode());
		result = prime * result + ((nivelCargo == null) ? 0 : nivelCargo.hashCode());
		result = prime * result + ((registro == null) ? 0 : registro.hashCode());
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
		Secretario other = (Secretario) obj;
		if (experiencia == null) {
			if (other.experiencia != null)
				return false;
		} else if (!experiencia.equals(other.experiencia))
			return false;
		if (nivelCargo == null) {
			if (other.nivelCargo != null)
				return false;
		} else if (!nivelCargo.equals(other.nivelCargo))
			return false;
		if (registro == null) {
			if (other.registro != null)
				return false;
		} else if (!registro.equals(other.registro))
			return false;
		return true;
	}

/*Metado abstrato rescrito*/
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.80 * 0.9;
	}
	
	
	
	/*Esse exemplo n?o esta sendo utilizado */
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

/*Segundo m?todo*/
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}
	
	






	
	
	
	

}
