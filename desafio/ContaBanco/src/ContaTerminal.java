import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {

        ContaBanco conta = new ContaBanco();
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Porfavor, digite o numero da Agencia");
        conta.agencia = scanner.next() ;

        System.out.println("Porfavor, digite o numero da Conta");
        conta.numero = scanner.nextInt();

        System.out.println("Porfavor, digite o Nome do Cliente");
        conta.nomeCliente = scanner.next();

        System.out.println("Porfavor, digite o Saldo");
        conta.saldo = scanner.nextDouble();

        System.out.println( "Ola, " + conta.nomeCliente + ", obrigado por criar a conta em nosso banco. Sua agencia é: "
                                 + conta.agencia + ", conta: " + conta.numero + ", e Saldo: " + conta.saldo);

    }

}
