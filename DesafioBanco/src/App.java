import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setNome("Clovis");

        
        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(cliente);

        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);

        Banco banco = new Banco("Banco do Brasil", contas);


        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.imprimirListaContas();


    }
}
