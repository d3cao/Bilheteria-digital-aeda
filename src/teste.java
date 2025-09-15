public class teste {
    private String nome,funcao;
    private int idade = -20;

    public teste(String nome, int idade, String funcao){
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
    }

    public void exibir(){
        System.out.println("Com vocês a ficha do cara mais gay do mundo... o nome deleeeeee "+ this.nome);
        System.out.println("Ele conta com incriveisssss " + this.idade + " anos.");
        System.out.println("E não podemos deixar de mencionar a sa principal funçãooooo: "+ this.funcao);
    }
}
