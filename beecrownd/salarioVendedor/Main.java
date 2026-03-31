package beecrownd.salarioVendedor;
import java.util.Scanner;

public class Main {

    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor();
        vendedor.setNome(sc.nextLine());
        vendedor.setSalarioFixo(sc.nextDouble());
        vendedor.setTotalVendas(sc.nextDouble());
        double salario = vendedor.getSalarioFixo() + (vendedor.getTotalVendas() * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", salario);
    }
}