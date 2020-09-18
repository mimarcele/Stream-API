package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
    public static void main(String[] args) {

        Produtos p1 = new Produtos ("Notebook", 2250.99, 0.25, 90);
        Produtos p2 = new Produtos ("Celular", 1780.90, 0.30, 0);
        Produtos p3 = new Produtos ("Playstation 4", 2950.99, 0.40, 0);
        Produtos p4 = new Produtos ("Fone de ouvido", 70, 0.15, 20);
        Produtos p5 = new Produtos ("Caixa de som JBL", 460, 0.35, 0);
        Produtos p6= new Produtos ("Carregador Iphone", 320, 0.14, 15);
        Produtos p7 = new Produtos ("Camera digital", 1350.98, 0.35, 0);
        Produtos p8 = new Produtos ("Samsung S9+", 2449.95, 0.40, 0);
        Produtos p9 = new Produtos ("Xiaomi Redmi 8", 1690.95, 0.30, 0);
        Produtos p10 = new Produtos ("Samsung a30", 1030.99, 0.32, 0);
        Produtos p11= new Produtos ("Samsung A51", 1890.99, 0.22, 40);
        Produtos p12 = new Produtos ("Kindle", 620.99, 0.15, 50);

        List<Produtos>  produtos = Arrays.asList (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);

        Predicate<Produtos> desconto = a -> a.desconto >= 0.30;

        Predicate<Produtos> frete = a-> a.frete == 0;

        Function<Produtos, String> chamadaPromocional = a -> "Aproveite a queima de estoque da loja "
                + a.nome + " por R$" + a.preco + " e frete grátis.";

        produtos.stream ().filter (desconto).filter (frete).map (chamadaPromocional).forEach (System.out::println);


    }
}
