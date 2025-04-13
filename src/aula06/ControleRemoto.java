package aula06;

public class ControleRemoto {

    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean mudo;

    public void setVolume(int mixer){
        this.volume += mixer;
    }

    public int getVolume(){
        System.out.println("O volume é igual a " + this.volume + "%");
        return this.volume;
    }

    public void setLigado(boolean estado){
        this.ligado = estado;
    }

    public void getLigado(){
        if (this.ligado){
            System.out.println("O controle está ligado.");
        }else{
            System.out.println("O controle está desligado.");
        }
    }

    public void setTocando(boolean estado){
        this.tocando = estado;
    }

    public void getTocando(){
        if(this.tocando){
            System.out.println("O dispositivo está tocando.");
        }else{
            System.out.println("O dispositivo não está tocando.");
        }
    }

    public void ligar(){
        this.setLigado(true);
    }

    public void desligar(){
        this.setLigado(false);
    }

    public void abrirMenu(){
        getLigado();
        getTocando();
        getVolume();
    }

    public void fecharMenu(){
        System.out.println("O menu está sendo fechado.");
    }

    public void maisVolume(){
        if ((this.getVolume() + 10) > 100){
            System.out.println("O volume está no máximo");
        }else{
            this.volume += 10;
        }
    }

    public void menosVolume(){
        if ((this.getVolume() - 10) < 0){
            System.out.println("O volume está no mínimo");
        }
    }

    public boolean getMudo(){
        if (this.mudo) {
            System.out.println("O volume está mudo");
            return true;
        }else{
            System.out.println("O volume não está mudo");
            return false;
        }
    }

    public void setMudo(boolean valor){
        this.mudo = valor;
    }

    public void ligarMudo(){
        setMudo(true);
    }

    public void desligarMudo(){
        setMudo(false);
    }

    public void play(){
        if ((this.volume > 0) && (this.ligado) && !(this.mudo)){
            setTocando(true);
            System.out.println("O dispositivo está reproduzindo");
            System.out.println("Volume: ");
            for (int i = 0 ; i < this.volume ; i+=10){
                System.out.print("|");
            }
        }else{
            if (this.volume == 0){
                System.out.println("O volume é igual a 0");
            }
            if (!this.ligado){
                System.out.println("O dispositivo está desligado");
            }
            if (this.mudo){
                System.out.println("O dispositivo está mudo");
            }
        }
    }

    public void pause(){
        setTocando(false);
    }


}
