 // --- CIRCULO ---.
 public class Circulo {

    private Ponto centro;
    private double raio;


    public Circulo(){
        this.centro = new Ponto();
        this.raio = 1;
    }

    public Circulo(Ponto centro, double raio){
        this.centro = centro.clone();
        this.raio = raio;
    } 

    public Circulo(Circulo umCirculo){
        this.centro = umCirculo.getPonto();
        this.raio = umCirculo.getRaio();
    }


    public Ponto getPonto(){
        return this.centro.clone();
    }

    public double getRaio(){
        return this.raio;
    }

    public void setPonto(Ponto newCentro){
        this.centro = newCentro.clone();
    }

    public void setRaio(double newRaio){
        this.raio = newRaio;
    }
    
    public void alteraCentro(Ponto centro){
        this.centro = centro;
    }

    public double calculaArea(){
        return Math.PI*(this.raio);
    }

    public double calculaPerimetro(){
        return Math.PI*(2*this.raio);
    }
    
    
    @Override
    public boolean equals(Object o){
        if ( this == o )
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        Circulo c = (Circulo) o ;
        return (this.centro.equals(c.centro) && this.raio == c.getRaio());
    }

    @Override
    public String toString(){
        return "Centro: X = "+ this.centro.getX() + "; Y = " + this.centro.getY() + "\nRaio = " + this.raio;
    }
    
    @Override
    public Circulo clone(){
        return new Circulo(this);
    }
    
}

