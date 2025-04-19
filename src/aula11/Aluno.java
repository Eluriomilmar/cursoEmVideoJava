package aula11;

public class Aluno extends aula11.Pessoa {
    private int matricula;
    private String curso;

    public Aluno() {

    }

    public void pagarMensalidade() {
        System.out.println("Pagamento efetuado");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
