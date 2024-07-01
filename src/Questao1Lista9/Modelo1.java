package Questao1Lista9;

public class Modelo1 extends TV implements ControleRemoto {
    private String modelo = "Modelo 1";

    public Modelo1(boolean ligada, int tamanho, int voltagem) {
        super(ligada, voltagem);
        setTamanho(tamanho);
    }

    public void desligar() {
        super.setLigada(false);
        System.out.println("TV Modelo 1 desligada.");
    }

    public void ligar() {
        super.setLigada(true);
        System.out.println("TV Modelo 1 ligada.");
    }

    @Override
    public void aumentarVolume(int taxa) {
        if (this.getVolume() + taxa > 100) {
            this.setVolume(100);
        } else {
            this.setVolume(this.getVolume() + taxa);
        }
        System.out.println("Aumentando o Volume da TV1! Volume atual: " + this.getVolume());
    }

    @Override
    public void diminuirVolume(int taxa) {
        if (this.getVolume() - taxa < 0) {
            this.setVolume(0);
        } else {
            this.setVolume(this.getVolume() - taxa);
        }
        System.out.println("Diminuindo o Volume da TV2! Volume atual: " + this.getVolume());
    }

    @Override
    public void mudarCanal(int canal) {
        this.setCanal(canal);
        System.out.println("Trocando o canal da TV 2\nCanal atual: " + this.getCanal());
    }
}