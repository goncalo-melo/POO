import java.util.ArrayList;

public class Telemovel{

    private String marca;
    private String modelo;
    private String display;
    private int armMensagens;
    private int armFotosEApps;
    private int armFotos;
    private int espacoOcupado;
    private int numFotosGuarda;
    private int numAppsInstaladas;
    private ArrayList<String> apps;

    
    public Telemovel() {

    }

    public Telemovel(String marca, String modelo, String display, int armMensagens, int armFotosEApps, int armFotos, int espacoOcupado, int numFotosGuarda, int numAppsInstaladas, ArrayList<String> apps) {
        this.marca = marca;
        this.modelo = modelo;
        this.display = display;
        this.armMensagens = armMensagens;
        this.armFotosEApps = armFotosEApps;
        this.armFotos = armFotos;
        this.espacoOcupado = espacoOcupado;
        this.numFotosGuarda = numFotosGuarda;
        this.numAppsInstaladas = numAppsInstaladas;
        this.apps = apps;
    }

    public Telemovel(Telemovel umTelemovel){
        this.marca=umTelemovel.marca;
        this.modelo = umTelemovel.modelo;
        this.display = umTelemovel.display;
        this.armMensagens = umTelemovel.armMensagens;
        this.armFotosEApps = umTelemovel.armFotosEApps;
        this.armFotos = umTelemovel.armFotos;
        this.espacoOcupado = umTelemovel.espacoOcupado;
        this.numFotosGuarda = umTelemovel.numFotosGuarda;
        this.numAppsInstaladas = umTelemovel.numAppsInstaladas;
        this.apps = umTelemovel.apps;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDisplay() {
        return this.display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getArmMensagens() {
        return this.armMensagens;
    }

    public void setArmMensagens(int armMensagens) {
        this.armMensagens = armMensagens;
    }

    public int getArmFotosEApps() {
        return this.armFotosEApps;
    }

    public void setArmFotosEApps(int armFotosEApps) {
        this.armFotosEApps = armFotosEApps;
    }

    public int getArmFotos() {
        return this.armFotos;
    }

    public void setArmFotos(int armFotos) {
        this.armFotos = armFotos;
    }

    public int getEspacoOcupado() {
        return this.espacoOcupado;
    }

    public void setEspacoOcupado(int espacoOcupado) {
        this.espacoOcupado = espacoOcupado;
    }

    public int getNumFotosGuarda() {
        return this.numFotosGuarda;
    }

    public void setNumFotosGuarda(int numFotosGuarda) {
        this.numFotosGuarda = numFotosGuarda;
    }

    public int getNumAppsInstaladas() {
        return this.numAppsInstaladas;
    }

    public void setNumAppsInstaladas(int numAppsInstaladas) {
        this.numAppsInstaladas = numAppsInstaladas;
    }

    public ArrayList<String> getApps() {
        return this.apps;
    }

    public void setApps(ArrayList<String> apps) {
        this.apps = apps;
    }

    //missing equals, clone and toString

    //METODOS DO EXERCICIO
    public boolean existeEspaco(int numBytes){
        if (numBytes<(this.armMensagens+this.armFotosEApps-this.espacoOcupado)) return true;
        return false;
    }
    
    public void instalaApp(String nome, int tamanho){
        this.espacoOcupado += tamanho;
        this.numAppsInstaladas++;
        this.apps.add(nome); 
    }

    public void recebeMsg(String msg){
        this.espacoOcupado += msg.length();
        
    }

    //public double tamMedioApps(){ bro wtf ou tou burro ou isto é impossivel 
    //}

    //public String maiorMsg(){
   // }

    public void removeApp(String nome, int tamanho){
        this.apps.remove(nome);
        this.espacoOcupado -= tamanho;
        this.numAppsInstaladas--;
    }
    

    

}