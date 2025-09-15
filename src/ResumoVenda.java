import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ResumoVenda {
    List<Cliente> clientes;

    public ResumoVenda() {
        clientes = new ArrayList<>();
    }

    public double exibirResumo(Cliente cliente) {
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
        cliente.setValor_total(valorTotal);
        return valorTotal;
    }

    public boolean processarPagamento(double valorTotal, Scanner scanner) {
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
                return false;
            }
        } else if (metodoPagamento == 2) {
            System.out.println("Transação com cartão confirmada.");
        } else {
            System.out.println("Método de pagamento inválido.");
        }
        return true;
    }

    public void relotorioDia() {
        int ingressos_inteiros = 0;
        int ingressos_meia = 0;
        int ingressos_promocionais = 0;
        int total_ingressos = 0;
        double valorTotal = 0.0;

        for (Cliente cliente : this.clientes) {
            for (bilhete ingresso : cliente.getIngressos()) {
                if (ingresso.getTipo() == 1) {
                    ingressos_inteiros += 1;
                } else if (ingresso.getTipo() == 2) {
                    ingressos_meia += 1;
                } else if (ingresso.getTipo() == 3) {
                    ingressos_promocionais += 1;
                }
            }
            valorTotal += cliente.getValor_total();
        }
        total_ingressos = ingressos_inteiros + ingressos_meia + ingressos_promocionais;
        System.out.println("___Relatorio de vendas do dia___");
        System.out.println("Total de ingressos vendidos: " + total_ingressos);
        System.out.println("Total de ingressos inteiros vendidos: " + ingressos_inteiros);
        System.out.println("Total de ingressos com meia entrada vendidos: " + ingressos_meia);
        System.out.println("Total de ingressos com valor promocional vendidos: " + ingressos_promocionais);
        System.out.println("Valor total arrecadado " + valorTotal);
    }
}