package problemsinvolvingties.forjava;
import java.util.*;
public class ExeTres {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int number; 

        System.out.println();
        System.out.println("Informe um número para ver todos os números pares e ímpares que o antecedem");   
        number = read.nextInt();

        System.out.println();
        System.out.println("Todos os pares que antecedem o número " + number + ":");
        for(int i = 0; i <= number; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nTodos os ímpares que antecedem o número " + number + ":");
        for(int i = 0; i <= number; i++){
            if(i % 2 != 0){
                System.out.print(+i + " ");
            }
        }
        System.out.println();
    }
}
