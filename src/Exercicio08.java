import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		//Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a m�dia. Fa�a um programa onde o professor informe a m�dia e as notas de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota superior � m�dia e quantos tiveram nota inferior � m�dia.
		
		Scanner leitor = new Scanner(System.in);
		
		int contador = 1, notaAluno = 0, contadorSuperior = 0, contadorInferior = 0, mediaGeral = 0;
		double mediaNotas = 0;
		
		System.out.println("Informe a m�dia:");
		mediaGeral = leitor.nextInt();
		
		while (contador <= 50) {
			System.out.println("Digite a nota do "+ contador+ "� aluno!");
			notaAluno = leitor.nextInt();
			
			mediaNotas = mediaNotas + notaAluno;
			
			if (notaAluno > mediaGeral) {
				contadorSuperior = contadorSuperior + 1;
			}else {
				contadorInferior = contadorInferior + 1;
			}
			
			contador = contador + 1;
						
		}
		
		mediaNotas = mediaNotas / 50;
		
		System.out.println("A m�dia da classe � de "+ mediaNotas);
		System.out.println("A quantidade de alunos acima da m�dia � de " + contadorSuperior);
		
		leitor.close();
		
	}

}
