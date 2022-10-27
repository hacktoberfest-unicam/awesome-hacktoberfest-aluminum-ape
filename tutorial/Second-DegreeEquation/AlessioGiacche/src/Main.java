public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        EquazioneSecondoGrado equazione = new EquazioneSecondoGrado(3, -7, 2);
        equazione.solve();
        SoluzioneEquazioneSecondoGrado soluzione = new SoluzioneEquazioneSecondoGrado(equazione);
        soluzione.getS1();
        soluzione.getS2();
    }
}