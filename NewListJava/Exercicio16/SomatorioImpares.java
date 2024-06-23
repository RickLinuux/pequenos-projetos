package NewListJava.Exercicio16;

public class SomatorioImpares {
    
    public static void main(String[] args) {
        InnerSomatorioImpares.soma();
    }

    static class InnerSomatorioImpares {
        static void soma(){
            int sum = 0;

            for(int i = 300; i <= 700; i++){
                if(i % 2 != 0 ){
                    sum += i;
                }
            }
            System.out.println("A soma é igual a " + sum);
        }
       
        
    }


    /*16.Faça uma classe seguinte que calcule e 
    imprima o somatório dos números impares existentes em 300 e 700.*/
}
