package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {


        Apresentacoes a1 = new Apresentacoes ("Exercício físico e saúde mental", 5.8, true);
        Apresentacoes a2 = new Apresentacoes ("Plágio e NETiqueta", 7.2, true);
        Apresentacoes a3 = new Apresentacoes ("Mídias Colaborativas", 7.1, false);
        Apresentacoes a4 = new Apresentacoes ("Matemática e educação em debate", 6.3, true);
        Apresentacoes a5 = new Apresentacoes ("Educação física escolar", 6.3, false);
        Apresentacoes a6 = new Apresentacoes ("As temáticas fisico-naturais no ensino de Geografia", 8.0, true);
        Apresentacoes a7 = new Apresentacoes ("O lapso de Freud", 7.2, false);
        Apresentacoes a8 = new Apresentacoes ("Educação inclusiva e direitos humanos", 9.4, true);
        Apresentacoes a9 = new Apresentacoes ("Autismo na vida adulta", 7.6, true);
        Apresentacoes a10 = new Apresentacoes ("Grande impulso para a sustentabilidade no Brasil", 5.8, false);


        List<Apresentacoes> apresentacoes = Arrays.asList (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);

        Predicate<Apresentacoes> aprovadas = a -> a.nota >= 6.5;
        Predicate<Apresentacoes> boasApresentacoes = a -> a.boaApresentacao;
        Function<Apresentacoes, String> resultado =
                a -> "Parabéns aos envolvidos no tema de " + a.tema + " vocês escolheram um ótimo tema e fizeram uma ótima apresentação";

        apresentacoes.stream ().filter (aprovadas).filter (boasApresentacoes).map (resultado).forEach (System.out::println);

    }

}

