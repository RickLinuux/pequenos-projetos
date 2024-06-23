/*Faça uma classe seguinte que dados a distância percorrida (em Km) e o tempo gasto em uma viagem (em horas) e 
calcular e informar a velocidade média do carro, sabendo que Velocidade =DeltaS/ DeltaT (variação de distância / 
variação do tempo*/
public class DeltaS {
    public void veleocidadeMedia(double hora, double km){
        Double velocidade = km / hora;
        System.out.println("A velocidade média é igual a " + velocidade + "Km/h");
    }
}
