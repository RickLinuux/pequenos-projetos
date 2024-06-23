package NewListJava.Exercicio09;

import java.util.Scanner;

/*9.Crie uma classe de nível Java que receba dois números e execute as operações especiais abaixo
de acordo com a escolha do usuário.
Escolha do usuárioOperação
1-Média entre os números digitados
2-Diferença do maior pelo menor
3-Produto entre os números digitados
4-Divisão do primeiro pelo segundo*/
public class Operacoes {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe um número qualquer: ");
        double valor = read.nextDouble();

        System.out.println("Informe outro número qualquer: ");
        double number = read.nextDouble();

        System.out.println("Escolha uma opção a ser executada");
        Calculos.menu();
        int menu = read.nextInt();
        
        System.out.println(Calculos.calcularOperacao(menu,valor,number));
        read.close();

    }

    static class Calculos{
        static void menu(){
            System.out.println("1-Média entre os números digitados");
            System.out.println("2-Diferença do maior pelo menor");
            System.out.println("3-Produto entre os números digitados");
            System.out.println("4-Divisão do primeiro pelo segundo");
        }

        static String calcularOperacao(int menu ,double valor, double number){
            if(menu == 1){
                Double media = (valor + number)/2;
                return "A média entre os valores " + valor + ", " + number + " é igual a " + media;
            }else if(menu == 2){
                Double maior = Math.max(valor, number);
                Double menor = Math.min(valor, number);
                return "A diferença do maior numero para o menor é" + (maior - menor);
            }else if(menu == 3){
                return "O produto entre " + valor + ", " + number + " é igual a " +(valor * number);
            }else if(menu == 4){
                if(number == 0){
                    return "Operação não suportada";
                }
                else{
                    return "O resultado da divisão é igual a " + (valor/number);
                }
            }else{
                return "Opção não suportada, escolha valores entra 1 e 4 ";
            }
        }
    }
}
