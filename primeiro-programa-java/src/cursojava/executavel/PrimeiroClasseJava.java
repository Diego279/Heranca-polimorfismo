package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiroClasseJava {
	/*Main � um metado auto executavel em java*/
	public static void main(String[] args) {
	
	/*new aluno() � uma instancia (Cria��o de Objeto)*/
	/*aluno � uma referencia para o objeto aluno*/	
		//*=========================================================================*/	
		/*Entrada de dado */
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		/*como data de nascimento e um numero inteiro e a variavel idade 
		 retorna instring temos que converter setIdade para int primeiro*/
		String idade = JOptionPane.showInputDialog("Qual o sua idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual seu RJ?");
		String cpf = JOptionPane.showInputDialog("Qual seu CPF ?");
		String mae = JOptionPane.showInputDialog("Nome da sua m�e?");
		String pai = JOptionPane.showInputDialog("nome do seu pai ?");
		String matricula = JOptionPane.showInputDialog("Qual sua matrica ?");
		String serie = JOptionPane.showInputDialog(" Qual sua serie  ?");
		
		String note1 = JOptionPane.showInputDialog("Nota 1?");
		String note2= JOptionPane.showInputDialog("Nota 2?");
		String note3 = JOptionPane.showInputDialog("Nota 3 ?");
		String note4= JOptionPane.showInputDialog("Nota 4 ?");
		
	
		
		
	Aluno aluno1 = new  Aluno();/*Aqui ser� o Jo�o*/
     
	/*Chamando o metado Interger.valueOf para converter String para Int*/
	aluno1.setNome(nome);
    aluno1.setIdade(Integer.valueOf(idade));
	aluno1.setDataNascimento(dataNascimento);
	aluno1.setRegistroGeral(rg);
	aluno1.setNumeroCpf(cpf);
	aluno1.setNomeMae(mae);
	aluno1.setNomePai(pai);
	aluno1.setDataMatricula(matricula);
	aluno1.setSerieMatriculado(serie);
	
	/*conves�o*/
	aluno1.setNota1(Double.parseDouble(note1));
	aluno1.setNota2(Double.parseDouble(note2));
	aluno1.setNota3(Double.parseDouble(note3));	
	aluno1.setNota4(Double.parseDouble(note4));
	
	System.out.println("Nome � " + aluno1.getNome());
	System.out.println("Nome do m�e � " + aluno1.getNomeMae());
	System.out.println("Nome da Escola � " + aluno1.getNomeEscola());
	System.out.println("Nome � = " + aluno1.getNome());/*Get resgata um valor do atributo*/
	System.out.println("M�dia de nota � " + aluno1.getMediaNota());
	
	System.out.println("Resultado 1 " +( aluno1.getAlunoAprovado() ?  "Aprovado" : "Reprovado"));

	System.out.println("Resultado 2 " + aluno1.getAlunoAprovado2());
	System.out.println("===================================================================");
	/*===========================================================================================*/
	
	
	}	
	
	
}	