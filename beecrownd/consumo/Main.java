package beecrownd.consumo;

import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Automovel automovel = new Automovel();
        automovel.setDistanciaPercorrida(sc.nextInt());
        automovel.setCombustivelGasto(sc.nextDouble());
        double consumo = automovel.getDistanciaPercorrida() / automovel.getCombustivelGasto();
        System.out.printf("%.3f km/l\n", consumo);
    }
}
