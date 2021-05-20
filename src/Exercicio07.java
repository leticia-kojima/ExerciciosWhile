import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella. Para isso, devem acertar quantos feijões estão em um jarro (1238). Faça um programa que solicite a digitação da quantidade de feijões até que um cliente acerte.
		
		Scanner leitor = new Scanner(System.in);
		
		int quantidadeFeijoes=0, tentativas=0;
				
		while (quantidadeFeijoes != 1238) {
			System.out.println("Quantos feijões tem no jarro?");
			
			quantidadeFeijoes = leitor.nextInt();
			
			if (quantidadeFeijoes != 1238) {						
				System.out.println("Quantidade errada! Tente novamente!\n");
			}
			
			tentativas = tentativas + 1;
		}
		
		System.out.println("Parabéns, você acertou a quantidade e ganhou uma noite no castelo da princesa Javarella!");
		System.out.println("Você precisou de " + tentativas + " tentativas para acertar!");
		
		leitor.close();

	}

}
