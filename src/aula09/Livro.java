package aula09;

public class Livro {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private String leitor;

    public Livro(String ti, String au, int tP, int pA, boolean ab, String le) {
        this.titulo = ti;
        this.autor = au;
        this.totPaginas = tP;
        this.pagAtual = pA;
        this.aberto = ab;
        this.leitor = le;
    }

    public void detalhes() {
        System.out.print("O livro " + this.getTitulo() + " da autoria de " + this.getAutor() + " Possui " +
                this.getTotPaginas() + " páginas, ");
        if (this.aberto == true) {
            System.out.print("está aberto e está sendo lido por " + this.getLeitor() + ".");

        } else if (this.aberto == false) {
            System.out.print("está fechado e está sendo lido por " + this.getLeitor() + ".");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setTitulo(String ti) {
        this.titulo = ti;
    }

    public void setAutor(String au) {
        this.autor = au;
    }

    public void setTotPaginas(int tP) {
        this.totPaginas = tP;
    }

    public void setPagAtual(int pA) {
        this.pagAtual = pA;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public void setLeitor(String le) {
        this.leitor = le;
    }
}
