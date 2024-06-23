package NewListJava.Exercicio35;

public class Comprimento {
 
    public static void main(String[] args) {
        long Long = 100;
        int int1 = 200;
        int int2 = int1 + Long;


        /*O erro é bem simples, afinal declaramos uma variavel com tipagem long, ou seja na memoria
         * criou-se um espaço de 8 bytes, quando tentamos jogar o valor que é 100 mais o restante 
         * do espaço na variavel "int", acaba não suportando, porque o maximo que int consegue armazenar
         * é igual 4bytes!
        */
    }
}
/*35.Declare uma variável chamada Long do tipo long e a inicialize com 100. Agora declare duas variáveis do tipo int,
int1 e int 2, e inicialize int1 com 200. Agora faça int2 receber int1 mais Long e explique os resultados. Arrume o
código para que não ocorra o erro anterior.*/