    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o segundo número: ");
        int numero2 = Integer.parseInt(scanner.nextLine());

        if (numero1 > numero2) {
            System.out.println("O maior número é " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}