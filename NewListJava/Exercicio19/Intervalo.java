package NewListJava.Exercicio19;

public class Intervalo {
    
    public static void main(String[] args) {
        InnerIntervalo.Intervalo(10, 10);
    }


    static class InnerIntervalo {
        static void Intervalo(int a, int b){
            int sum = 0;
            for(int i = a; i <= b; i++){
                sum += i;
            }
            System.out.println("A soma do intervalo " + a + ", " + b+ " é igual a " + sum);
        }
        
    }
}


/*19.Faça uma classe sequencial que dados os limites de um intervalo [a; b], 
informe a soma de todos os números
naturais neste intervalo. Exemplo: [4, 7] => 4+5+6+7=22.*/