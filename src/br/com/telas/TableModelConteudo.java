
package br.com.telas;

import br.com.projetoxcurso.Conteudo;
import br.com.projetoxcurso.DataBase;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableModelConteudo implements TableModel{

    @Override
    public int getRowCount() {
        return DataBase.conteudo.size();
    }

    @Override
    public int getColumnCount() {
        return 4; 
    }

    @Override
    public String getColumnName(int i) {
        return new String[]{"Carga Horária","Link","Nº Ordem","Titulo"}[i];
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
        
        
        Conteudo c = DataBase.conteudo.get(linha);
        switch(coluna){
            case 0:c.getCargaHoraria();
            case 1:c.getLink();
            case 2:c.getNrOrdem();
            case 3:c.getTitulo();
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
