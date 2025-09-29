public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        
    }

    @Override
    public void imprimirExtrato() {
        System.err.println("===Extrato Conta Corrente === ");
        ImprimirInfComuns();
    }

    

}
