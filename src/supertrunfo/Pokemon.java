package supertrunfo;

public class Pokemon {
    private String nome;
    private int vida;
    private int força;
    private float peso;
    private float velocidade;
    private int vitorias;
    private int derrotas;

    public Pokemon(String no, int vi, int fo, float pe, float ve) {
        this.nome = no;
        this.vida = vi;
        this.força = fo;
        this.peso = pe;
        this.velocidade = ve;
        this.vitorias = 0;
        this.derrotas = 0;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", força=" + força +
                ", peso=" + peso +
                ", velocidade=" + velocidade +
                ", vitorias=" + vitorias +
                ", derrotas=" + derrotas +
                '}';
    }
}
