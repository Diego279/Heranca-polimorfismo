package cursojava.executavel;
public class PrimeiroClasseJava {
	public static void main(String[] args) {	
	int	nota1 = 30;
	int	nota2 = 90;
	int	nota3 = 50;
	int	nota4 = 50;
	int media = 0 ;
	 media = (nota1+nota2+nota3+nota4)/4;
			/*if (media >=70) {
		System.out.println("Alno aprovado: " + media);
	}else  if (media >=40 && media <= 69) {
		 System.out.println("Aluno em recupera��o");
	 }
		else {
	  	System.out.println("Aluno reprovado: " + media);
	  }*/
		/* Operadores Ternarios s�o pra micro valida��o */
	String saidaResultado;
	saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado" ;
	System.out.println(saidaResultado);
	  }
	
	
	}


