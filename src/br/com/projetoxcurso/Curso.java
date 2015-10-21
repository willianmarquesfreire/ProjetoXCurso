package br.com.projetoxcurso;

import java.util.List;

public class Curso {
    
    private String nome;
    private String descricao;
    private String ministrante;
    private List<Turma> turmas;
    private List<Conteudo> conteudos;

    public Curso(String nome, String descricao, String ministrante, List<Turma> turmas, List<Conteudo> conteudos) {
        this.nome = nome;
        this.descricao = descricao;
        this.ministrante = ministrante;
        this.turmas = turmas;
        this.conteudos = conteudos;
    }
    
    

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    
    public double calculaHora(){
        return 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMinistrante() {
        return ministrante;
    }

    public void setMinistrante(String ministrante) {
        this.ministrante = ministrante;
    }
    
}
