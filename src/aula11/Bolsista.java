package aula11;

public class Bolsista extends aula11.Aluno {

    public Bolsista() {

    }

    private int bolsa(int valor) {
        return valor;
    }

    public void renovarBolsa() {
        System.out.println("Bolsa renovada");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga, ihu");
    }


}
