import java.util.Scanner;

class E04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número que deseja gerar a tabuada:");
        int numero = scan.nextInt();

        System.out.println("Tabuada do " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
}