package NewListJava.Exercicio13;
/*13.Faça uma classe sequencial que calcule e imprima a média do somatório dos números inteiros existentes entre
500 e 700.*/
public class Soma {
    
    public static void main(String[] args) {
       InnerSoma.soma();
    }
    static class InnerSoma {
        static void soma(){
            int sum = 0; 
            for(int i = 500; i <= 700; i++){
                sum += i;
            }
            System.out.println("A soma dos inteiros nos intervalos é " + sum);
        }
        
    }
}
