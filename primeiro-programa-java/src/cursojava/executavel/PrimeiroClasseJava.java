package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiroClasseJava {
	public static void main(String[] args) {

		
	/*ShowInput mostra uma entrada de dados tipo dialogo na tela*/
	/*Essa fun��o e da biblioteca Javax que foi importada */	
	String carros = JOptionPane.showInputDialog("Infome a quantidade decarros");
    String pessoas = JOptionPane.showInputDialog("Infome a quantidade de pessoas");

	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	/*Foi Criado uma variavel convertendo para o tipo int */
		int divisao = (int)(carroNumero / pessoaNumero);
		/*Criado variavel resto onde resto recebe o resto da divis�o */
		double resto = carroNumero % pessoaNumero;
		JOptionPane.showMessageDialog(null,"Divis�o para as pessoas deu " + divisao + " carros para cada, e sobrou " + resto + " carros");

	}	
	}
	

