import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do doador: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o peso do doador (em kg): ");
        int peso = Integer.parseInt(scanner.nextLine());

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compatível.");
        } else {
            System.out.println("O doador não é compatível.");
            System.out.print("Motivo: ");
            if (!idadeValida && !pesoValido) {
                System.out.println("Deve ter entre 18 e 65 anos e pesar mais de 50 kg.");
            } else if (!idadeValida) {
                System.out.println("Deve ter entre 18 e 65 anos.");
            } else {
                System.out.println("Deve pesar mais de 50 kg.");
            }
        }
    }
}





