import java.util.*;
public class PessoaInfo {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        //variaveis
        char sexo;
        String altura;
        String idade;
        String[][] matriz = new String[50][3];

        for(int i = 0; i < 50; i++){
            System.out.println((i+1) +"º Informe seu sexo [M ou F]");
            sexo = read.next().charAt(0);
            read.nextLine();

            System.out.println("Informe sua altura");
            altura = read.nextLine();

            System.out.println("Informe sua idade");
            idade = read.nextLine();
            
            matriz[i][0] = Character.toString(sexo);
            matriz[i][1] = altura;
            matriz[i][2] = idade;
        }
        InnerIdadeSexo.calcularInfo(matriz);
    }   
    
    static class InnerIdadeSexo {
        static void calcularInfo(String[][] matriz){
            System.out.println("Sexo    | Altura  | Idade");
            for(int x = 0; x < 50; x++){
                System.out.println();
                for(int y = 0; y < 3; y++){
                    System.out.print(" | "+ matriz[x][y] + " | ");
                }
            }

            //Maior e menor altura sendo pegada
            double menorAltura = 5d;
            double maiorAltura = 0d;
            double total = 0d;
            for(int x = 0; x < 50; x++){
                //Converter os valores da segunda  coluna da matriz para double
                total = Double.parseDouble(matriz[x][1]);
                if(total > maiorAltura){
                    maiorAltura = total;
                }
                
                if(total < menorAltura){
                    menorAltura = total;
                }
            }
            //media das mulheres
            double alturaMulheres = 0d;
            int count = 0;
            for(int x = 0; x < matriz.length; x++){
                if(matriz[x][0].equals("F")) {
                    count++;
                    alturaMulheres += Double.parseDouble(matriz[x][1]);
                }
            }
            double mediaMulheres = alturaMulheres / count;

            //Maior idade
            int idadeHomem = 0; 
            int testeIdade;
            for(int x = 0; x  < matriz.length; x++){
                if(matriz[x][0].equals("M")){
                    testeIdade = Integer.parseInt(matriz[x][2]);
                    if(testeIdade > idadeHomem){
                        idadeHomem = testeIdade;
                    }
                }
            }
        
            System.out.println("\nMaior altura: " + maiorAltura + "\nMenor altura: " + menorAltura);
            System.out.printf("A média das alturas do grupo das mulheres: %.2f" , mediaMulheres);
            System.out.println("A maior idade do grupo dos homens " + idadeHomem);
        }
    }
}
/*23.Faça uma aula seguinte que leia a altura, a idade e o sexo de 50 pessoas e forneça o seguinte
informações:
a-A maior altura e a menor altura;
b-A média de altura de mulheres;
c-A idade do homem mais velho.
.*/