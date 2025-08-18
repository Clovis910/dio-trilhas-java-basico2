package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // System.out.println("Processo Seletivo");
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);

        // imprimirCandidatosSelecionados();

      //  String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };



    }

    static void imprimirCandidatosSelecionados() {

        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {

            System.out.println(" Candidato: " + candidatos[indice] + " com o indice: " + indice);
        }

        System.out.println("Forma abreviada for each");

        for (String candidato : candidatos) {

            System.out.println("O candidato selecionado foi: " + candidato);

        }

    }

    static void selecaoCandidatos() {

        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
                "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual <= candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O canditato " + candidato + " solicitou esse salario: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato selecionado " + candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }
    }

    static double valorPretendido() {

        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar Para o Candidato");

        } else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com Contra proposta");

        else {
            System.out.println("Aguardando demais candidatos");

        }

    }

}
