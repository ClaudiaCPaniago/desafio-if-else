import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String diaDaSemana = scanner.nextLine();

        // Usando switch para verificar o dia da semana
        switch (diaDaSemana) {
            case "segunda":
            case "terca":
            case "quarta":
            case "quinta":
            case "sexta":
                System.out.println(diaDaSemana.substring(0, 1).toUpperCase() + diaDaSemana.substring(1) + " é um dia útil.");
                break;
            case "sabado":
            case "domingo":
                System.out.println(diaDaSemana.substring(0, 1).toUpperCase() + diaDaSemana.substring(1) + " não é um dia útil.");
                break;
            default:
                System.out.println("Dia inválido. Por favor, digite um dia da semana válido.");
                break;
        }
    }
}


