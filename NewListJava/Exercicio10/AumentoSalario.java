package NewListJava.Exercicio10;

import java.util.Scanner;

public class AumentoSalario {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe seu salário");
        double salario = read.nextDouble();
        CalcularAumento.aumento(salario);
        read.close();
    }

    static class CalcularAumento{
        static void aumento(double salario){
            if(salario < 500){
                salario += (salario * 0.30);
                System.out.println("O salário com aumento de 30% é igual a " + salario);
            }
            else{
                System.out.println("Você não tem direito ao aumento!");
            }
        }
    }
    
}
