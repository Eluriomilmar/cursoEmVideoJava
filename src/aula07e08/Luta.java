package aula07e08;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
            aprovada = true;
            desafiante = l1;
            desafiado = l2;
        } else {
            aprovada = false;
            desafiante = null;
            desafiado = null;
        }
    }

    public void lutar() {
        if (aprovada == true) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor) {
                case 0:
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
            }
        } else {
            System.out.println("A luta é inválida");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public void setDesafiante(Lutador dd) {
        this.desafiante = dd;
    }
}
