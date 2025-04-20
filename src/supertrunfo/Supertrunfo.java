package supertrunfo;

public class Supertrunfo {
    public static void main(String[] args) {
        Pokemon a = new Pokemon("Ratata", 100, 5, 12f, 12);
        Pokemon b = new Pokemon("Buterfree", 100, 4, 13f, 13);
        new Batalha(a, b);
    }
}
