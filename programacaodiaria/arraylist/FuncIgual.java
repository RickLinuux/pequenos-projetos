/*
 * totalIguais: a função recebe como parâmetro dois arrays de inteiros 
 * e retorna o  total de números iguais existentes em ambos os arrays. 
*/
import java.util.*;
public class FuncIgual {

    //Função para comparar os valores iguais
    public class VetorIgual{
        static public void igual(int[] vetorD, int[] vetorE){
        int count = 0;

        for(int i = 0; i < vetorD.length; i++){
            
            for(int j = 0; j <vetorE.length; j++){
                // Compara os valores da posição
                if(vetorD[i] == vetorE[j]){
                    count++;    
                }
            }
        }
        System.out.println("A quantidade de números iguais é " + (count-1));

        }
    }

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
      
        

        //4 numeros iguais
        int[] vetorD = {1,2,3,4,5,6,7,9,10};
        int[] vetorE = {1,2,3,4,89,10,25,22,100,111};

        VetorIgual.igual(vetorD, vetorE);
    }

}
