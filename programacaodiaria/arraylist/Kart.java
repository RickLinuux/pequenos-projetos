import java.util.Scanner;

public class Kart {
 
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        
        double[] voltas = new double[7];

        

        for(int i = 0; i < voltas.lenght; i++ ){
            System.out.println("Informe a velocidade da " +(i+1) +"º volta");
            voltas[i] = read.nextInt();

            
        }




    }

}
