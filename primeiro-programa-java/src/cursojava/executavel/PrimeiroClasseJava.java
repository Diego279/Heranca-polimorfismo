package cursojava.executavel;
public class PrimeiroClasseJava {
	public static void main(String[] args) {	
	int	nota1 = 80;
	int	nota2 = 70;
	int	nota3 = 65;
	int	nota4 = 63;
	int media = 0;
	 media = (nota1+nota2+nota3+nota4)/4;
	 System.out.println("A media �: " + media);
	 if (media >= 50) {
		 if (media >= 70) {
			 System.out.println("Aluno est� aprovado direto");
	    }else {
	    	System.out.println("Aluno est� em recupera��o");
	    }
	 }else {
		 System.out.println("A Media � = " + media + " Aluno reprovado direto");
		
	 }
	  }
	
	
	}


