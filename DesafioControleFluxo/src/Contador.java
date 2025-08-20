import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o paramentro 1: ");
        int paramentro1 = sc.nextInt();

        System.out.println("Digite o paramentro 2: ");
        int paramentro2 = sc.nextInt();

        sc.close();

        try {

            contar(paramentro1, paramentro2);

        } catch (ParamentrosInvalidosException e) {

            System.err.println("O parametro 1 é menor que o paramentro 2!");

        }

    }

    static void contar(int paramentro1, int paramentro2) throws ParamentrosInvalidosException {

        if (paramentro1 < paramentro2){
            throw new ParamentrosInvalidosException();
            
        }else{

            int numero = paramentro1-paramentro2;

            System.out.println("Lista");

            for(int i=0; i<numero;i++){

                System.out.println(i+1);
            }

        }

    }

}
