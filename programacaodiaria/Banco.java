package ProgramcaoDiaria;
//Class pai que irá conter todas as outras class
public class Banco {
    static public class ExitDados{
        public void dados(String nome, String cpf, int conta, int agencia){
            System.out.println("Nome do titular: " + nome);
            System.out.println("CPF do titular: " + cpf);
            System.out.println("Conta do titular: " + conta);
            System.out.println("Agência do titular: " + agencia);
        }
    }

    static public class Saldo{
        public void saldo(double saldo){
        System.out.println("Seu saldo atual é: " + saldo);
        }
    }

    static public class Deposito{
        public double depositar(double saldo, double valor){
            double conta;
            // saldo = saldo + valor
            saldo += valor;

            return saldo;
        }
    }

    static public class Sacar{
        public double saque(double saldo, double  valor){
            
            // Verifica se o valor informado é maior que o saldo atual, ele bloqueia
            if(valor > saldo){
                System.out.println("Saldo indisponível para saque, veja o valor e tente novamente!");
            }
            //saldo = saldo - valor
            saldo -= valor;
            return saldo;
        }
    }
}
