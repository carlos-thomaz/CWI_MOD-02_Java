import java.util.Scanner;

class E01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número");
        int primeiroNumero = scan.nextInt();

        System.out.println("Insira o segundo número");
        int segundoNumero = scan.nextInt();

        int resultado = primeiroNumero + segundoNumero;

        System.out.println("A soma dos números é " + resultado);
    }

}