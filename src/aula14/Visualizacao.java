package aula14;

public class Visualizacao implements Video, Gafanhoto {
    private Gafanhoto espectador;
    private Video filme;
    public avaliar();
    public avaliar(float nota);
    public avaliar(float porcentagem);

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }

    public avaliar() {
        this.filme.setAvaliacao(5);
    }

    public avaliar(float nota) {
        this.filme.setAvaliacao(nota);
    }

    public avaliar(float porcentagem) {
        int total = 0;
        if (porcentagem <= 20) {
            total = 3;
        } else if (porcentagem <= 50) {
            total = 5;
        } else if (porcentagem <= 90) {
            total = 8;
        } else {
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }
}
