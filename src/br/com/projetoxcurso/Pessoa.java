
package br.com.projetoxcurso;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pessoa {
    
    private String nome;
    private String CPF;
    private String email;
    private Calendar DataNascimento;
    
    public Pessoa(String nome, String CPF, String email, Calendar DataNascimento){
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.DataNascimento = DataNascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Calendar DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

}
