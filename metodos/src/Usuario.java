public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: "+ smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual: "+smartTv.volume);
        
        smartTv.diminuirVolume();

        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual: "+ smartTv.canal);

    }
}
