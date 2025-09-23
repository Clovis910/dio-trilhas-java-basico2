import equipamentos.AparelhoTelefonico;
import equipamentos.NavegadorInternet;
import equipamentos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Musica: " + musica );
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Pagina: " + url);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
         System.out.println("Atualizando Pagina");
    }

    @Override
    public void ligar(String numero) {
         System.out.println("Ligando para o numero: " + numero);
    }

    @Override
    public void atender() {
         System.out.println("Atendendo");
    }

    @Override
    public void iniciarConversaVoz() {
         System.out.println("Iniciando Conversa");
    }

}
