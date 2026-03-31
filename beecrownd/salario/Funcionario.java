class Funcionario{
    private int horasTrabalhadas;
    private float valorPorHora;
    private int id;

    public Funcionario(int id, int horasTrabalhadas, float valorPorHora){
        this.id = id;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public int getId(){
        this.id = id;
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public int getHorasTrabalhadar(){
        this.horasTrabalhadas = horasTrabalhadas;
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorPorHora(){
        this.valorPorHora = valorPorHora;
        return valorPorHora;
    }

    public void setValorPorHora(float valorPorHora){
        this.valorPorHora = valorPorHora;
    }



    
}