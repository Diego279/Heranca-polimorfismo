package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiroClasseJava {
	/*Main � um metado auto executavel em java*/
	public static void main(String[] args) {
	Aluno aluno1 = new Aluno();/*Aqui ser� o Jo�o*/
	Aluno aluno2 = new Aluno();/*Aqui ser� o Pedro*/
	Aluno aluno3 = new Aluno(); /*Aqui ser� o Alex*/
	Aluno aluno4 = new Aluno("maria");
	Aluno aluno5 = new Aluno("Jos� ", 50);/*Construtur com parametro*/
	
	aluno1.nome = "Jo�o";
	aluno1.idade = 50;
			
	System.out.println("Nome do aluno 1 �: " + aluno1.nome + "e sua idade � " + aluno1.idade);
	
	
	
	}	
	
	
}	