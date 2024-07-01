package Questao1Lista9;



public class Teste {

    public static void main(String[] args) throws Exception {
        Modelo1 modelo1 = new Modelo1(true, 100, 50);
        Modelo2 modelo2 = new Modelo2(false, 320, 32);
        Radio radio = new Radio(99, 109, 5, 80, true);

        System.out.println(radio);
        radio.aumentarVolume(5);
        modelo1.desligar();
        modelo2.ligar();
        modelo2.mudarCanal(5);
        modelo2.desligar();
        radio.desligar();
    }
}