package NewListJava.Exercicio31;

public class AnoBissexto {

    public static void main(String[] args) {
        int ano = 1200;
        int mes = 2;
        int dias = 0;

    /**
     * 1200 por exemplo: 
     * ((ano % 4 == 0 && !(ano % 100 == 0)) || ano % 400 == 0)
     *      VERDADEIRO                falso            verdadeiro
     *         falso verdadeiro = verdadeiro
     * 
     * 1700 por exemplo
     * ((ano % 4 == 0 && !(ano % 100 == 0)) || ano % 400 == 0)
     *      verdadeiro          falso                falso
     *          
     * 
     **/
     boolean anoBissexto = ((ano % 4 == 0 && !(ano % 100 == 0)) || ano % 400 == 0);
     switch (mes) {
        case 1:
            dias = 31;
            break;

        case 2:
            if(anoBissexto){
                dias = 29;
            }
            else{
                dias = 28;
            }
            break;
        
        case 3:
            dias = 31;
            break;
        
        case 4:
            dias = 30;
            break;

        case 5:
            dias = 31;
            break;
        
        case 6:
            dias = 30;
            break;

        case 7:
            dias = 31;
            break;

        case 8:
            dias = 31;
            break;

        case 9:
            dias = 30;
            break;

        case 10:
            dias = 31;
            break;

        case 11:
            dias = 30;
            break;

        case 12:
            dias = 31;
            break;
        default:
        System.out.println("Mês não suportado!");
    }
        System.out.println(dias+"/"+ mes+ "/" + ano);
    }
}



