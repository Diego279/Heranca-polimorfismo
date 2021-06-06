package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiroClasseJava {
	/*Main é um metado auto executavel em java*/
	public static void main(String[] args) {
	Aluno aluno1 = new Aluno();/*Aqui será o João*/
	Aluno aluno2 = new Aluno();/*Aqui será o Pedro*/
	Aluno aluno3 = new Aluno(); /*Aqui será o Alex*/
	Aluno aluno4 = new Aluno("maria");
	Aluno aluno5 = new Aluno("José ", 50);/*Construtur com parametro*/
	
	aluno1.nome = "João";
	aluno1.idade = 50;
			
	System.out.println("Nome do aluno 1 é: " + aluno1.nome + "e sua idade é " + aluno1.idade);
	
	
	
	}	
	
	
}	