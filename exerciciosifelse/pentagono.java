package exerciciosifelse;
import java.util.*;
public class pentagono {
    /*Escreva um programa para ler o número de 
    lados de um polígono regular e a medida do lado (em cm).
Calcular e imprimir o seguinte: − Se o número de lados for igual
 a 3 escrever TRIÂNGULO e o valor da área − Se
o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
− Se o número de lados for igual a 5
escrever PENTÁGONO.*/
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int lado;
        double centimetros;
        
        System.out.println("Informe a quantidade de lados do polígono regular: ");
        lado = read.nextInt();

        System.out.println("Informe o tamanho do lado em (cm) ");
        centimetros = read.nextDouble();

        if(lado == 3){
            /*Depende do triangulo*/
            System.out.println("É um trinângulo ");
        }   
        else if(lado == 4){
            
            System.out.println("É quadrado");

        }
        else if(lado == 5){
            System.out.println("É Pentagono");
            /*3/4*lado² * tan...*/
        }
    }
}
