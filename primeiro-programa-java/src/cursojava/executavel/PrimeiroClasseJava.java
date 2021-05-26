package cursojava.executavel;

public class PrimeiroClasseJava {
	/*Variavel Global*/
	static int maiorIdadeGlobal =30;
	
	/*Main é um metado auto executavel em java*/
	public static void main(String[] args) {
		
		/*Variavel local porque pertence somente a esse metado */	
	int maiorIdade = 18;
	System.out.println("Valor da variavel local= " + maiorIdade);
	metado2();

	}
public static void metado2() {
	System.out.println("mostre a variavel global " + maiorIdadeGlobal);
	
}
	
	
}
