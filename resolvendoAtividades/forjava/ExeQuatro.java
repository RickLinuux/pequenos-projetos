package problemsinvolvingties.forjava;
import java.util.*;
public class ExeQuatro {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int totalStudent; 
        double sum = 0;

        System.out.println("Informe o total de alunos na sala: ");
        totalStudent = read.nextInt();

        for(int i = 1; i <= totalStudent; i++){
            System.out.println("Informe a nota do " + i + " aluno(a)");
            double note = read.nextDouble();
            sum += note;
        }
        sum /= totalStudent;
        System.out.println();
        System.out.println("A média das notas da turma é igual " + sum);

    }
}
