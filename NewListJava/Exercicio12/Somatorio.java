package NewListJava.Exercicio12;
/*12.Faça uma classe seguinte que calcule e imprima o somatório de todos os números inteiros existentes entre 200
e 400.*/
public class Somatorio {
    
    public static void main(String[] args) {
        InnerSomatorio.soma();
    }
    static class InnerSomatorio {
        static void soma(){
            int sum = 0;
            for(int i = 200; i <= 400; i++){
                sum += i;
            }
            System.out.println("A soma de todos os números inteiro e " + sum);
        }
        
    }
}
