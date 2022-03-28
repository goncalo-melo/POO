import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;


public class YTVideo{

    private String nome;
    private byte conteudo;
    private LocalDate dataCarregamento;
    private String resolucao;
    private LocalDateTime duracao;
    private ArrayList<String> comentarios;
    private int likes;
    private int dislikes;


    public YTVideo() {

    }

    public YTVideo(String nome, byte conteudo, LocalDate dataCarregamento, String resolucao, LocalDateTime duracao, ArrayList<String> comentarios, int likes, int dislikes) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.dataCarregamento = dataCarregamento;
        this.resolucao = resolucao;
        this.duracao = duracao;
        this.comentarios = comentarios;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public YTVideo(YTVideo umYTVideo){
        this.nome = umYTVideo.nome;
        this.conteudo = umYTVideo.conteudo;
        this.dataCarregamento = umYTVideo.dataCarregamento;
        this.resolucao = umYTVideo.resolucao;
        this.duracao = umYTVideo.duracao;
        this.comentarios = umYTVideo.comentarios;
        this.likes = umYTVideo.likes;
        this.dislikes = umYTVideo.dislikes;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(byte conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDate getDataCarregamento() {
        return this.dataCarregamento;
    }

    public void setDataCarregamento(LocalDate dataCarregamento) {
        this.dataCarregamento = dataCarregamento;
    }

    public String getResolucao() {
        return this.resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public LocalDateTime getDuracao() {
        return this.duracao;
    }

    public void setDuracao(LocalDateTime duracao) {
        this.duracao = duracao;
    }

    public ArrayList<String> getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return this.dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }


    //METODOS DO EXERCICIO
    public void insereComentario(String comentario){
        this.comentarios.add(comentario);
    }

    public long qntsDiasDepois(){
        // trying to work with LOcalDate library
        return 0;
    }

    public void thumbsUp(){
        this.likes++;
    }

    //public String processa;
    

}