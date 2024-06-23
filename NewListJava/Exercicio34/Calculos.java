package NewListJava.Exercicio34;

public class Calculos {
    public static void main(String[] args) {
        double item = 2.95;
        double prod = 3.50;
        
        System.out.println("O item 1 custa " + item + "\nO item dois custa " + prod);
        double custoTotal = item + prod;
        System.out.println("O custo total é igual " + custoTotal);

        final double TAXA = 8.25/100;
        
        double taxaCalculada = custoTotal * TAXA;
        System.out.printf("o custo total com a  taxa de 8.25%% é igual a %.2f\n" , taxaCalculada);
        
        double custoNovo = ((item+prod)*TAXA);
        boolean muitoCaro = custoNovo > 10 ? true : false;
        
        System.out.printf("O novo custo é %.2f\n" , custoNovo);
        System.out.printf("É muito caro? %b\n" , muitoCaro);
    }
}


/*34.Crie um programa seguindo as orientações abaixo. Faça tudo que pede dentro do método main.
a) Declare duas variáveis para armazenar os valores de dois itens de venda. Os valores dos dois itens devem ser
2.95 e 3.50. Pense em nomes significativos para as variáveis e também considere qual deve ser seu tipo.

b) Use o System.out.println() para mostrar o conteúdo de suas variáveis. 

Execute o programa e veja a saída.

Apresente uma mensagem significativa como “O Item 1 custa 2.95 e ...” (Dica : utilize o operador + para concatenar
o texto com o valor da variável).

c) Declare uma outra variável para armazenar o custo total dos itens. Utilize o operador de adição para realizar o
cálculo e imprima o resultado.

d) Crie uma constante para armazenar a taxa de 8.25 % que deve ser cobrada sobre o valor total. Armazene o
cálculo numa variável chamada taxaCalculada e imprima o resultado.

e) Adicione ao valor de cada item o valor da taxa calculado. Use a menor linha de código possível para fazer isso.
Some novamente os dois valores e atribua o resultado a uma variável chamada novoCusto.

f) Crie uma variável booleana chamada muitoCaro. Escreva uma assertiva lógica para setar esta variável para true
se novoCusto for maior que 10 e para false caso contrário. Imprima o valor obtido em muitoCaro. (Não utilize if
para escrever a assertiva.)*/