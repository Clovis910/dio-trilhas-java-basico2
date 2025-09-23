package estabelecimento;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EqMultiFuncional;

public class Fabrica {

    public static void main(String[] args) {
        
    

   // Impressora impressora = new Deskjet();

    Impressora impressora = new EqMultiFuncional();

    impressora.imprimir();

    }
}
