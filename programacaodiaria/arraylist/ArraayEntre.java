/*
 * Em seguida, crie a função principal do programa para inicializar um array de inteiros 
 * de  tamanho 10, exibir esses valores na tela e pedir para o usuário digitar o valor 
 * mínimo e  máximo  a ser buscado. Em seguida o programa deverá chamar a função  valores_entre
 *  e exibir na tela os valores resultantes.
 *  Lembre-se de exibir uma  mensagem de erro caso nenhum valor seja encontrado entre o 
 * mínimo e o máximo.
*/
import java.util.*;
public class ArrayEntre {

    public class ExitEntre{
        static public void entre(int[] array, int min, int max){
         
            for(int i = 0; i < array.length; i++){
                if(array[i] >= min && array[i] <= max){
                    System.out.println(array[i]);
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};

        int min, max;

        Scanner read = new Scanner(System.in);

        min = read.nextInt();
        max = read.nextInt();
        System.out.print("----\n");
        ExitEntre.entre(array, min, max);
    }
}
