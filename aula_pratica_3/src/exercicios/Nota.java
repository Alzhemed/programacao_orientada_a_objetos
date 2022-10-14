package exercicios;

public class Nota {
	private double nota1;
	private double nota2;
	private int faltas;
	
	public Nota() {
		
	}
	
	public Nota(double nota1, double nota2, int faltas) {
		setFaltas(faltas);
		setNota1(nota1);
		setNota2(nota2);
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		if (faltas < 0 || faltas > 40) {
			System.out.println("Valor inválido para o número de faltas, favor inserir um valor no intervalor de 0 a 40.");
		} else {
			this.faltas = faltas;
		}
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		if (nota1 < 0 || nota1 > 10) {
			System.out.println("Valor inválido para a nota, favor inserir uma nota no intervalo de 0 a 10.");
		} else {
			this.nota1 = nota1;
		}
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		if (nota2 < 0 || nota2 > 10) {
			System.out.println("Valor inválido para a nota, favor inserir uma nota no intervalo de 0 a 10.");
		} else {
			this.nota2 = nota2;
		}
	}
	
	public void resultado() {
		double media = (nota1+nota2)/2;
		double notaFaltanteExame;
		double NotaFaltanteAprovacao;
		notaFaltanteExame = 4 - media;
		NotaFaltanteAprovacao = 7 - media;
		if (faltas > 7) {
			System.out.println("Número de faltas: " + faltas);
			System.out.println("Reprovado por faltas.");
		} else if (media < 4) {
			System.out.println("Media: " + media);
			System.out.println("Reprovado.");
			System.out.println("Você precisaria de " + notaFaltanteExame + " pontos para ficar de exame final.");
			System.out.println("E você precisaria de " + NotaFaltanteAprovacao + " pontos para ser aprovado.");
		} else if (media < 7) {
			System.out.println("Media: " + media);
			System.out.println("Exame final.");
			System.out.println("Você precisaria de " + NotaFaltanteAprovacao + " pontos para ser aprovado.");
		} else {
			System.out.println("Media: " + media);
			System.out.println("Aprovado.");
		}
	}
}
