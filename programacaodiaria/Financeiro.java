package ProgramcaoDiaria;
import java.util.*;

public class Financeiro{
    
    public static void main(String[] args) {
        
        //Import random
        Random generator = new Random();
        Scanner read = new Scanner(System.in);
        
        //Declaração de variáveis
        String nome , cpf;
        int agencia, conta;
        double saldo = 0, valor = 0;
        char menu;
        //Atribuição randomica para conta e agencia
        conta = generator.nextInt(100000);
        agencia = generator.nextInt(10000);

        // instâncias da class do arquivo banco. 
        Banco banco = new Banco();
        Banco.ExitDados dados = new Banco.ExitDados();
        Banco.Deposito deposito = new Banco.Deposito();
        Banco.Sacar sacar = new Banco.Sacar();
        Banco.Saldo consultarSaldo = new Banco.Saldo();
        
        System.out.println("Seja bem-vindo ao banco digital: ");
        
        System.out.println("Informe seu nome: ");
        nome = read.nextLine();

        System.out.println("Informe seu CPF: ");
        cpf = read.nextLine();

        do{
            System.out.println(" 1- Exibir dados bancários ");
            System.out.println(" 2- Consultar saldo ");
            System.out.println(" 3- Depositar saldo ");
            System.out.println(" 4- Sacar saldo  ");
            System.out.println(" 5- Sair do programa ");
            menu = read.next().charAt(0);

           switch(menu){
            
            case '1':
                dados.dados(nome, cpf, conta, agencia);
            break;

            case '2':   
                consultarSaldo.saldo(saldo);
            break;

            case '3':
                //Informa o valor e joga na função para atender os requisitos
                System.out.println("Informe o valor que deseja depositar: ");
                valor = read.nextDouble();
                saldo = deposito.depositar(saldo, valor);
            break;

            case '4':
                //Informa o valor e joga na função para atender os requistos
                System.out.println("Informe o valor que deseja sacar: ");
                valor = read.nextDouble();
                saldo = sacar.saque(saldo, valor);
            break;
            }
        }while(menu == 5);
    }
}