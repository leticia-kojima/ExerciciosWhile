import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		//– Para uma sequência matemática onde cada elemento é calculado da seguinte forma: 1!/N! ; 2!/(N-1)!; 3!/(N-2)!; ... ; (N! / 1!).Crie um programa onde o usuário digite a quantidade de elementos que deseja exibir e sejam exibidos os elementos da sequência.
		
		Scanner leitor = new Scanner(System.in);
		
		int n, dividendo, divisor;
		double resultado;
		int i=0, iFatorial = 1;
		
		
		System.out.println("Por favor, informe um número:");
		n = leitor.nextInt();
		
		while (i<n) {
			dividendo = 1;
			iFatorial = 1;
			
			while(iFatorial <=(i+1)){
				dividendo = dividendo * iFatorial;
				iFatorial = iFatorial + 1;
			}
			
			iFatorial = n -1;
			divisor = 1;
			
			while(iFatorial > 1){
				divisor = divisor * iFatorial;
				iFatorial = iFatorial - 1;
			}
			
			resultado = dividendo / (double)divisor;
			
			System.out.println(resultado + ";");
				
			i++;
						
		}
		
		leitor.close();
		
	}

}
