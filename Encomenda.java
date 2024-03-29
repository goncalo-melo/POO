import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Encomenda{
    private String nomeCliente;
    private int nifCliente;
    private String morada;
    private int numEnc;
    private LocalDate dataEnc;
    private ArrayList<LinhaDeEncomenda> ls; 

    public Encomenda(){

    }

    /*
    public Encomenda(){
        this.nomeCliente = "";
        this.nifCliente = -1;
        this.morada = "";
        this.numEnc = -1;
        this.dataEnc = LocalDate.MIN;
        this.ls = new ArrayList<>(); 
    }
    */

    public Encomenda(String nomeCliente, int nifCliente, String morada, int numEnc, LocalDate dataEnc, ArrayList<LinhaDeEncomenda> ls){
        this.nomeCliente = nomeCliente;
        this.nifCliente = nifCliente;
        this.morada = morada;
        this.numEnc = numEnc;
        this.dataEnc = dataEnc;
        this.ls = ls;
    }

    //GETS
    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public int getNifCliente(){
        return this.nifCliente;
    }

    public String getMorada(){
        return this.morada;
    }

    public int getNumEnc(){
        return this.numEnc;
    }

    public LocalDate getDataEnc(){
        return this.dataEnc;
    }

    public List<LinhaDeEncomenda> getLs(){
        return this.ls;
    }

    public Encomenda(Encomenda umaEncomenda){
        this.nomeCliente = umaEncomenda.nomeCliente;
        this.nifCliente = umaEncomenda.nifCliente;
        this.morada = umaEncomenda.morada;
        this.numEnc = umaEncomenda.numEnc;
        this.dataEnc = umaEncomenda.dataEnc;
        this.ls = umaEncomenda.ls;
    }

    public void setNomeCliente(String newNomeCliente){
        this.nomeCliente = newNomeCliente;
    }

    public void setNumFiscal(int newNifCliente){
        this.nifCliente = newNifCliente;
    }
    public void setMorada(String newMorada){
        this.morada = newMorada;
    }

    public void setNumEnc(int newNumEnc){
        this.numEnc = newNumEnc;
    }

    public void setDataEnc(LocalDate newDataEnc){
        this.dataEnc = newDataEnc;
    }

    public void setLs(ArrayList<LinhaDeEncomenda> newLs){
        this.ls = newLs;
    }


    public boolean equals(Object o){
        if ( this == o )
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        Encomenda e = (Encomenda) o ;
        return (this.nomeCliente == e.getNomeCliente()    
            && this.nifCliente == e.getNifCliente()
            && this.morada == e.getMorada()
            && this.numEnc == e.getNumEnc()
            && this.dataEnc == e.getDataEnc()
            && this.ls == e.getLs());
    }

    public String toString(){
        return "Encomenda \nnomeCliente: "+this.nomeCliente+"\nNúmero Fiscal: "+this.nifCliente+"\nMorada: "+this.morada+"\nNúmero da encomenda: "+this.numEnc+"\nData da encomenda: "+this.dataEnc+"\nLinhas de encomenda: "+this.ls;
                
    }
   
    public Encomenda clone(){
        return new Encomenda(this);
    }

    //METODOS DO EXERCICIO
    public double calculaValorTotal(){
        double valorTotal=0;
        for(int i=0; i<ls.size(); i++){
            valorTotal += ls.get(i).calculaValorLinhaEnc();
        }
        return valorTotal;
    }

    public double calculaValorDescontoTotal(){
        double descontoTotal=0;
        for(int i=0; i<ls.size(); i++){
            descontoTotal += ls.get(i).calculaValorDesconto();
        }
        return descontoTotal;
    }

    public double numeroTotalProdutos(){
        int quantidadeTotal=0; 
        for(int i=0; i<ls.size(); i++){
            quantidadeTotal += ls.get(i).getQuantidade();
        }
        return quantidadeTotal;
    }

    public boolean existeProdutoEncomenda(String refProduto){
        for(int i=0; i<ls.size(); i++){
            if (ls.get(i).getReferencia()==refProduto) return true;
        }
        return false;
    }

    public void adicionaLinha(LinhaDeEncomenda linha){ 
        ls.add(linha.clone());
    }

    public void removeProduto(String codProduto){
        for(int i=0; i<ls.size(); i++){
            if (ls.get(i).getReferencia()==codProduto) ls.remove(i);
        }
    }

}
