package br.com.telas;

import br.com.projetoxcurso.DataBase;
import br.com.projetoxcurso.Presenca;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Willian
 */
public class TableModelPresenca implements TableModel{

    @Override
    public int getRowCount() {
        return DataBase.presenca.size();
    }

    @Override
    public int getColumnCount() {
        return 2; 
    }

    @Override
    public String getColumnName(int i) {
        return new String[]{"Data","Qtd Horas"}[i];
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
        
        
        Presenca p = DataBase.presenca.get(linha);
        switch(coluna){
            case 0:p.getDataHora();
            case 1:p.getQtdHoras();
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

