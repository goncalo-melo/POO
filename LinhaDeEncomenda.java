public class LinhaDeEncomenda{
    private String referencia;
    private String descricao;
    private double preco; // sem impostos
    private int quantidade;
    private double regimeDeImposto; // percentagem (coloquei as percentagens em decimal ou seja, regime de imposto = 0.06, 0.15, 0.23, etc, same para os descontos)
    private double desconto; // desconto em relação ao preço sem impostos, percentagem

    public LinhaDeEncomenda() {

    }
    /*
    public LinhaDeEncomenda(){
        referencia = "";
        descricao = "";
        preco = 0;
        quantidade = 0;
        regimeDeImposto = 0;
        desconto = 0;
    }
    */

    public LinhaDeEncomenda(String referencia, String descricao, double preco, int quantidade, double regimeDeImposto, double desconto) {
        this.referencia = referencia;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.regimeDeImposto = regimeDeImposto;
        this.desconto = desconto;
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

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getRegimeDeImposto() {
        return this.regimeDeImposto;
    }

    public void setRegimeDeImposto(double regimeDeImposto) {
        this.regimeDeImposto = regimeDeImposto;
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

    public LinhaDeEncomenda preco(double preco) {
        setPreco(preco);
        return this;
    }

    public LinhaDeEncomenda quantidade(int quantidade) {
        setQuantidade(quantidade);
        return this;
    }

    public LinhaDeEncomenda regimeDeImposto(double regimeDeImposto) {
        setRegimeDeImposto(regimeDeImposto);
        return this;
    }

    public LinhaDeEncomenda desconto(double desconto) {
        setDesconto(desconto);
        return this;
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LinhaDeEncomenda)) {
            return false;
        }
        LinhaDeEncomenda linhaDeEncomenda = (LinhaDeEncomenda) o;
        return Objects.equals(referencia, linhaDeEncomenda.referencia) && Objects.equals(descricao, linhaDeEncomenda.descricao) && preco == linhaDeEncomenda.preco && quantidade == linhaDeEncomenda.quantidade && regimeDeImposto == linhaDeEncomenda.regimeDeImposto && desconto == linhaDeEncomenda.desconto;
    }
    */

    public boolean equals(Object o){
        if ( this == o )
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        LinhaDeEncomenda l = (LinhaDeEncomenda) o ;
        return (this.referencia == l.getReferencia()    
            && this.descricao == l.getDescricao()
            && this.preco == l.getPreco()
            && this.quantidade == l.getQuantidade()
            && this.regimeDeImposto == l.getRegimeDeImposto()
            && this.desconto == l.getDesconto());
    }

    @Override
    public String toString() {
        return "{" +
            " referencia='" + getReferencia() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", preco='" + getPreco() + "'" +
            ", quantidade='" + getQuantidade() + "'" +
            ", regimeDeImposto='" + getRegimeDeImposto() + "'" +
            ", desconto='" + getDesconto() + "'" +
            "}";
    }

    public LinhaDeEncomenda(LinhaDeEncomenda umaLinhaDeEncomenda){
        this.referencia = umaLinhaDeEncomenda.referencia;
        this.descricao = umaLinhaDeEncomenda.descricao;
        this.preco = umaLinhaDeEncomenda.preco;
        this.quantidade = umaLinhaDeEncomenda.quantidade;
        this.regimeDeImposto = umaLinhaDeEncomenda.regimeDeImposto;
        this.desconto = umaLinhaDeEncomenda.desconto;
    }


    public LinhaDeEncomenda clone(){
        return new LinhaDeEncomenda(this);
    }
   

    //METODOS DO EXERCICIO
    public double calculaValorLinhaEnc(){
        return quantidade*(((this.preco)*(1-this.desconto))/(1-this.regimeDeImposto));
    }

    public double calculaValorDesconto(){
        return ((quantidade*this.preco)-(quantidade*((this.preco)*(1-this.desconto))));
    }



}

