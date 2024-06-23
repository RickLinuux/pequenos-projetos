package NewListJava.Exercicio11;
import java.util.ArrayList;
import java.util.Scanner;

public class Alunos {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        for(int i = 0; i < 5000; i++){
            try {
                System.out.println("Informe a " + (i+1) + "º nota");
                notas.add(read.nextDouble());
            } 
            catch (Exception e) {
                System.out.println("Por favor, insira um número válido.");
                i--; 
            }
            read.nextLine(); 
        }  
        System.out.println("Todas as notas dos 5000 alunos");
        for(Double valor: notas){
            System.out.println(valor);
        }
        read.close();
    }
}
