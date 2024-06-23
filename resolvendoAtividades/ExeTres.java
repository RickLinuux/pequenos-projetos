package problemsinvolvingties;

import java.util.Scanner;

public class ExeTres {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        int i = 1;

        System.out.println("Informe um número ímpar ");
        number = read.nextInt();

        if(number % 2 != 0){

            
            while (i <= number) {
                int j = 0;

                while (j++ < number - i / 2) {
                    System.out.print(" ");
                }

                j = 0;
                while (j++ < i) {
                    System.out.print("*");
                }

                System.out.print("\n");
                i += 2;
            }

            // Parte inferior do diamante
            i = number - 2;
            while (i > 0) {
                int j = 0;

                while (j++ < number - i / 2) {
                    System.out.print(" ");
                }

                j = 0;
                while (j++ < i) {
                    System.out.print("*");
                }

                System.out.print("\n");
                i -= 2;
            }
        }else{
            System.out.println("Informe um número ímpar");
            return;
        }
    }
}
