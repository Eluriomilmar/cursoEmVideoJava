package aula07e08;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public void apresentar(){
        System.out.println("O lutador " + nome + ", vindo da  " + nacionalidade + ", possui " + idade + " " +
                "anos, " + altura + " metros e " + peso + "kg. Ele é participante da categoria " + categoria + "!");
    }

    public void status(){
        System.out.println("Vitórias: " + vitorias + "\nDerrotas: " + derrotas + "\nEmpates: " + empates);
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public void setPeso(float valor){
        this.peso = valor;
        setCategoria();
    }

    public float getPeso(){
        return this.peso;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
}
