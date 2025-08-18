import java.text.NumberFormat;

public class ExemploDeExcecao {

    public static void main(String[] args) {
        
        Number valor = Double.valueOf("al.75");

       // valor = NumberFormat.getInstance().parse("al.75");

        System.out.println(valor);
    }

}
