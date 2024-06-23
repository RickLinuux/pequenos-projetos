public class FaixaEtaria {
    
    public static void main(String[] args) {
        // Inicia a matriz com informações sobre um grupo de 50 pessoas
        String[][] matriz = {
            {"Faixa Etária", "Quantidade"},
            {"0 a 15 anos", "10"},
            {"16 a 30 anos", "15"},
            {"31 a 45 anos", "8"},
            {"46 a 60 anos", "10"},
            {"Mais de 60 anos", "7"}
        };
        // Variável criada para armazenar a soma dos valores na segunda coluna
        int total = 0;
        for(int i = 1; i < matriz.length; i++){
            // Converte o valor na segunda coluna da matriz para um inteiro
            total += Integer.parseInt(matriz[i][1]);
        }
        
        System.out.println("Faixa Etária | Quantidade | Porcentagem");
        for(int i = 1; i < matriz.length; i++){
            // Converte para double o valor na segunda
            // coluna da matriz para obter precisão nos cálculos de porcentagem
            double porcentagem = (double) Integer.parseInt(matriz[i][1]) / total * 100;
            System.out.printf("%s | %s | %.2f%%\n", matriz[i][0], matriz[i][1], porcentagem);
        }
    }
}
