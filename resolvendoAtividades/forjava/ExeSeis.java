package problemsinvolvingties.forjava;
import java.util.*;
public class ExeSeis {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int getNumber = 0, biggerNumber= 0, getBigger = 0;
        System.out.println("Informe 10 numeros irei mostrar os dois maiores");

        for(int i = 1; i <= 10; i++){
            System.out.println("Informe o " + i + "º numero");
            getNumber = read.nextInt();

            if(getNumber > biggerNumber){
                getBigger = biggerNumber; 
                biggerNumber = getNumber;
            }
            if(getNumber < biggerNumber && getNumber > getBigger){
                getBigger = getNumber;
            }
        }
        System.out.println("Os dois maiores numeros " + biggerNumber + " " + getBigger);
    }
}
