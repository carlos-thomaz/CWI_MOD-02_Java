import java.util.Scanner;

class E02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a primeira nota");
        double primeiraNota = scan.nextDouble();

        System.out.println("Insira a segunda nota");
        double segundaNota = scan.nextDouble();

        System.out.println("Insira a terceira nota");
        double terceiraNota = scan.nextDouble();

        System.out.println("Insira a quarta nota");
        double quartaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        System.out.println("A média é " + media);

    }

}