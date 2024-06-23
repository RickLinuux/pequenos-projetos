public class MatrizDiagonal {
    
    public static void main(String[] args) {
    
        //chamada da função diagonal
        InnerMatrizDiagonal.diagonal();
    }


    static class InnerMatrizDiagonal {
        static void diagonal(){
            int[][] matriz = new int[4][4];
            int cont = 1;
            
            for(int i = 0; i < 4; i++){
                System.out.println();
                for(int j = 0; j < 4; j++){
                    matriz[i][j] = cont++;
                    System.out.print(" | " + matriz[i][j] + " | ");
                }
            }
            System.out.println();

            System.out.println("Diagonal principal da matriz 4x4");
            for(int x = 0; x < matriz.length; x++){
                System.out.println(matriz[x][x]);
            }

            int i = 3;
            System.out.println("Diagonal secundaria da matriz 4x4") ;
            for(int x = 0; x < matriz.length; x++){
                // primeira forma
                System.out.println(matriz[x][i--]);    
            }

            double elementos = 0d;
            for(int x = 0; x < matriz.length; x++){
                for(int y = 0; y < matriz.length; y++){
                    elementos += matriz[x][y];
                }
            }
            elementos /= (cont-1);
            
            System.out.printf("A média de todos os elementos da matriz é igual a %.2f\n" , elementos);
        }
        
    }
}
/*24.Faça uma classe seguinte que leia uma matriz quadrada de ordem 4x4 e forneça as seguintes informações:
a-Imprima os elementos da diagonal principal;
b-Imprima os elementos da diagonal secundária;
c-Imprima a média aritmética de todos os elementos da matriz.*/
