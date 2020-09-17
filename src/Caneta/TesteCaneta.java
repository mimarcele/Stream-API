package Caneta;

public class TesteCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta ("Faber Castell", "Rosa", 0.7f);
        c1.tampar ();
        c1.status();

        Caneta c2 = new Caneta("BIC", "Azul", 0.5f);
        c2.status();
    }
}
