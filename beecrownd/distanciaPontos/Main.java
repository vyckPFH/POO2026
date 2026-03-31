package beecrownd.distanciaPontos;

import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Plano p1 = new Plano();
        Plano p2 = new Plano();

        p1.setX(sc.nextDouble());
        p1.setY(sc.nextDouble());

        p2.setX(sc.nextDouble());
        p2.setY(sc.nextDouble());

        double distancia = calcularDistancia(p1, p2);
        System.out.printf("%.4f\n", distancia);
    }

    public static double calcularDistancia(Plano p1, Plano p2){
        double distancia = Math.sqrt( Math.pow( p2.getX() - p1.getX(), 2 ) + Math.pow( p2.getY() - p1.getY(), 2 ) );
        return distancia;
    }
}
