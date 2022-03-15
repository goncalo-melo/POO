import java.lang.Math.*;

public class Ficha3 {

    // --- CIRCULO ---.
    public class Circulo{
        private double x;
        private double y;
        private double raio;


        public Circulo(){
            this.x = 0;
            this.y = 0;
            this.raio = 1;
        }

        public Circulo(double x, double y, double raio){
            this.x = x;
            this.y = y;
            this.raio = raio;
        }

        public double getX(){
            return this.x;
        }

        public double getY(){
            return this.y;
        }

        public double getRaio(){
            return this.raio;
        }

        public Circulo(Circulo umCirculo){
            this.x = umCirculo.getX();
            this.y = umCirculo.getY();
            this.raio = umCirculo.getRaio();
        }

        public void setX(double newX){
            this.x = newX;
        }

        public void setY(double newY){
            this.y = newY; 
        }

        public void setRaio(double newRaio){
            this.raio = newRaio;
        }

        public void alteraCentro(double x, double y){
            this.x = x;
            this.y = y;
        }

        public double calculaArea(){
            return Math.PI*(this.raio);
        }

        public double calculaPerimetro(){
            return Math.PI*(2*this.raio);
        }
        
        public boolean equals(Object o){
            if ( this == o )
                return true;
            if ((o == null) || (this.getClass() != o.getClass()))
                return false;
            Circulo c = (Circulo) o ;
            return (this.x == c.getX() && this.y == c.getY() && this.raio == c.getRaio());
        }

        public String toString(){
            return "Centro: X = "+ this.x + "; Y = " + this.y + "\nRaio = " + this.raio;
        }
       
        public Circulo clone(){
            return new Circulo(this);
        }
        
        public double teste(){
            return calculaArea();
        }
    }



    // --- TELEMOVEL ---

    public class Telemovel{
        private String marca;
        private String modelo;
        private String display; //?
        private String armazenamentoMsg;
        private String armazenamentoFotEApp;
        private String armazenamentoFot;
        private String armazenamentoApp;
        private int espacoOcupado;
        private int numFot;
        private int numApp;
        private String appNames;
    }

    //uncomplete

    
}
