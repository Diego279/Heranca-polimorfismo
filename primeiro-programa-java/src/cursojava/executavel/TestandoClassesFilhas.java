package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Diego JDev - vai que é tua");
		aluno.setNomeEscola("Jdev - Treinamento");
		aluno.setIdade(22);
	
		// Da Classe Diretor um novo objeto diretor
		// um novo metodo Diretor()
		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("31456.12564..46..92656.256.");
		diretor.setNome("Egidio");
		diretor.setIdade(50);
	
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administracao");
		secretario.setIdade(18);
		secretario.setNome("JoaoS");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
			
	System.out.println("Saláeio Aluno é = " + aluno.salario());
	System.out.println("Salário Diretor é " + diretor.salario() );
	System.out.println("Salàrio é " + secretario.salario());
	
	Pessoa pessoa = new Aluno();
	
	pessoa = secretario;
teste(aluno);
teste(pessoa);
teste(secretario);
	
		
	}
	
	public static void teste(Pessoa pessoa) {
		
		System.out.println("Essa pessoa é demais " + pessoa.getNome() 
		+ " e o salário é de = " + pessoa.salario());
				
	}

}
