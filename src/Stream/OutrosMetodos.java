package Stream;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
    public static void main(String[] args) {

        Aluno a1 = new Aluno ("Luis", 7.4);
        Aluno a2 = new Aluno ("Marco", 5.8);
        Aluno a3 = new Aluno ("Maria", 9.4);
        Aluno a4 = new Aluno ("Enzo", 10);
        Aluno a5 = new Aluno ("Luis", 7.4);
        Aluno a6 = new Aluno ("Marco", 5.8);
        Aluno a7 = new Aluno ("Marta", 9.4);
        Aluno a8 = new Aluno ("Messi", 10);



        List<Aluno> alunos = Arrays.asList (a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println ("Distinct..." );
        alunos.stream ().distinct ().forEach (System.out::println);

        System.out.println ("\nSkip/Limit" );
        alunos.stream ().distinct ().skip (3).limit (1).forEach (System.out::println);

        System.out.println ("\nTakeWhile" );
        alunos.stream ().distinct ().skip (2).takeWhile (a ->a.nota >=8).forEach (System.out::println);
    }
}

