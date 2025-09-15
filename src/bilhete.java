public class bilhete {
    private static final double precoBase = 30.0;
    private static final double descontoMeia = 0.5;
    private static final double descontoPromocional = 0.3;
    
    public static double getPrecoBase(){
        return precoBase;
    }

    public static double getDesconto(int tipo){
        if (tipo == 2) {
            return descontoMeia;
        }else if (tipo == 3){
            return descontoPromocional;
        }else{
            return 0.0;
        }
    }

    public static String getDescricao(int tipo){
        switch (tipo){
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
