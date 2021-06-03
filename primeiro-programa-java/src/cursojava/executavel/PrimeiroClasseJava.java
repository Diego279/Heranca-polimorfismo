package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiroClasseJava {
	public static void main(String[] args) {


	/*ShowInput mostra uma entrada de dados tipo dialogo na tela*/
	/*Essa função e da biblioteca Javax que foi importada */	
	String carros = JOptionPane.showInputDialog("Infome a quantidade decarros");
    String pessoas = JOptionPane.showInputDialog("Infome a quantidade de pessoas");

	double carroNumero = Double.parseDouble(carros);
	
	double pessoaNumero = Double.parseDouble(pessoas);
	/*Foi Criado uma variavel convertendo para o tipo int */
		
	int divisao = (int)(carroNumero / pessoaNumero);
		/*Criado variavel resto onde resto recebe o resto da divisão */
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"Divisão para as pessoas deu " + divisao);	
		}else {
			System.out.println("Não quis ver o resultado");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é " + resto);
		}
		
		

	}	
	}