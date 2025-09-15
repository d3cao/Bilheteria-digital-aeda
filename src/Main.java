import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("----- ATENDIMENTO AO CLIENTE -----");

            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade do cliente: ");
            int idade = scanner.nextInt();

            Cliente cliente = new Cliente(nome, idade);

            System.out.print("Digite a quantidade de ingressos: ");
            int quantidadeIngressos = scanner.nextInt();

            if (cliente.isGratuidade()) {
                quantidadeIngressos = quantidadeIngressos - 1;
            }

            for (int i = 0; i < quantidadeIngressos; i++) {
                bilhete ingresso = new bilhete();
                System.out.print("TIPOS DE INGRESSOS\n");
                System.out.println("[1] - Inteira");
                System.out.println("[2] - Meia");
                System.out.println("[3] - Promocional");
                System.out.print("Escolha o tipo de ingresso (1, 2 ou 3): ");
                int tipoIngresso = scanner.nextInt();
                ingresso.setTipo(tipoIngresso);
                ingresso.setPreco(ingresso.getPrecoBase() * ingresso.getDesconto(ingresso.getTipo()));
                cliente.setIngressos(ingresso);
            }

            for (bilhete ingresso : cliente.getIngressos()) {
                System.out.println(ingresso.getPreco());
                System.out.println(ingresso.getDescricao());
            }

            System.out.print("\nAtender próximo cliente? (S/N): ");
            scanner.nextLine();
            continuar = scanner.nextLine().trim().toLowerCase();

        } while(continuar.equals("s"));
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}