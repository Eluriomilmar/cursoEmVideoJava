package aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero a1 = new Mamifero();
        Reptil a2 = new Reptil();
        Peixe a3 = new Peixe();
        Ave a4 = new Ave();
        Canguru a5 = new Canguru();
        Cachorro b1 = new Cachorro();
        Cobra b2 = new Cobra();
        Tartaruga b3 = new Tartaruga();

        a1.locomover();
        a2.locomover();
        a3.locomover();
        a4.locomover();
        a5.locomover();
        a5.usarBolsa();
        b1.abanarRabo();
        b2.locomover();
        b3.locomover();
    }
}
