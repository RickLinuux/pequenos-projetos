import java.util.*;
public class Peso {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe seu peso atual: ");
        double peso = read.nextDouble();

        System.out.println("Informe o peso desejado após o emagracimento");
        double pesoDesejado = read.nextDouble();

        Emagreciamento.calcular(peso, pesoDesejado);
        read.close();
    }

    public static class Emagreciamento{
        static void calcular(Double peso, Double pesoDesejado){
            Double pesoAtual = peso - pesoDesejado;
            Double newPeso = (pesoAtual / peso) * 100;
            System.out.printf("O percentual que você deve perder é igual a %.2f%%\n" , newPeso);
        }
    }
}
