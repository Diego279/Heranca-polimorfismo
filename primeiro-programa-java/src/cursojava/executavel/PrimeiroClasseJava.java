  
package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiroClasseJava {
	
	/*Main é um metado auto executavel em java*/
	public static void main(String[] args) {
		
		
	/*arry de Lista de alunos */
	
		List<Aluno> alunos = new ArrayList<Aluno>();		

		for(int qtd = 1 ; qtd <=2; qtd++) {
			
			/*new Aluno() é uma intancia (Criação de Objeto)*/	
			/* aluno1 é uma referencia para objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+ "  ?");
		
					
		
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
			
		
 			Disciplina disciplina1 = new Disciplina();
			disciplina1.setDisciplina(notaDisciplina);
			disciplina1.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina1);
		}
		/*tela de escolha em remover uma disciplina com retuner 0 ou 1 sendo que para sim o retorno e zero*/
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
	
	  	if (escolha == 0) {/*Opção SIM  E ZERO*/
	  		
	  	/*cria uma variavel disciplinaRemover e cria um dialogo para o usuario escolher qual disciplina de 1 a 4*/	
	  	 String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
	  	 aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);
	  	 
	  		int  continuarRemover = 0;
	  		int posicao = 1;
	  		while (continuarRemover == 0){
	  		/*Observe que o metado disciplinaRemover recebe uma String e index e inteiro, então pega o objeto */
			 /* disciplinaRemover e converto de String para inteiro */
					
	
			
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar e remover");
			
	  		}
		
	  	}
	  	alunos.add(aluno1);
	     }
		
		for (int pos = 0; pos < alunos.size(); pos ++) {
			
			Aluno aluno = alunos.get(pos);
			
			System.out.println("Aluno= " + aluno.getNome());
			System.out.println("Media do aluno " +aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("----------------------------------------------------------S");
			
		}
		
		} 

	}
		
		
		
		
	