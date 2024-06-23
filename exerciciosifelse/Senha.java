package exerciciosifelse;
import java.util.*;
public class Senha {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int password;

        System.out.println("Informe sua senha: ");
        password = read.nextInt();

        if(password == 1234){
            System.out.println("Acesso permitido");
        }
        else{
            System.out.println("Acesso negado. ");
        }

    }
}
