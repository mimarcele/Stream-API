package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno ("Luis", 7.4);
        Aluno a2 = new Aluno ("Marco", 5.8);
        Aluno a3 = new Aluno ("Maria", 9.4);
        Aluno a4 = new Aluno ("Enzo", 10);

        List<Aluno> alunos = Arrays.asList (a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar (nota);

        BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar (m1, m2);

        Media media=  alunos.stream ()
                .filter (aprovado)
                .map (apenasNota)
                .reduce (new Media(), calcularMedia, combinarMedia);

        System.out.println ("A média dos alunos aprovados é " + media.getValor () );
    }
}

