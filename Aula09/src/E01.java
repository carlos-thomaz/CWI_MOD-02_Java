import java.util.Scanner;

class E01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma nota entre zero e dez: ");

        boolean notaValida = false;
        do {
            double notaInformada = scan.nextDouble();
            if (notaInformada >= 0 && notaInformada <= 10) {
                notaValida = true;
                System.out.println("Nota válida: " + notaInformada);
            } else {
                System.out.println("Nota inválida! Insira uma nota entre zero e dez.");
            }

        } while (!notaValida);

    }

}