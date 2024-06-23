package NewListJava.Exercicio08;

public class MenorNumero {
    
    public static void main(String[] args) {
        System.out.println("Menor número " + GetNumeroMenor.menor(5,10));
       
    }
    public class GetNumeroMenor{
        public static int menor(int number, int num){
           int menor = Math.min(num, number);
            return menor;
        }
    } 
}
