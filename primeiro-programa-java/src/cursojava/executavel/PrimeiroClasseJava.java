  
package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiroClasseJava {
	
	/*Main � um metado auto executavel em java*/
	public static void main(String[] args) {
		
		
	/*arry de Lista de alunos */
	
		List<Aluno> alunos = new ArrayList<Aluno>();		

		for(int qtd = 1 ; qtd <=2; qtd++) {
			
			/*new Aluno() � uma intancia (Cria��o de Objeto)*/	
			/* aluno1 � uma referencia para objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+ "  ?");
		
					
		
		/*String idade = JOptionPane.showInputDialog("Qual o sua idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual seu RJ?");
		String cpf = JOptionPane.showInputDialog("Qual seu CPF ?");
		String mae = JOptionPane.showInputDialog("Nome da sua m�e?");
		String pai = JOptionPane.showInputDialog("nome do seu pai ?");
		String matricula = JOptionPane.showInputDialog("Qual sua matrica ?");
		String serie = JOptionPane.showInputDialog(" Qual sua serie  ?");*/
	

		
		/*Criando um Objeto*/
		Aluno aluno1 =  new Aluno(); 
				
		aluno1.setNome(nome);
		
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);*/
		
			/*pos de posi��o iniiciando do 1 enquanto a posi��o for menor que 4 vai rodar*/
		for (int pos = 1; pos <= 4; pos++) {
      		String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina"+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina"+pos+" ?");
			
		
			Disciplina disciplina1 = new Disciplina();
			disciplina1.setDisciplina(notaDisciplina);
			
		disciplina1.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina1);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
	
	  	if (escolha == 0) {/*Op��o SIM  E ZERO*/
	  		
	  		int  continuarRemover = 0;
	  		int posicao = 1;
	  		while (continuarRemover == 0){
	  		/*Observe que o metado disciplinaRemover recebe uma String e index e inteiro, ent�o pega o objeto */
			 /* disciplinaRemover e converto de String para inteiro */
					
	  		String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar e remover");
			
	  		}
		
	  	}
	  	alunos.add(aluno1);
	}
		for (Aluno aluno : alunos) {
			
			if (aluno.getNome().equalsIgnoreCase("alex")) {/*encontrando alex na lista */
			/*Informando oque vai ser mostrado na tela */
			System.out.println(aluno);/*Descri��o do Objeto na memoria*/
			System.out.println("Media do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno .getAlunoAprovado2());
			break;
			}

	System.out.println("------------------------------------------------------");
		}
		
		
	}	
		
}	