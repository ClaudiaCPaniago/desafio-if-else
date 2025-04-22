import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de acesso: ");
        int codigo = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o nível de permissão: ");
        int nivel = Integer.parseInt(scanner.nextLine());

        boolean codigoValido = (codigo == 2023);
        boolean nivelValido = (nivel == 1 || nivel == 2 || nivel == 3);

        if (codigoValido && nivelValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado!");
            System.out.print("Motivo: ");
            if (!codigoValido && !nivelValido) {
                System.out.println("Código incorreto e nível de permissão inválido.");
            } else if (!codigoValido) {
                System.out.println("Código incorreto.");
            } else {
                System.out.println("Nível de permissão incorreto.");
            }
        }

        scanner.close();
    }
}


