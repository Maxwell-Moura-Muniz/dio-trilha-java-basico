public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual "+ smartTv.canal);

        
        System.out.println("O volume atual é "+smartTv.volume);



        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual "+ smartTv.canal);
        System.out.println("O volume atual é "+smartTv.volume);

        smartTv.ligar();

        System.out.println("TV ligada? --> novo status " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("TV ligada? --> novo status " + smartTv.ligada);

    }
}
