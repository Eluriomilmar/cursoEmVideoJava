package aula05;

public class Conta{

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.setSaldo(0);
        this.setStatus(true);
    }

    public void estadoConta() {
        System.out.println(this.getDono());
        System.out.println(this.getNumConta());
        System.out.println(this.getSaldo());
        System.out.println(this.getStatus());
        System.out.println(this.getTipo());
    }

    public void Construtor() {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String coisa) {
        this.setTipo(coisa);
        this.setStatus(true);
        if ("cc".equals(coisa)) {
            depositar(50);
        } else {
            depositar(150);
        }
    }

    public void setnumConta(int numero) {
        this.numConta = numero;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo (String Caracteres) {
        this.tipo = Caracteres;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String nome) {
        this.dono = nome;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float reais) {
        this.saldo = reais;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean estado) {
        this.status = estado;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void fecharConta(){
        if (this.saldo != 0) {
            System.out.println("Conta não está zerada e portanto não pode ser fechada");
        } else {
            this.status = false;
        }
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void sacar(float valor) {
        this.saldo -= valor;
    }

    public void pagarMensal() {
        if (this.tipo.equals("cc")) {
            this.saldo -= 12;
        } else {
            this.saldo -= 20;
        }
    }


}