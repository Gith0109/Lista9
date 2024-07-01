package Questao1Lista9;
public class Modelo2 extends TV implements ControleRemoto {

    private String modelo = "Modelo2";

    public Modelo2(boolean ligada, int voltagem, int tamanho) {
        super(ligada, voltagem);
        setTamanho(tamanho);
    }

    @Override
    public void mudarCanal(int canal) {
        this.setCanal(canal);
        System.out.println("Trocando o canal da TV 2\nCanal atual: " + this.getCanal());
    }

    @Override
    public void aumentarVolume(int taxa) {
        if (this.getVolume() + taxa > 100) {
            this.setVolume(100);
        } else {
            this.setVolume(this.getVolume() + taxa);
        }
        System.out.println("Volume da TV 2 alterado. Volume atual: " + this.getVolume());
    }

    @Override
    public void diminuirVolume(int taxa) {
        if (this.getVolume() - taxa < 0){
            this.setVolume(0);
        }
        else {
            this.setVolume(this.getVolume() - taxa);
        }
        System.out.println("Volume da TV 2 alterado. Volume atual: " + this.getVolume());
    }

    @Override
    public void ligar() {
        this.setLigada(true);
        System.out.println("TV 2 está ligada");
    }

    @Override
    public void desligar() {
        this.setLigada(false);
        System.out.println("TV 2 está desligada");
    }
}