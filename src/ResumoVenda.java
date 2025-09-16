import java.util.Scanner;
import java.util.List;

public class ResumoVenda {

    public void exibirResumo(Cliente cliente, Scanner scanner) {
        System.out.println("\n----- RESUMO DA VENDA -----");
        System.out.printf("Cliente: %s\n", cliente.getNome());
        System.out.printf("Idade: %d\n", cliente.getIdade());
        
        List<bilhete> ingressos = cliente.getIngressos();
        
        System.out.printf("Quantidade de ingressos: %d\n", ingressos.size());
        
        double valorTotal = 0.0;
        for (bilhete ingresso : ingressos) {
            System.out.printf("- Tipo: %s | Preço: R$%.2f\n", ingresso.getDescricao(), ingresso.getPreco());
            valorTotal += ingresso.getPreco();
        }
        
        System.out.printf("Valor total da compra: R$%.2f\n", valorTotal);

        processarPagamento(valorTotal, scanner);
    }

    private void processarPagamento(double valorTotal, Scanner scanner) {
        System.out.println("\nEscolha o método de pagamento:");
        System.out.println("[1] - Dinheiro");
        System.out.println("[2] - Cartão");
        System.out.print("Opção: ");
        int metodoPagamento = scanner.nextInt();

        if (metodoPagamento == 1) {
            System.out.print("Digite o valor pago em dinheiro: R$");
            double valorPago = scanner.nextDouble();

            if (valorPago >= valorTotal) {
                double troco = valorPago - valorTotal;
                System.out.printf("Pagamento recebido. Troco: R$%.2f\n", troco);
            } else {
                System.out.println("Valor insuficiente. Transação cancelada.");
            }
        } else if (metodoPagamento == 2) {
            System.out.println("Transação com cartão confirmada.");
        } else {
            System.out.println("Método de pagamento inválido.");
        }
    }
}