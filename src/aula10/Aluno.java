package aula10;

public class Aluno extends aula10.Pessoa {
    private int matricula;
    private String curso;

    public Aluno() {

    }

    public void cancelarMatricula() {
        setMatricula(0000000000);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int ma) {
        this.matricula = ma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String cu) {
        this.curso = cu;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
