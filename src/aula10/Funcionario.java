package aula10;

public class Funcionario extends aula10.Pessoa {
    private String setor;
    private String trabalhando;

    public Funcionario() {

    }

    public void mudarTrabalho(String tr) {
        setTrabalhando(tr);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String se) {
        this.setor = se;
    }

    public String getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(String tr) {
        this.trabalhando = tr;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "setor=" + setor +
                ", trabalhando='" + trabalhando + '\'' +
                '}';
    }
}
