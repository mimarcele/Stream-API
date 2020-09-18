package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

    public class ImprimindoObjetos {
        public static void main(String[] args) {

            List<String> aprovados = Arrays.asList ("Ana", "Luca", "Milla", "Mateo" );

            System.out.println ("Utilizando o foreach" );
            for(int i = 0; i<aprovados.size (); i++) {
                System.out.println ( aprovados.get (i));
            }
            System.out.println ("\n Utilizando o iterator" );
            Iterator<String> it = aprovados.iterator ( );
            while (it.hasNext ()){
                System.out.println (it.next () );
            }
            System.out.println ("\n Utilizando stream" );
            Stream<String> st = aprovados.stream ();
            st.forEach (System.out::println);
        }
    }

