package exerciciosifelse;
import java.util.*;
public class pentagonoDois {
    /*Acrescente as seguintes mensagens à solução
    do exercício anterior conforme o caso. − Caso o número de
lados seja inferior a 3 escrever NÃO É UM POLÍGONO. − 
Caso o número de lados seja superior a 5 escrever
POLÍGONO NÃO IDENTIFICADO.*/

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
        else if(lado < 3){
            System.out.println("Não é um poligono");
        }
        if(lado > 5){
            System.out.println("Poligono não identificado");
        }
    }
}
