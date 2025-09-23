import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.Messengers;
import apps.Telegram;

public class ComputadorPedrinho {

    public static void main(String[] args) {

        Messengers app = null;

        String appEscolhido = "telegram";

        if (appEscolhido.equals("msn"))
            app = new MSNMessenger();
        else if (appEscolhido.equals("facebook"))
            app = new FacebookMessenger();
        else if (appEscolhido.equals("telegram"))
            app = new Telegram();

        app.enviarMensagem();
        app.receberMensagem();

       // app.validarConectadoInternet();

        // System.out.println("MSN--------");

        // MSNMessenger msn = new MSNMessenger();

        // msn.enviarMensagem();
        // msn.receberMensagem();

        // System.out.println("Facebook--------");

        // FacebookMessenger fb = new FacebookMessenger();

        // fb.enviarMensagem();
        // fb.receberMensagem();

        // System.out.println("Telegram--------");

        // Telegram tg = new Telegram();

        // tg.enviarMensagem();
        // tg.receberMensagem();

    }

}
