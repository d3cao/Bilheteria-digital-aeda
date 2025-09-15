public class bilhete {
    private static final double precoBase = 30.0;
    private static final double descontoMeia = 0.5;
    private static final double descontoPromocional = 0.3;
    private double preco;
    private int tipo;

    public double getPreco() {
        return preco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoBase(){
        return precoBase;
    }

    public double getDesconto(int tipo){
        if (tipo == 2) {
            return descontoMeia;
        }else if (tipo == 3){
            return descontoPromocional;
        } else {
            return 0;
        }
    }

    public String getDescricao(){
        switch (this.tipo){
            case 0:
                return "Gratuito";
            case 1:
                return "Inteira";
            case 2:
                return "Meia";
            case 3:
                return "Promocional";
            default:
                return "Tipo Inválido";
        }
    }
}
