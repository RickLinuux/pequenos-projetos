    import java.util.*;

    public class Locadora {
        public static void main(String[] args) {
            System.out.println("Temos 100 fitas na nossa locadora. Cada fita custa 25 R$ para alugar.");
            System.out.println("Se atrasar a entrega da fita, é cobrado uma multa de 10% sobre o valor inicial.");

            double qtdFitas = 100;
            LocalFitas.video(qtdFitas);
        }

        static class LocalFitas {
            static void video(double fitas) {

                // Fitas que são alugadas aproximadamente 33
                // um terço de 100, aproximadamente 33.33
                double fitasMes = fitas / 3;

                // Faturamento anual
                double faturaAnual = fitasMes * 25 * 12;
                System.out.println("O faturamento anual é: R$ " + faturaAnual);

                // Calculo do valor ganho com multas por mês
                double fitasAtrasadas = fitasMes / 10;
                double valorMulta = 25 * 0.10;
                double valorMultas = fitasAtrasadas * valorMulta;
                System.out.println("O valor ganho com multas por mês é: R$ " + valorMulta);
            }
        }
    }
