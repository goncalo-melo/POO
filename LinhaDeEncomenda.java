public class LinhaDeEncomenda {

    private String referencia;
    private String descricao;
    private double precoBruto; 
    private int quantidade;
    private double imposto; 
    private double desconto;

    public LinhaDeEncomenda() {
    }

    public LinhaDeEncomenda(String referencia, String descricao, double precoBruto, int quantidade, double imposto, double desconto) {
        this.referencia = referencia;
        this.descricao = descricao;
        this.precoBruto = precoBruto;
        this.quantidade = quantidade;
        this.imposto = imposto;
        this.desconto = desconto;
    }

    public LinhaDeEncomenda(LinhaDeEncomenda umaLinhaDeEncomenda){
        this.referencia = umaLinhaDeEncomenda.referencia;
        this.descricao = umaLinhaDeEncomenda.descricao;
        this.precoBruto = umaLinhaDeEncomenda.precoBruto;
        this.quantidade = umaLinhaDeEncomenda.quantidade;
        this.imposto = umaLinhaDeEncomenda.imposto;
        this.desconto = umaLinhaDeEncomenda.desconto;
    }


    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoBruto() {
        return this.precoBruto;
    }

    public void setPrecoBruto(double precoBruto) {
        this.precoBruto = precoBruto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getImposto() {
        return this.imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public LinhaDeEncomenda referencia(String referencia) {
        setReferencia(referencia);
        return this;
    }

    public LinhaDeEncomenda descricao(String descricao) {
        setDescricao(descricao);
        return this;
    }

    public LinhaDeEncomenda precoBruto(double precoBruto) {
        setPrecoBruto(precoBruto);
        return this;
    }

    public LinhaDeEncomenda quantidade(int quantidade) {
        setQuantidade(quantidade);
        return this;
    }

    public LinhaDeEncomenda imposto(double imposto) {
        setImposto(imposto);
        return this;
    }

    public LinhaDeEncomenda desconto(double desconto) {
        setDesconto(desconto);
        return this;
    }


    @Override
    public boolean equals(Object o){
        if ( this == o )
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        LinhaDeEncomenda l = (LinhaDeEncomenda) o ;
        return (this.referencia == l.getReferencia()    
            && this.descricao == l.getDescricao()
            && this.precoBruto == l.getPrecoBruto()
            && this.quantidade == l.getQuantidade()
            && this.imposto == l.getImposto()
            && this.desconto == l.getDesconto());
    }

    @Override
    public String toString() {
        return "[\n" +
            "Referência = '" + getReferencia() + "'" +
            " \nDescrição = '" + getDescricao() + "'" +
            " \nPreço bruto = '" + getPrecoBruto() + "'" +
            " \nQuantidade = '" + getQuantidade() + "'" +
            " \nImposto = '" + getImposto() + "'" +
            " \nDesconto = '" + getDesconto() + "'" +
            "\n]";
    }

    @Override
    public LinhaDeEncomenda clone(){
        return new LinhaDeEncomenda(this);
    }
   

    //METODOS DO EXERCICIO
    public double calculaValorLinhaEnc(){
        return quantidade*(((this.precoBruto)*(1-this.desconto))/(1-this.imposto));
    }

    public double calculaValorDesconto(){
        return ((quantidade*this.precoBruto)-(quantidade*((this.precoBruto)*(1-this.desconto))));
    }

}

