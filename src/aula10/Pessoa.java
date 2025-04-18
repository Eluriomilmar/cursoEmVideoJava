package aula10;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa() {

    }

    public void fazerAniv() {
        setIdade(getIdade() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String se) {
        this.sexo = se;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
