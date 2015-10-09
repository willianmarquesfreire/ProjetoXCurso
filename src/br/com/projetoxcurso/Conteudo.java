package br.com.projetoxcurso;

public class Conteudo {
    
    private String nrOrdem;
    private String titulo;
    private String link;
    private double cargaHoraria;

    public String getNrOrdem() {
        return nrOrdem;
    }

    public void setNrOrdem(String nrOrdem) {
        this.nrOrdem = nrOrdem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}
