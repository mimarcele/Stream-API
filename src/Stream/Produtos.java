package Stream;

public class Produtos {

    final String nome;
    final double preco;
    final double desconto;
    final int frete;

    public Produtos(String nome, double preco, double desconto, int frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }
}