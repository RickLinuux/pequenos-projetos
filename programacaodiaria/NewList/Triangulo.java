import java.util.*;
public class Triangulo {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] side = new int[3]; // Corrigido aqui

        for(int i = 0; i < 3; i++){
            System.out.println("Informe o " +(i+1)+"º lado do trinângulo");
            side[i] = read.nextInt();
        }

        if(side[0] == side[1] & side[1] == side[2]){
            System.out.println("Triângulo Equilátero");
        }
        else if(side[0] == side[1] || side[0] == side[2] || side[1] == side[2]){
            System.out.println("Triângulo Isósceles");
        }
        else{
            System.out.println("Triângulo Escaleno");
        }
    }
}
