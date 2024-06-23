package NewListJava.Exercicio14;
/*14.Faça uma classe sequencial que dê um número inteiro, calcule e imprima o seu fatorial. Ó fatorial de um número
n é n * n-1 * n-2 ... até n = 1. Por exemplo, o fatorial de 4 é 24 ( 4 * 3 * 2 * 1).*/
public class Fatorial {
    
    public static void main(String[] args) {
        int num = 7;
       CalcularFat.fatorial(num);
        

    }
    static class CalcularFat{
        static void fatorial(int num){
            int fat = 1;
            String formula = "";
            for(int i = 1; i <= num; i++){
                fat *= i;
                if(num == 0){
                    System.out.println("Fatorial é igual a 1");
                    break;
                }
                else if(i < num){
                    formula += i + " X ";
                }
                else{
                    formula += i;
                }
            }
            System.out.println("O fatorial de " +num + " é igual a ");
            System.out.println(formula + " = " + fat);
        }
    }
}
