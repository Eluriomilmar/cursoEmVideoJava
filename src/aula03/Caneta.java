package aula03;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    private void carregar() {
        this.carga = 100;
    }

    public void rabiscar() {
        if (!this.tampada) {
            this.carga = this.carga - 1;
        } else {
            System.out.println("Impossível rabiscar, a caneta está tampada");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
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
