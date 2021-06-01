package cursojava.executavel;
public class PrimeiroClasseJava {
	public static void main(String[] args) {	
	int	nota1 = 0;
	int	nota2 = 100;
	int	nota3 = 100;
	int	nota4 = 100;
	int media = 100 ;
	 media = (nota1+nota2+nota3+nota4)/4;
			/*if (media >=70) {
		System.out.println("Alno aprovado: " + media);
	}else  if (media >=40 && media <= 69) {
		 System.out.println("Aluno em recuperação");
	 }
		else {
	  	System.out.println("Aluno reprovado: " + media);
	  }*/
		/* Operadores Ternarios são pra micro validação */
String saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >=40 && media <= 69) ? "Aluno em recuperação" : "Aluno esta em recuperação";
	System.out.println(saidaResultado);
	  }
	
	
	}


