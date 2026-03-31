package beecrownd.gastoCombustivel;

import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Automovel automovel = new Automovel();
        automovel.setTempoGasto(sc.nextInt());
        automovel.setVelocidade(sc.nextInt());
        automovel.setConsumo(12);

        double distancia = automovel.getVelocidade() * automovel.getTempoGasto();
        double gastoCombustivel = distancia / automovel.getConsumo();
        System.out.printf("%.3f\n", gastoCombustivel);

    }
    

}
