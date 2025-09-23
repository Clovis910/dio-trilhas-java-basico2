public class App {
    public static void main(String[] args) throws Exception {
       
        Iphone iphone = new Iphone();


        System.out.println("Aparelho Telefonico-------------");
        iphone.ligar("81986161719" );
        iphone.atender();
        iphone.iniciarConversaVoz();


        System.out.println("Navegador Internet--------------");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.clovis.com.br");
        iphone.atualizarPagina();


        System.out.println("Reprodutor Musical--------------");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Come as you are");


    }
}
