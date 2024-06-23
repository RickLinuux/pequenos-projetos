package exerciciosifelse;
/*Tendo como entrada a altura e o sexo 
(codificado da seguinte forma: 1:feminino 2:masculino) de uma
pessoa, construa um programa que calcule e imprima seu peso ideal, 
utilizando as seguintes Fórmulas: - para
homens: (72.7 * Altura) – 58 - para mulheres: (62.1 * Altura) – 44.7*/
import java.util.*;
public class Imc {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        char sexo;
        double altura;

        System.out.println("Informe seu sexo [F ou M]");
        sexo = read.next().charAt(0);

        System.out.println("Informe sua altura");
        altura  = read.nextDouble();

        if(sexo == 'F'){
            altura =(62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal aproximadamente é %.2f \n" , altura);
        }
        else{
            altura = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal aproximadamente é %.2f \n" ,  altura);
        }
        }
    }
