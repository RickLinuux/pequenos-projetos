package exerciciosifelse;
import java.util.*;

public class Nascimento {
    public static void main(String[] arg){
        Scanner read = new Scanner(System.in);

        int dataNasc; 

        System.out.println("Informe sua data de nascimento: ");
        dataNasc = read.nextInt();

        dataNasc = 2024 - dataNasc;

        if(dataNasc >= 18){
            System.out.println("Você pode votar!");
        }
        else{
            System.out.println("Você não pode votar");
        }
    }
}
