import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("----- ATENDIMENTO AO CLIENTE -----");
            System.out.print("Digite a quantidade de ingressos: ");
            int quantidadeIngressos = scanner.nextInt();

            System.out.print("TIPOS DE INGRESSOS");
            System.out.println("[1] - Inteira");
            System.out.println("[2] - Meia");
            System.out.println("[3] - Promocional");
            System.out.print("Escolha o tipo de ingresso (1, 2 ou 3): ");
            int tipoIngresso = scanner.nextInt();

            System.out.print("Digite a idade do cliente: ");
            int idadeCliente = scanner.nextInt();

            System.out.print("\nAtender próximo cliente? (S/N): ");
            scanner.nextLine();
            continuar = scanner.nextLine().trim().toLowerCase();

        } while(continuar.equals("s"));
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}