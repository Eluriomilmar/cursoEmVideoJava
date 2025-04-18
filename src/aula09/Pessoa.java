package aula09;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String no, int id, String se) {
        this.nome = no;
        this.idade = id;
        this.sexo = se;
    }

    public void fazerAniver() {
        this.setIdade(getIdade() + 1);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public void setSexo(String se) {
        this.sexo = se;
    }

}
