import java.util.ArrayList;

public class CasaInteligente {
    private ArrayList<Lampada> lampadas;

    //Construtores
    public CasaInteligente(){
        this.lampadas = new ArrayList<Lampada>();
    }

    public CasaInteligente(ArrayList<Lampada> lista){
        this.setLampadas(lista);
    }



    public ArrayList<Lampada> getLampadas(){
        ArrayList<Lampada> list = new ArrayList<Lampada>();

        for(Lampada a : this.lampadas){
            list.add(a.clone());
        }

        return list;
    }

    public void setLampadas(ArrayList<Lampada> lamps){
        for(Lampada a : lamps){
            this.lampadas.add(a.clone());
        }
    }

    public void addLampada(Lampada L){
        this.lampadas.add(L.clone());
    }

    public void ligaLampadaNormal(int index){
        this.lampadas.get(index).lampON();
    }

    public void ligaLampadaEco(int index){
        this.lampadas.get(index).lampECO();
    }
}




