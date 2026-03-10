public class TrianguloRetangulo implements Poligono { /* 10/03/2026 */
    private double catA;
    private double catB;
    private double hip;

    @Override
    public double calcularArea() {
        return (catA * catB) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return catA + catB + hip;
    }

}
