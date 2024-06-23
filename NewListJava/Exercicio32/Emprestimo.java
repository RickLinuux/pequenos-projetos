package NewListJava.Exercicio32;

public class Emprestimo {
    public static void main(String[] args) {
        int dataAtual = 28;
        int mes = 2; 
        int ano = 2024;
        int dias = 5;

        dataAtual += dias;
    
        if (dataAtual > 30) {
           
            dataAtual -= 30;
            mes++;
            if (mes > 12) {
                mes -= 12;  
                ano++;  
            }
        }
        System.out.println("Data da Devolução: " + dataAtual + "/" + mes + "/" + ano);

    }
}




/*32.Considere que a data que você escolheu é a data de empréstimo de uma mercadoria e que é necessário saber
qual a data de devolução da mesma. A data de devolução é a data atual mais 3 dias.

a) Declare três variáveis para controlarem o dia , mês e ano da data de devolução e uma outra com a quantidade de
dias de empréstimo (inicializada com 3).

b) Crie o código para calcular a adição do tempo de empréstimo com a data escolhida. A saída deve se assemelhar a
algo como :

Data do Empréstimo : 28/02/2024
Número de Dias : 5
Data da Devolução : ??/??/2024

Preste atenção na saída acima. A soma de três dias na data de empréstimo resultou na passagem de um mês para
outro. Além disso, como o ano 2024 não é bissexto e o mês de empréstimo foi fevereiro, ao somar-se 5 dias os dias
que se passaram foram : 28/2 – 1/2 – 2/3 . Você deve estar atento também para :
• Se o empréstimo passar de um mês para outro o mês deve ser incrementado
• Se o empréstimo passar de um ano para outro o ano dever ser incrementado

public class Main {
    public static void main(String[] args) {
        int dataAtual = 30;
        int mes = 2; 
        int ano = 2024;
        int dias = 10;

        // Adicione os dias ao dia atual
        dataAtual += dias;

        // Verifique se a data de entrega excede o último dia do mês
        if (dataAtual > 30) {
            // Subtraia o número de dias no mês para obter o novo dia
            dataAtual -= 30;

            // Incremente o mês
            mes++;

            // Verifique se o mês excede 12, indicando uma mudança de ano
            if (mes > 12) {
                mes -= 12;  // Volte para Janeiro
                ano++;  // Incrementa o ano
            }
        }

        System.out.println("Data da Devolução: " + dataAtual + "/" + mes + "/" + ano);
    }
}
*/