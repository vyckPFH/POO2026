public class TrianguloEquilatero implements Poligono { /* 10/03/2026 */

    

    private Double lado;

    public TrianguloEquilatero() {
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }


    
    @Override
    public double calcularArea() {
        return lado*lado/2;
        
    }

    @Override
    public double calcularPerimetro() {
    return 3*lado;    
        
    }
    
}
