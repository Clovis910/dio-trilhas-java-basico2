public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    public int numero;
    protected double saldo;
    private Cliente cliente;

   public Conta(Cliente cliente) {

        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

        this.saldo -= valor;
        
    }

    @Override
    public void depositar(double valor) {

         this.saldo += valor;
        
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);
       
    }

    protected void ImprimirInfComuns() {
        System.err.println(String.format("Agencia: %d", this.agencia));
        System.err.println(String.format("Conta numero: %d", this.numero));
        System.out.println("Cliente: " + this.cliente.getNome());
        System.err.println(String.format("Saldo: %.2f", this.saldo));
    }

}
