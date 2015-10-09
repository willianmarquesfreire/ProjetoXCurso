package br.com.telas;

import br.com.projetoxcurso.DataBase;
import br.com.projetoxcurso.Turma;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableModelTurma implements TableModel{

    @Override
    public int getRowCount() {
        return DataBase.turma.size();
    }

    @Override
    public int getColumnCount() {
        return 7; 
    }

    @Override
    public String getColumnName(int i) {
        return new String[]{"Data Inicial","Data Final","Valor","Mín. Part.","Máx. Part.","Online","Lugar"}[i];
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
        
        
        Turma t = DataBase.turma.get(linha);
        switch(coluna){
            case 0:t.getDataInicial();
            case 1:t.getDataFinal();
            case 2:t.getValor();
            case 3:t.getMinimoParticipantes();
            case 4:t.getMaximoParticipantes();
            case 5:t.isOnline();
            case 6:t.getLugar();
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
