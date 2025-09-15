import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int idade;
    private List<bilhete> ingressos;
    private String metodo_de_pagamento;
    private double valor_total;
    private boolean gratuidade = false;

    public Cliente(String nome, int idade) {
        this.ingressos = new ArrayList<>();
        this.nome = nome;
        if (idade >= 0 && idade <= 120){
            this.idade = idade;
        }
        if (this.idade < 5) {
            this.gratuidade = true;
        }
        verificaGratuidade();
    }

    public void verificaGratuidade() {
        if (this.gratuidade) {
            bilhete bilhete = new bilhete();
            bilhete.setPreco(0.0);
            bilhete.setTipo(0);
            this.ingressos.add(bilhete);
    }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<bilhete> getIngressos() {
        return ingressos;
    }

    public String getMetodo_de_pagamento() {
        return metodo_de_pagamento;
    }

    public double getValor_total() {
        return valor_total;
    }

    public boolean isGratuidade() {
        return gratuidade;
    }
}
