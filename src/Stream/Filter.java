package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno ("Bia", 8.4);
        Aluno a2 = new Aluno ("Luca", 4.5);
        Aluno a3 = new Aluno ("Clara", 7.2);
        Aluno a4 = new Aluno ("Felipe", 9.7);
        Aluno a5 = new Aluno ("Milla", 3.8);
        Aluno a6 = new Aluno ("Teo", 8.0);

        List<Aluno> alunos = Arrays.asList (a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >=7;
        Function<Aluno, String> saudacaoAprovado =
                a -> "Parabéns, " + a.nome + " você foi aprovado(a)!";

        alunos.stream ().filter (aprovado).map (saudacaoAprovado)
                .forEach (System.out::println);
    }
}
