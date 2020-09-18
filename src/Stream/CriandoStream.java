package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of ("Java ", "HTML ", "JS\n");
        langs.forEach (print);

        String[] maisLangs = {"PHP ", "CSS ", "Angular ", "Go\n"};
        Stream.of (maisLangs).forEach (print);
        Arrays.stream (maisLangs, 1,3 ).forEach (print);
        System.out.println ( );

        List<String> outrasLangs = Arrays.asList ("Kotlin ", "Cobol ", "Python\n");
        outrasLangs.stream ().forEach (print);
        outrasLangs.parallelStream ().forEach (print);


    }
}
