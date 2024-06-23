package problemsinvolvingties.forjava;
import java.util.Scanner;

public class ExeSete {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira o tamanho do lado do quadrado (deve estar entre 1 e 20):");
        int side = read.nextInt();

        if(side >= 1 && side <= 20){
            for(int i = 0; i < side; i++){
                
                for(int j = 0; j < side; j++){
                    if(i == 0 || i == side-1 || j == 0 || j == side-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("O tamanho do lado do quadrado deve estar entre 1 e 20.");
        }
    }
}
