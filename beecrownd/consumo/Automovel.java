package beecrownd.consumo;

class Automovel {
    private int distanciaPercorrida;
    private double combustivelGasto;

    public Automovel() {
    }

    public Automovel(int distanciaPercorrida, double combustivelGasto) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }
    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }
    public double getCombustivelGasto() {
        return combustivelGasto;
    }
    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }


}
