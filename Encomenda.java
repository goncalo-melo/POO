public class Encomenda{
    private String nome;
    private int numFiscal;
    private String morada;
    private int numEnc;
    private String dataEnc;//string???
    private LinhaDeEncomenda[] ls; //how to call LinahDeEncomenda and work with them in arrays, plus iniatilaziation

    //CREATE NO PARAM
    public Encomenda(){
        this.nome = "";
        this.numFiscal = -1;
        this.morada = "";
        this.numEnc = -1;
        this.dataEnc = "";
        this.ls = new LinhaDeEncomenda[0]; // da fuck is this shit
    }

    //CREATE PARAM
    public Encomenda(String nome, int numFiscal, String morada, int numEnc, String dataEnc, LinhaDeEncomenda[] ls){
        this.nome = nome;
        this.numFiscal = numFiscal;
        this.morada = morada;
        this.numEnc = numEnc;
        this.dataEnc = dataEnc;
        this.ls = ls;
    }

    //GETS
    public String getNome(){
        return this.nome;
    }

    public int getNumFiscal(){
        return this.numFiscal;
    }

    public String getMorada(){
        return this.morada;
    }

    public int getNumEnc(){
        return this.numEnc;
    }

    public String getDataEnc(){
        return this.dataEnc;
    }

    public LinhaDeEncomenda[] getLs(){
        return this.ls;
    }

    //CLONE FROM ANOTHER ENCOMENDA
    public Encomenda(Encomenda umaEncomenda){
        this.nome = umaEncomenda.nome;
        this.numFiscal = umaEncomenda.numFiscal;
        this.morada = umaEncomenda.morada;
        this.numEnc = umaEncomenda.numEnc;
        this.dataEnc = umaEncomenda.dataEnc;
        this.ls = umaEncomenda.ls;
    }

    //SETS
    public void setNome(String newNome){
        this.nome = newNome;
    }

    public void setNumFiscal(int newNumFiscal){
        this.numFiscal = newNumFiscal;
    }
    public void setMorada(String newMorada){
        this.morada = newMorada;
    }

    public void setNumEnc(int newNumEnc){
        this.numEnc = newNumEnc;
    }

    public void setDataEnc(String newDataEnc){
        this.dataEnc = newDataEnc;
    }

    public void setLs(LinhaDeEncomenda[] newLs){
        this.ls = newLs;
    }


    public boolean equals(Object o){
        if ( this == o )
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        Encomenda e = (Encomenda) o ;
        return (this.nome == e.getNome()    
            && this.numFiscal == e.getNumFiscal()
            && this.morada == e.getMorada()
            && this.numEnc == e.getNumEnc()
            && this.dataEnc == e.getDataEnc()
            && this.ls == e.getLs());
    }

    public String toString(){
        return "Encomenda \nNome: "+this.nome+"\nNúmero Fiscal: "+this.numFiscal+"\nMorada: "+this.morada+"\nNúmero da encomenda: "+this.numEnc+"\nData da encomenda: "+this.dataEnc+"\nLinhas de encomenda: "+this.ls;
                
    }
   
    public Encomenda clone(){
        return new Encomenda(this);
    }


    //METODOS DO EXERCICIO
    

}
