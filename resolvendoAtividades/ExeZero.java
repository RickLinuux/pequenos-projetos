package problemsinvolvingties;
/*
 * 0. Escreva um programa em Java que recebe 'n' 
 * números do usuário, e recebe o número 'n' também, e determine qual
destes números é o menor.
*/

import java.util.*;
public class ExeZero {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int number, i = 1, cont,getSmallerNumber = 0,getBiggestnumber = 0;
        
        System.out.println("Qual a quantidade de números que deseja informar: ");
        cont = read.nextInt(); 
        
        while(i <= cont){
            System.out.println("Informe o " +(i) + "º numero; ");
            number = read.nextInt();

            if(number > getBiggestnumber){
                 getBiggestnumber = number;
            }
            if(number < (cont*100)){
                 getSmallerNumber = number;
            }
            ++i;
        }

        System.out.println("O maior número é igual a " + getBiggestnumber+ "\nO menor número foi " + getSmallerNumber);
        
    }
    
}
