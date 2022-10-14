package exercicios;

public class Aluno {
	String nome;
	private int matricula;
	double desconto;
	Curso curso;
	
	public void descrever() {
		
	}
	
	public void pagamento() {
		double preco = curso.mensalidade - (desconto/100);
		
		System.out.printf("O valor total da mensalidade do aluno é: %0.2d", preco);
	}
	
}
