package aula12;

public class Mamifero extends aula12.Animal {
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }

    public String getcorPelo() {
        return this.corPelo;
    }

    public void setcorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
