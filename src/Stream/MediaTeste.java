package Stream;

public class MediaTeste {
    public static void main(String[] args) {

        Media m1 = new Media ().adicionar (8.7).adicionar (5.4);
        Media m2 = new Media ().adicionar (5.2).adicionar (9.6);

        System.out.println (m1.getValor () );
        System.out.println (m2.getValor () );

        System.out.println (Media.combinar (m1, m2).getValor () );
    }
}
