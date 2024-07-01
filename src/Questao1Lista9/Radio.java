package Questao1Lista9;

public class Radio extends Eletrodomestico implements ControleRemoto {
    private short AM = 1;
    private short FM = 2;
    private int banda;
    private float sintonia;
    private int volume;

    public Radio(Integer voltagem, int banda, float sintonia, Integer volume, boolean ligada) {
        super(ligada, voltagem);
        this.banda = banda;
        this.sintonia = sintonia;
        this.volume = volume;
    }

    public int getBanda() {
        return this.banda;
    }

    public void setBanda(int banda) {
        this.banda = banda;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public float getSintonia() {
        return this.sintonia;
    }

    public void setSintonia(float sintonia) {
        this.sintonia = sintonia;
    }

    @Override
    public void mudarCanal(int canal) {
        this.setSintonia((float) canal);
        System.out.println("Mudando a Sintonia do Rádio!");
        System.out.println(this);
    }

    @Override
    public void aumentarVolume(int taxa) {
        if (this.getVolume() + taxa > 100) {
            this.setVolume(100);
        } else {
            this.setVolume(this.getVolume() + taxa);
        }
        System.out.println("Aumentando o Volume do Rádio!");
        System.out.println(this);
    }

    @Override
    public void diminuirVolume(int taxa) {
        if (this.getVolume() - taxa < 0){
            this.setVolume(0);
        }
        else {
            this.setVolume(this.getVolume() - taxa);
        }
        System.out.println("Diminuindo o Volume do Rádio!");
        System.out.println(this);
    }

    @Override
    public void desligar() {
        System.out.println("Rádio deligado!");
        this.setLigada(false);
    }

    @Override
    public void ligar() {
        System.out.println("Rádio ligado!");
        this.setLigada(true);
    }

    @Override
    public String toString() {
        String estado = (this.isLigada()) ? "Ligado" : "Desligado";
        return "O Rádio está " + estado + ", Volume: " + this.getVolume() + " e Sintonia: " + this.getSintonia();
    }
}