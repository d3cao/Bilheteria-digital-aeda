import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("\n----- ATENDIMENTO AO CLIENTE -----");

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
                System.out.println("\nTIPOS DE INGRESSOS");
                System.out.println("[1] - Inteira");
                System.out.println("[2] - Meia");
                System.out.println("[3] - Promocional");
                System.out.print("\nEscolha o tipo de ingresso sequencialmente(1, 2 ou 3): ");
                int tipoIngresso = scanner.nextInt();
                ingresso.setTipo(tipoIngresso);

                double precoCalculado = ingresso.getPrecoBase();
                if (ingresso.getDesconto(ingresso.getTipo()) > 0) {
                    precoCalculado = ingresso.getPrecoBase() - (ingresso.getPrecoBase() * ingresso.getDesconto(ingresso.getTipo()));
                }
                ingresso.setPreco(precoCalculado);
                cliente.getIngressos().add(ingresso); 
            }

            ResumoVenda resumo = new ResumoVenda();
            resumo.exibirResumo(cliente, scanner); 

            System.out.print("\nAtender próximo cliente? (S/N): ");
            scanner.nextLine();
            continuar = scanner.nextLine().trim().toLowerCase();

        } while(continuar.equals("s"));
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}