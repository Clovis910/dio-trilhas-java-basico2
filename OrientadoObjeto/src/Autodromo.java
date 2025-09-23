public class Autodromo {

    public static void main(String[] args) {

        Carro jeep = new Carro();

       // jeep.confereCombustivel();
        //jeep.confereCambio();
        jeep.setChassi("6464646");
        jeep.ligar();

        Moto z400 = new Moto();

        z400.setChassi("0006");
        z400.ligar();

    }

}
