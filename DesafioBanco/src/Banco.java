import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public void imprimirListaContas(){

    

       this.contas.forEach(contas -> System.out.println(contas.getNumero()+ " " + contas.getCliente().getNome()));

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
