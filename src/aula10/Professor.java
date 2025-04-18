package aula10;

public class Professor extends aula10.Pessoa {
    private String especialidade;
    private double salario;

    public Professor () {

    }

    public void receberAumento(double au) {
        setSalario(getSalario() + au);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String es) {
        this.especialidade = es;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double sa) {
        this.salario = sa;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
