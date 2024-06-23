package NewListJava.Exercicio17;

public class Divisor {
    
    public static void main(String[] args) {
        InnerDivisor.divisor(10);
    }

    static class InnerDivisor {
        static void divisor(int num){
            if(num % 5 == 0){
                System.out.println("O número " + num + " é divisivel por 5");
            }else{
                System.out.println("O número " + num + " não é divisivel por 5");
            }
        }
        
    }
}
