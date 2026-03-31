import java.util.Scanner;

public class Main {

    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int id = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();        
        float valorPorHora = sc.nextFloat();

        Funcionario funcionario = new Funcionario(id, horasTrabalhadas, valorPorHora);
        double salario = funcionario.getHorasTrabalhadar() * funcionario.getValorPorHora();
        System.out.printf("NUMVER = %d%n", funcionario.getId());
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}