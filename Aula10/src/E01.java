import java.util.Scanner;

class E01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] primeiroVetor = new int[5];
        for (int i = 0; i < primeiroVetor.length; i++) {
            System.out.println("Insira o valor da posição " + i);
            primeiroVetor[i] = scan.nextInt();
        }

        int[] segundoVetor = new int[primeiroVetor.length];
        for (int i = 0; i < primeiroVetor.length; i++) {
            segundoVetor[i] = primeiroVetor[i] * 2;
        }

        System.out.println("Primeiro Vetor: ");
        for (int item : primeiroVetor) {
            System.out.println(item);
        }

        System.out.println("Segundo Vetor: ");
        for (int item : segundoVetor) {
            System.out.println(item);
        }

    }

}