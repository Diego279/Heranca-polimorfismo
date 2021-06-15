  
package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiroClasseJava {
	
	/*Main é um metado auto executavel em java*/
	public static void main(String[] args) {
	
	
		/*new Aluno() é uma intancia (Criação de Objeto)*/	
		/* aluno1 é uma referencia para objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual o sua idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual seu RJ?");
		String cpf = JOptionPane.showInputDialog("Qual seu CPF ?");
		String mae = JOptionPane.showInputDialog("Nome da sua mãe?");
		String pai = JOptionPane.showInputDialog("nome do seu pai ?");
		String matricula = JOptionPane.showInputDialog("Qual sua matrica ?");
		String serie = JOptionPane.showInputDialog(" Qual sua serie  ?");
		
		/*Inserindo dados pelo teclado*/
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String note1 = JOptionPane.showInputDialog("Nota 1?");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 1?");
		String note2= JOptionPane.showInputDialog("Nota 2?");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 1?");
		String note3 = JOptionPane.showInputDialog("Nota 3 ?");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 1?");
		String note4= JOptionPane.showInputDialog("Nota 4 ?");
		
		/*Criando um Objeto*/
		Aluno aluno1 =  new Aluno(); 
				
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		
		/*Setando os dados salvo para as variaveis*/
		aluno1.getDisciplina().setNota1(Double.parseDouble(note1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(note2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(note3));	
		aluno1.getDisciplina().setNota4(Double.parseDouble(note4));
	
		aluno1.getDisciplina().setDisciplina1(disciplina1);	
		aluno1.getDisciplina().setDisciplina2(disciplina2);	
		aluno1.getDisciplina().setDisciplina3(disciplina3);	
		aluno1.getDisciplina().setDisciplina4(disciplina4);	
		
		/*Informando oque vai ser mostrado na tela */
		System.out.println(aluno1);/*Descrição do Objeto na memoria*/
		System.out.println("Media do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		System.out.println("");

				
		
		
	}	
		
}	