public class Aumento {
    public static void main(String[] args) {
        Double produto = 1000.0; 
        
        System.out.println(aumentoSuce(produto));


        
    }
    public static String aumentoSuce(Double valor){
        valor *= (1 + 0.25);
        return "O novo valor com o aumento de 25% é igual a " + String.format("%.2f", valor);
     }
    
}
