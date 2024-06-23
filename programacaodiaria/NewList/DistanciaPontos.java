public class DistanciaPontos {

    public static void main(String[] args) {
        calcularPontos(3, 5, 6, 1);
    }

    static void calcularPontos(int x, int x1, int y, int y1){
        double distancia = Math.sqrt(Math.pow((x1-x), 2) + Math.pow((y1-y), 2));
        System.out.println("A distância entre dois pontos é igual a " + distancia);
    }
}
