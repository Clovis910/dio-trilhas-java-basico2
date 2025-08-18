
public class FormatadorDeCep {

    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
           System.err.println("O CEP não corresponde a regra de negocio");
        }

        
    }




static String formatarCep(String cep) throws CepInvalidoException{

    if(cep.length()!=8)
        throw new CepInvalidoException();

        return "23.765-064";
    
}
}