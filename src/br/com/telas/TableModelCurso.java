package br.com.telas;

import br.com.projetoxcurso.Curso;
import br.com.projetoxcurso.DataBase;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Willian
 */
public class TableModelCurso implements TableModel{

    @Override
    public int getRowCount() {
        return DataBase.curso.size();
    }

    @Override
    public int getColumnCount() {
        return 3; 
    }

    @Override
    public String getColumnName(int i) {
        return new String[]{"Descrição","Ministrante","Nome"}[i];
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
        
        
        Curso c = DataBase.curso.get(linha);
        switch(coluna){
            case 0:c.getDescricao();
            case 1:c.getMinistrante();
            case 2:c.getNome();
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

