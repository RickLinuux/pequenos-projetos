package NewListJava.Exercicio18;

public class PrestacaoMaxima {

    public static void main(String[] args) {
        double salario = 3.500, prestacao = 450;
        InnerPrestacaoMaxima.calculo(salario, prestacao);  
    }

    static class InnerPrestacaoMaxima {
        static void calculo(double salario, double prestacao){
            Double salarioMedio  =  salario * (25.0/100);

            if(prestacao > salarioMedio){
                System.out.println("O empréstimo não poderá ser concedido, a prestação ultapassou 25% do salario bruto!");
            }
            else{
                System.out.println("Poderá pegar o empréstimo ");
            }
        }
        
    }
}
