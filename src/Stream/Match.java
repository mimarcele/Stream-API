package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Aluno a1 = new Aluno ("Luis", 7.4);
        Aluno a2 = new Aluno ("Marco", 5.8);
        Aluno a3 = new Aluno ("Maria", 9.4);
        Aluno a4 = new Aluno ("Enzo", 10);

        List<Aluno> alunos = Arrays.asList (a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate ();

        System.out.println (alunos.stream ().allMatch (aprovado));
        System.out.println (alunos.stream ().anyMatch (aprovado));
        System.out.println (alunos.stream ().noneMatch (reprovado));
    }
}
