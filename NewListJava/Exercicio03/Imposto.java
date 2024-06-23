/*Faça uma classe seguinte que dê o salário de um funcionário, informe o valor do imposto de renda a ser pago, 
sabendo que o imposto equivale a 5% do salário*/
public class Imposto {
    
    public void impRenda(double salario){
        double resultado =  salario * 0.05;
        System.out.println("O imposto a ser pago " + resultado + "R$");
    }
}
