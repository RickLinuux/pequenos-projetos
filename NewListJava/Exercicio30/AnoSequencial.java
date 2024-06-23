public class AnoSequencial {
    
    public static void main(String[] args) {
        
        int diaInicial = 19;
        int diaFinal = 31; 

        // DiaInicial começa em 19 por exemplo
        // faz 19 + 10 = 29
        // dia final é 31
        // 29 <= 31 = verdadeiro
        if(diaInicial + 10 <= diaFinal) {
            // diaFinal recebe = 19 + 9
            // DiaFinal = 28
            diaFinal = diaInicial + 9;
        }

        for(int i = diaInicial; i <= diaFinal; i++){
            System.out.println(i + "/" + "1/" + "2000");
        }
    }
}
