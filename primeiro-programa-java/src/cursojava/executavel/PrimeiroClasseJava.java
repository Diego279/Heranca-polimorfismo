  
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
		
			/*pos de posição iniiciando do 1 enquanto a posição for menor que 4 vai rodar*/
		for (int pos = 1; pos <= 4; pos++) {
      		String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina"+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina"+pos+" ?");
			
		
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(notaDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		/*Informando oque vai ser mostrado na tela */
		System.out.println(aluno1);/*Descrição do Objeto na memoria*/
		System.out.println("Media do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		System.out.println("");

				
		
		
	}	
		
}	