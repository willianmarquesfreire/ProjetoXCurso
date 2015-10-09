package br.com.telas;

import br.com.projetoxcurso.DataBase;
import br.com.projetoxcurso.Matricula;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableModelMatricula implements TableModel{

    @Override
    public int getRowCount() {
        return DataBase.matricula.size();
    }

    @Override
    public int getColumnCount() {
        return 5; 
    }

    @Override
    public String getColumnName(int i) {
        return new String[]{"Dados Pagamento","Data","Forma Pagamento","Pessoa","Vlr Pago"}[i];
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
        
        
        Matricula m = DataBase.matricula.get(linha);
        switch(coluna){
            case 0:m.getDadosPagamento();
            case 1:m.getData();
            case 2:m.getFormaPagamento();
            case 3:m.getPessoa();
            case 4:m.getValorPago();
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
