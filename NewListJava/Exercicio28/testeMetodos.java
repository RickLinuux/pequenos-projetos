/**
 * Trecho que está com erro, {System.out.println("O valor de texto é : " + msg.concat("Esta frase foi
 * acrescentada ao objeto dentro do método!"));}
 * 
 * O erro é sobre a concatenação, onde ocorreu uma quebra de linha, porém, o padrão não foi respeitado.
 * Para que a concatenação seja feita e garanta o funcionamento do código, devemos utilizar alguns meios 
 * para solucionar, que pode ser este, por exemplo:
 * 
 * Correção:
 * {System.out.println("O valor de texto é : " + msg.concat("\nEsta frase foi "+
 * "acrescentada ao objeto dentro do método!"));}
 * 
 * Acrescentar uma '\n' e passar o '+' para indicar uma concatenação com o próximo texto dentro das aspas.
 * Assim, o código garante o seu funcionamento adequado.
 *
 * Uma coisa extra que pode ser tratada é a identação do código, que está fora de ordem!
 * 
 * **/


public class testeMetodos{
    public testeMetodos() {
    }
    public void concatMsg (String msg){
    System.out.println("O valor de texto é : " + msg.concat("\nEsta frase foi "+
    "acrescentada ao objeto dentro do método!"));
    }
    public static void main(String[] args) {
    testeMetodos testeMetodos1 = new testeMetodos ();
    String texto = new String("Texto inicial!");
    System.out.println("O valor de texto é : " + texto);
    testeMetodos1.concatMsg(texto);
    System.out.println("O valor de texto é : " + texto);
    }
    }