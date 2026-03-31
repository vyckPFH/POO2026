package beecrownd.gastoCombustivel;

class Automovel {
    private int tempoGasto;
    private int velocidade;
    private double consumo;

    public Automovel() {
    }

    public Automovel(int tempoGasto, int velocidade, double consumo) {
        this.tempoGasto = tempoGasto;
        this.velocidade = velocidade;
        this.consumo = consumo;
    }

    public int getTempoGasto() {
        return tempoGasto;
    }

    public void setTempoGasto(int tempoGasto) {
        this.tempoGasto = tempoGasto;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

}
