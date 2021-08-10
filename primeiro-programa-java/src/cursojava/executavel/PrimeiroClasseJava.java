  
package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;
import jdk.swing.interop.SwingInterOpUtils;
public class PrimeiroClasseJava {
	
	/*Main é um metado auto executavel em java*/
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a senha ");
		
		Secretario secretario = new Secretario();/*Direto com objeto*/
		secretario.setLogin(login);
		secretario.setSenha(senha);
		
		if (secretario.autenticar()) {/*se TRUE acessa se False não acessa */
		
				List<Aluno> alunos = new ArrayList<Aluno>();
				
				/*É uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também*/
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();/*maps e a variavel criada HashMaps*/
				
								
				for (int qtd = 1; qtd <=5; qtd++) {
				
			/*new Aluno() é uma intancia (Criação de Objeto)*/	
			/* aluno1 é uma referencia para objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno" +qtd+"?");
		
					
		
		/*String idade = JOptionPane.showInputDialog("Qual o sua idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual seu RJ?");
		String cpf = JOptionPane.showInputDialog("Qual seu CPF ?");
		String mae = JOptionPane.showInputDialog("Nome da sua mãe?");
		String pai = JOptionPane.showInputDialog("nome do seu pai ?");
		String matricula = JOptionPane.showInputDialog("Qual sua matrica ?");
		String serie = JOptionPane.showInputDialog(" Qual sua serie  ?");
		String escola = JOptionPane.showInputDialog("Qual escola ");*/
			
		/*Criando um Objeto*/
		Aluno aluno1 =  new Aluno(); 
				 
		aluno1.setNome(nome);
		
	/*	aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);  */
		
						
		for (int pos = 1; pos <= 1; pos++) {
			
      		String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina"+pos+" ?");
  			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina"+pos+" ?");
			
		
 			Disciplina disciplina1 = new Disciplina();
			disciplina1.setDisciplina(nomeDisciplina);
			disciplina1.setNota(Double.valueOf(notaDisciplina));
			
		aluno1.getDisciplinas().add(disciplina1);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
	
	  	if (escolha == 0) {/* Opção SIM E ZERO*/
	  		
	  		int  continuarRemover = 0;
	  		int posicao = 1;
	  			  		
	  		while (continuarRemover == 0) {
	  		 	   String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
	  	           aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
	  	           posicao ++;
	  	           continuarRemover =JOptionPane.showConfirmDialog(null, "Continuar remover ");
	  	  }
	 	
	} 
	  	
	  	alunos.add(aluno1);
	  	
	  	
	  	
	   }
				/*Setando as listas vazia  com maps.put se nao da erro no sistema */
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				
				for (Aluno aluno : alunos) {/*Separei em lista*/
					
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
						maps.get(StatusAluno.APROVADO).add(aluno);
					}else
					if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
										
				}	
				
				System.out.println("-----------------------Lista dos aprovados----------------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)){
					System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média = " + aluno.getMediaNota());
					
				} 
				
				System.out.println("-----------------------Lista dos Reprovados----------------------------");
				for (Aluno aluno :maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média = " + aluno.getMediaNota());
					
				} 
				
				System.out.println("-----------------------Lista dos Recuperação----------------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média = " + aluno.getMediaNota());
					
				} 
				
		}else {
			JOptionPane.showConfirmDialog(null, "Acesso não permitido");
				
			}
	 				
     	}
	}
				
		
		

	