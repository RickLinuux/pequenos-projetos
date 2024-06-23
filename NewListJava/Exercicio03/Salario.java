import java.util.*;
public class Salario {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Imposto  ip = new Imposto();
        System.out.println("Informe Seu Salário para calcular o imposto de renda ");
        Double salario = read.nextDouble();

        ip.impRenda(salario);

    }
}
