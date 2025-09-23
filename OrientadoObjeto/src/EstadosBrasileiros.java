public enum EstadosBrasileiros {

    SAO_PAULO ("SP", "São Paulo", 10),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 11),
    PIAUI("PI", "Piauí", 12),
    MARANHAO("MA", "Maranhão", 13),
    CEARA("CE","Ceará", 14),
    PERNAMBUCO("PE", "Pernambuco", 15)
    
    
    ;

    private String sigla;
    private String nome ;
    private int ibge;
    
   

    private EstadosBrasileiros(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }
    
    public String getSigla() {
        return sigla;
    }
    
    public String getNomeMaiusculo(){

        return nome.toUpperCase();
    }

    public int getIbge(){

        return ibge;
    }
    

}
