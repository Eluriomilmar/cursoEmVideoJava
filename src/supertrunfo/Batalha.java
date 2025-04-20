package supertrunfo;

public class Batalha {
    private Pokemon p1;
    private Pokemon p2;

    public Batalha(Pokemon poke1, Pokemon poke2) {
        this.p1 = poke1;
        this.p2 = poke2;
        if (p1.getForça() > p2.getForça()) {
            p2.setVida(p2.getVida() - 1);
            System.out.println("O pokémon " + p2.getNome() + " perdeu 1 de vida e ficou com " + poke2.getVida() + "hp");
        } else if (p1.getForça() < p2.getForça()) {
            poke1.setVida(p1.getVida() - 1);
            System.out.println("O pokémon " + p1.getNome() + " perdeu 1 de vida e ficou com " + poke1.getVida() + "hp");
        }
    }
}
