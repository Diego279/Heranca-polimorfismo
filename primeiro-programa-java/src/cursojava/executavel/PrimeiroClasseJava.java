package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiroClasseJava {
	/*Main é um metado auto executavel em java*/
	public static void main(String[] args) {

		
	String nota1 = JOptionPane.showInputDialog("Inform a nota 1");
	String nota2 = JOptionPane.showInputDialog("Inform a nota 2");
	String nota3 = JOptionPane.showInputDialog("Inform a nota 3");
	String nota4 = JOptionPane.showInputDialog("Inform a nota 4");
	
	double dNota1 = Double.parseDouble(nota1);
	double dNota2 = Double.parseDouble(nota2);
	double dNota3 = Double.parseDouble(nota3);
	double dNota4 = Double.parseDouble(nota4);

	double media = (dNota1 + dNota2 + dNota3 + dNota4) /4;
	
	JOptionPane.showConfirmDialog(null, "A media é : " + media);

	
	/*Média para aprovação é 70*/
	
	if (media >=50) {
		
		if (media >= 70) {
			JOptionPane.showMessageDialog(null, "Aluno está aprovado com a média de :" + media);
		}else {
			JOptionPane.showMessageDialog(null, "Aluno em recuperação com a media de :" + media);
		}
	}else {		
		JOptionPane.showMessageDialog(null, "Aluno está repravo  :" + media);
	}
	
	
	}	
	}	
	