    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = Double.parseDouble(scanner.nextLine());

        double desconto = valorCompra * 0.10;
        double valorFinal = valorCompra - desconto;

        if (valorCompra >= 100.00) {
            System.out.println("Desconto de 10% aplicado.");
            System.out.printf("Novo valor: R$ %.2f%n", valorFinal);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.printf("Valor total: R$ %.2f%n", valorCompra);
        }

        scanner.close();
    }
}
