package br.com.telas;

import br.com.projetoxcurso.DataBase;
import br.com.projetoxcurso.Pessoa;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableModelPessoa implements TableModel{
    
    @Override
    public int getRowCount() {
        return DataBase.pessoa.size();
    }

    @Override
    public int getColumnCount() {
            return 4;
    }

    @Override
    public String getColumnName(int i) {
        return new String[]{"CPF","Nome","E-mail","Data Nascimento"}[i];    
        
        
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Pessoa p=DataBase.pessoa.get(linha);
        switch(coluna){
            case 0:return p.getCPF();
            case 1:return p.getNome();
            case 2:return p.getEmail();
            case 3:return p.getDataNascimento();
        }
        return "";
               
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        
    }
    
}
