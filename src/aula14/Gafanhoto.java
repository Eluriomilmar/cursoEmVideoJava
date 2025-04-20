package aula14;

public class Gafanhoto extends aula14.Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String no, int id, String se,  String login) {
        super(no, id, se);
        this.experiencia = 0;
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return this.totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm() {
        setTotAssistido(getTotAssistido() + 1);
    }

}
