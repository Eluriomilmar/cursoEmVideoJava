package aula06;

public class ControleRemoto {

    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean mudo;

    public void Construtor(){

    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void abrirMenu(){
        System.out.println("O volume está em " + this.volume + "%");
        if (this.ligado){
            System.out.println("O controle está ligado");
        }else{
            System.out.println("O controle está desligado");
        }
        if (this.tocando){
            System.out.println("O aparelho está desmutado");
        }else{
            System.out.println("O aparelho está mutado");
        }
    }

    public void fecharMenu(){
        System.out.println("O menu foi fechado com sucesso.");
    }

    public void maisVolume(int valor){
        if (valor < 0) {
            System.out.println("Valor inválido");
        }else{
            if ((this.volume + valor) > 100) {
                this.volume = 100;
            }else{
                this.volume += valor;
            }
        }
    }

    public void menosVolume(int valor) {
        if (valor < 0) {
            System.out.println("Valor inválido");
        }else{
            if ((this.volume - valor) < 0) {
                this.volume = 0;
            }else{
                this.volume -= valor;
            }
        }
    }

    public void ligarMudo(){
        this.mudo = true;
    }

    public void desligarMudo(){
        this.mudo = false;
    }

    public void play(){
        this.tocando = true;
    }

    public void pause(){
        this.tocando = false;
    }


}
