public class Escolha {
    
    public static void main(String[] args) {
    
        int mes = 1;
        int dias = 0;
        int ano = 2000;
    
        switch (mes) {
            case 1:
                dias = 31;
                break;

            case 2:
                dias = 28;
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
        System.out.println(dias + "/" + mes + "/" + ano);

    }
}
