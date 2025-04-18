package aula09;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String ti, String au, int tP, int pA, boolean ab, Pessoa le){
        this.titulo = ti;
        this. autor = au;
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

    private String getTitulo() {
        return titulo;
    }

    private String getAutor() {
        return autor;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private boolean getAberto() {
        return aberto;
    }

    private String getLeitor() {
        return leitor.getNome();
    }

    private void setTitulo(String ti) {
        this.titulo = ti;
    }

    private void setAutor(String au) {
        this.autor = au;
    }

    private void setTotPaginas(int tP) {
        this.totPaginas = tP;
    }

    private void setPagAtual(int pA) {
        this.pagAtual = pA;
    }

    private void setLeitor(String le) {
        this.leitor.setNome(le);
    }

    public void abrir() {
        if (this.aberto) {
            System.out.println("O livro já está aberto");
        } else if (!this.aberto) {
            this.aberto = true;
            System.out.println("O livro foi aberto!");
        }
    }

    public void fechar() {
        if (!this.aberto) {
            System.out.println("O livro já está fechado!");
        } else if (this.aberto) {
            this.aberto = false;
            System.out.println("O livro foi fechado!");
        }
    }
    public void folhear() {
        System.out.println("O livro está na página " + this.getPagAtual());
    }

    public void avancarPag() {
        this.pagAtual++;
        System.out.println("A página avançou para a de número " + this.pagAtual);
    }
    public void voltarPag() {
        this.pagAtual--;
        System.out.println("A página foi retrocedida para a de número " +this.pagAtual);
    }
}
