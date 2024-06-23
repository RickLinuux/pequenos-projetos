import java.util.*;
public class MaiorVetor {
 
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

		int qtd;
		int i = 0;
		int maior = 0;

		System.out.println("Informe a quantidade de números que deseja armazenar: ");
		qtd = read.nextInt();
		//10
		int[] number = new int[qtd];

		System.out.println("Informe "+ qtd+" números ");
		
		while(i < qtd ){
			System.out.println("Informe o " + (i+1)+ "º numero");
			number[i] = read.nextInt();

			if(number[i] > maior){
				maior = number[i];
			}
			++i;
		}
		System.out.println("O maior número do vetor é " + maior);
	}
}
