package beecrownd.calculoSimples;

import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Peca peca1 = new Peca();
        Peca peca2 = new Peca();

        peca1.setCodigo(sc.nextInt());
        peca1.setQuantidade(sc.nextInt());
        peca1.setValorUnitario(sc.nextDouble());

        peca2.setCodigo(sc.nextInt());
        peca2.setQuantidade(sc.nextInt());
        peca2.setValorUnitario(sc.nextDouble());

        double valorTotal = (peca1.getQuantidade() * peca1.getValorUnitario())
                + (peca2.getQuantidade() * peca2.getValorUnitario());

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }

}
