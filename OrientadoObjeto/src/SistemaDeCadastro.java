public class SistemaDeCadastro {


    public static void main(String[] args) {
        Pessoa clovis = new Pessoa("Clovis", "83838383");

        clovis.setEndereco("Av Santa Fé");


        System.out.println(clovis.getNome() + " - " + clovis.getCpf());

    }

}
