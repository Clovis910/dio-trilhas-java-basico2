package apps;
public abstract class Messengers {

public abstract void enviarMensagem();
public abstract void receberMensagem();

    // public void enviarMensagem(){

    //     validarConectadoInternet();
    //     System.out.println("Enviar Mensagem");
    //     salvarHistoricoMensagem();
    // }

    //  public void receberMensagem(){

    //     System.out.println("Receber Mensagem");
    // }

     protected void validarConectadoInternet(){

        System.out.println("Validando se está contectado a internet");
     }

    //  private void salvarHistoricoMensagem(){

    //     System.out.println("Salvando Historico de Mensagem");
    // }

}
