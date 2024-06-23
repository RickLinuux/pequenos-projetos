package exerciciosifelse;
import java.util.*;
public class Maca {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int maca;

        System.out.println("Maças 0.30 centavos");
        System.out.println("Maças 0.25 centavos sendo uma duzia");
        System.out.println("Informe a quantidade de maças");
        maca = read.nextInt();

        if(maca >= 12){
            System.out.println("O valor total a ser pago é igual a " + (maca * 0.25));
        }
        else{
            System.out.println("O valor total a ser pago é igual a " + (maca * 0.30));
        }
    }
}
