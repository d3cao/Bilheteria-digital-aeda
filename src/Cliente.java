public class Cliente {
    private String nome;
    private int idade;
    private int qnt_ingressos;
    private String metodo_de_pagamento;
    private double valor_total;

    public void cadastroCliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade ingressos: " + qnt_ingressos);
        System.out.println("Metodo de pagamento: " + metodo_de_pagamento);
        System.out.println("Valor total: " + valor_total);
    }

    public int getQnt_ingressos() {
        return qnt_ingressos;
    }

    public void setQnt_ingressos(int qnt_ingressos) {
        this.qnt_ingressos = qnt_ingressos;
    }

    public String getMetodo_de_pagamento() {
        return metodo_de_pagamento;
    }

    public void setMetodo_de_pagamento(String metodo_de_pagamento) {
        this.metodo_de_pagamento = metodo_de_pagamento;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
}
