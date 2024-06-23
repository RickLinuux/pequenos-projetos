package NewListJava.Exercicio20;

public class SomaMatrizes {
    
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];

        SomaMatrizesInternas.somar(matriz);
    }

    static class SomaMatrizesInternas {
        static void somar(int[][] matriz){
            int sum = 0, rows = 1;

            for(int x = 0; x < matriz.length; x++){
                System.out.println();
                for(int y = 0; y < matriz[x].length; y++){
                    matriz[x][y] = rows++;
                    System.out.print(" | "+ matriz[x][y] + " | ");
                }
            }  

            for(int x = 0; x < matriz.length; x++){
                System.out.println();
                for(int y = 0; y < matriz[x].length; y++){
                    if(matriz[x][y] % 2 == 0){
                        sum += matriz[x][y];
                    }

                }
            }  
            System.out.println("A soma de todos os elementos pares é igual a " + sum);
            
            



        }
        
    }
    /*20.Faça uma classe sequencial que dê um conjunto
     de 20 elementos numéricos, informe a soma de todos os
números pares.*/
}
