package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiroClasseJava {
	/*Main é um metado auto executavel em java*/
	public static void main(String[] args) {
	
	/*new aluno() é uma instancia (Criação de Objeto)*/
	/*aluno é uma referencia para o objeto aluno*/	
	
	/*=========================================================================*/	
	Aluno aluno1 = new Aluno();/*Aqui será o João*/
	aluno1.setNome("João da Silva");
	
	aluno1.setIdade(50);
	aluno1.setDataNascimrnto("20/10/1955");
	aluno1.setDataMatricula("1251445.125645");
	aluno1.setNumeroCpf("162.125.125.20");
	aluno1.setNomeMae("Sintia");
	aluno1.setNomePai("Pedrão Antonio");
	aluno1.setRegistroGeral("152.1245.11");
	aluno1.setSerieMatriculado("5");
	aluno1.setNomeEscola("Escola de doido");
	aluno1.setNota1(30);
	aluno1.setNota2(40);
	aluno1.setNota3(50);
	aluno1.setNota4(40);

		
	
	System.out.println("Aluno 1");
	System.out.println("Nome é " + aluno1.getNome());
	System.out.println("Nome do mãe é " + aluno1.getNomeMae());
	System.out.println("Nome da Escola é " + aluno1.getNomeEscola());
	System.out.println("Nome é = " + aluno1.getNome());/*Get resgata um valor do atributo*/
	System.out.println("Média de nota é " + aluno1.getMediaNota());
	;
	System.out.println("Resultado 1 " +( aluno1.getAlunoAprovado() ?  "Aprovado" : "Reprovado"));

	System.out.println("Resultado 2 " + aluno1.getAlunoAprovado2());
	System.out.println("===================================================================");
	/*===========================================================================================*/
	Aluno aluno2 = new Aluno();/*Aqui será o Pedro*/
	
	aluno2.setNome("Osvaldo pedrosa");
	aluno2.setDataMatricula("1225.125.22");
	aluno2.setNomeMae("Maria");
	aluno2.setNomePai("Pedrão Antonio");
	aluno2.setRegistroGeral("152.1245.11");
	aluno2.setSerieMatriculado("5");
	aluno2.setNomeEscola("Tecnologia maracada");

	System.out.println("Aluno 2");
	System.out.println("Nome é " + aluno2.getNome());
	System.out.println("Nome do mãe é " + aluno2.getNomeMae());
	System.out.println("Nome da Escola é " + aluno2.getNomeEscola());
	
	
    /*=============================================================================================*/	
	Aluno aluno3 = new Aluno(); /*Aqui será o Alex*/
	
	Aluno aluno4 = new Aluno("maria");
	
	Aluno aluno5 = new Aluno("José ", 50);/*Construtur com parametro*/
	

	
	}	
	
	
}	