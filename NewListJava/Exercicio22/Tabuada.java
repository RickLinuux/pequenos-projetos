import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe um número entre 1 e 10: ");
        int num = read.nextInt();

        InnerTabuada.calcularTabuada(num);        

    }


    static class InnerTabuada {
    
        static void calcularTabuada(int num){
            int[][] tabuada = new int[10][1];

            if(num < 1 || num > 10){
                System.out.println("Opção não suportada, intervalo vai de {1...10}!");
            }
            else{
                for(int x = 0; x < 10; x++){
                    tabuada[x][0] = num * (x+1); 
                }
    
                for(int x = 0; x < 10; x ++){
    
                    System.out.println(num +" X "+ (x +1 )+" | " + tabuada[x][0] + " | "); 
                }
            }
            
        }
    }
}
/*22.Faça uma classe seguinte que recebe por meio da linha de comando do programa (prompt) um número natural
(de 1 a 10) e informe a sua tabuada.*/