package NewListJava.Exercicio15;

public class SomaInteiros {
    
    public static void main(String[] args) {
        InnerSomaInteiros.soma();
    }

    static class InnerSomaInteiros {
        static void soma(){
            int sum = 0;
            for(int i = 100; i <= 500; i++){
                sum += i;
            }
            System.out.println("A soma dos numeros de 100 até 500 é igual a " + sum);
        }
        
    }



    
}
/*15.Faça uma classe seguinte que calcule e imprima o somatório dos números existentes entre 100 e 500.*/