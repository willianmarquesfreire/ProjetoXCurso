package br.com.projetoxcurso;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    
    public static List<Pessoa> pessoa;
    public static List<Curso> curso;
    public static List<Conteudo> conteudo;
    public static List<Matricula> matricula;
    public static List<Presenca> presenca;
    public static List<Turma> turma;
    
    public DataBase(){
        pessoa = new ArrayList<>();
        curso = new ArrayList<>();
        conteudo = new ArrayList<>();
        matricula = new ArrayList<>();
        presenca = new ArrayList<>();
        turma = new ArrayList<>();
    }
    
}
