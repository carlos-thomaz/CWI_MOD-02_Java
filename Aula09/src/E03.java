import java.util.Scanner;

class E03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE; // Inicia o valor com o menor número possível.

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um número: ");
            numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número informado foi " + maior);
    }

}