import java.util.Scanner;

class E03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor/hora");
        double valorHora = scan.nextDouble();

        System.out.println("Insira a quantidade de horas trabalhadas");
        double horasTrabalhadas = scan.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("O salário é " + salario);
    }

}