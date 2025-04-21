package supertrunfo;

public class Batalha {
    private Pokemon p1;
    private Pokemon p2;

    public Batalha(Pokemon poke1, Pokemon poke2) {
        this.p1 = poke1;
        this.p2 = poke2;
        int roletagem = 1;
        if ((roletagem % 2 == 1) && (p1.getVida() != 0) && (p2.getVida() != 0))  {
            while ((p1.getVida() != 0) && (p2.getVida() != 0)) {
                if (p1.getForça() > p2.getForça()) {
                    p2.setVida(p2.getVida() - 1);
                    System.out.println("O pokémon " + p2.getNome() + " perdeu 1 de vida e ficou com " + poke2.getVida() + "hp");
                } else if (p1.getForça() < p2.getForça()) {
                    poke1.setVida(p1.getVida() - 1);
                    System.out.println("O pokémon " + p1.getNome() + " perdeu 1 de vida e ficou com " + poke1.getVida() + "hp");
                }
                roletagem++;
                if ((roletagem % 2 == 0) && (p1.getVida() != 0) && (p2.getVida() != 0)) {
                    if (p1.getPeso() > p2.getPeso()) {
                        p2.setPeso(p2.getPeso() - 1);
                        System.out.println("O pokémon " + p2.getNome() + " perdeu 1 de vida e ficou com " + poke2.getVida() + "hp");
                    } else if (p1.getPeso() < p2.getPeso()) {
                        poke1.setVida(p1.getVida() - 1);
                        System.out.println("O pokémon " + p1.getNome() + " perdeu 1 de vida e ficou com " + poke1.getVida() + "hp");
                    }
                    roletagem++;
                }
            }
        }if (p1.getVida() == 0) {
            p1.setDerrotas(p1.getDerrotas() + 1);
            p2.setVitorias(p2.getVitorias() + 1);
            System.out.println("O pokémon " + p1.getNome() + " foi derrotado e agora acumula " + p1.getDerrotas() +
                    " derrotas e " + p1.getVitorias() + " vitorias");
            System.out.println("O pokémon " +p2.getNome() + "venceu e agora acumula " + p2.getDerrotas() + " derrotas" +
                    " e " + p2.getVitorias() + " vitórias");
        } else {
            p2.setDerrotas(p2.getDerrotas() + 1);
            p1.setVitorias(p1.getVitorias() + 1);
            System.out.println("O pokémon " + p2.getNome() + " foi derrotado e agora acumula " + p2.getDerrotas() +
                    " derrotas e " + p2.getVitorias() + " vitorias");
            System.out.println("O pokémon " +p1.getNome() + "venceu e agora acumula " + p1.getDerrotas() + " derrotas" +
                    " e " + p1.getVitorias() + " vitórias");
        }
    }
}
