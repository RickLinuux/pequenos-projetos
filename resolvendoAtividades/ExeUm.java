package problemsinvolvingties;
/** 
 * Faça um programa em Java que recebe um inteiro do usuário e calcula seu fatorial.
O fatorial de 'n' é dado por:
n*(n-1)*(n-2)...*3*2*1
e é representado por n!
*/
import java.util.Scanner;

public class ExeUm {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int number, fat = 1;
        String stdout = "";

        System.out.println("Informe um número");
        number = read.nextInt();

        while(number > 1){
            stdout += number + " x ";
            fat *= number;
            number--;
        }
        stdout += "1";
        System.out.println(stdout);
        System.out.println("Fatorial: " + fat);
    }
}
