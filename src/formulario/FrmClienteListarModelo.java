package formulario;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.ArrayList;
import entidade.Cliente;

/**
 * Classe que implementa tabela abstrata para a tabela de listagem
 */
public class FrmClienteListarModelo extends AbstractTableModel {

    private String[] cabecalho = {"Id", "Nome", "CPF"};
    private List dados;

    public FrmClienteListarModelo() {
        dados = new ArrayList();
    }

    public void popularTabela(List<Cliente> clientes) {
        //Adiciona os dados da tabela
        String linhaNova[] = null;
        for (Cliente cliente : clientes) {
            linhaNova = new String[cabecalho.length];
            linhaNova[0] = cliente.getClienteId();
            linhaNova[1] = cliente.getNome();
            linhaNova[2] = cliente.getCpf();
            dados.add(linhaNova);
        }
    }

    public int getColumnCount() {
        return cabecalho.length;
    }

    public int getRowCount() {
        return dados.size();
    }

    public String getColumnName(int col) {
        return cabecalho[col];
    }

    public Object getValueAt(int row, int col) {
        String[] linha = (String[]) dados.get(row);
        return linha[col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public boolean isCellEditable(int row, int col) {
        return true;
    }

    public void setValueAt(Object value, int row, int col) {
        String[] linha = (String[]) dados.get(row);
        linha[col] = (String) value;
        fireTableCellUpdated(row, col);
    }
}
