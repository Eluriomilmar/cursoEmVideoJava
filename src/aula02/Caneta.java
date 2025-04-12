package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void carregar() {
        this.carga = 100;
    }

    void rabiscar() {
        if (!this.tampada) {
            this.carga = this.carga - 1;
        } else {
            System.out.println("Impossível rabiscar, a caneta está tampada");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        if (this.tampada) {
            System.out.println("Está tampada");
        } else {
            System.out.println("Está destampada");
        }
    }
}
