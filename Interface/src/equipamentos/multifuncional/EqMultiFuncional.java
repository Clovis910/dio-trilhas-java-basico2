package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EqMultiFuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via Equipamento Multi Funcional !");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via Equipamento Multi Funcional !");
    }

    @Override
    public void copiar() {
       System.out.println("Copiando via Equipamento Multi Funcional !");
    }

}
