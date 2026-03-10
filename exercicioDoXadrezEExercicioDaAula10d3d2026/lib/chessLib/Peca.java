public abstract class Peca { /* 10/03/2026 */
    /*    Uma peça de xadrez qualquer, possui atributos/considerações genericas
    */

    private String cor;
    private int nextPos;
    private int posAtual;
  
    public Peca(String cor, int nextPos, int posAtual) {
        this.cor = cor;
        this.nextPos = nextPos;
        this.posAtual = posAtual;

        
    }


    public void mover(int posAtual, int nextPos){}



    public Peca() {}

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public int getNextPos() { return nextPos; }
    public void setNextPos(int nextPos) { this.nextPos = nextPos; }
    public int getPosAtual() { return posAtual; } 
    public void setPosAtual(int posAtual) { this.posAtual = posAtual;}
   
}
