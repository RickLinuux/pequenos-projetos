package problemsinvolvingties.forjava;
import java.util.*;
public class ExeCinco {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int getBiggerNumber = 0;
        System.out.println("Informe o 10 números irei descobrir o maior:");

       for(int i = 1; i <= 10; i++){ 
            System.out.println("Informe o " + i + "º numero");
            int number = read.nextInt();

            if(number > getBiggerNumber){
                getBiggerNumber = number;
            }
        }
        System.out.println("O maior número digitado foir "+getBiggerNumber);

    }
}