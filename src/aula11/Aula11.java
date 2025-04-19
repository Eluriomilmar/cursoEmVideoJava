package aula11;

public class Aula11 {
    public static void main(String[] args) {
        Bolsista p1 = new Bolsista();
        p1.setIdade(30);
        System.out.println(p1.getIdade());
        p1.renovarBolsa();
        p1.pagarMensalidade();
    }
}
