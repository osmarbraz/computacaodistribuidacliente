package formulario;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.List;
import entidade.Cliente;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Classe que implementa a interface para a tabela de listagem
 */
public class FrmClienteListar extends JFrame {

    private JPanel contentPane;
    private JTable tabela;
    private FrmClienteListarModelo modelo;
    public JButton jBFechar;

    /**
     * Construtor sem argumentos
     */
    public FrmClienteListar() {
        inicializar();
    }

    /**
     * Description of the Method
     */
    private void inicializar() {

        //Recupera o container da janela
        contentPane = (JPanel) this.getContentPane();

        contentPane.setLayout(null);
        this.setSize(new Dimension(310, 220));
        this.setTitle("Listar Cliente");

        jBFechar = new JButton();
        jBFechar.setBounds(new Rectangle(200, 159, 90, 27));
        jBFechar.setText("Fechar");

        modelo = new FrmClienteListarModelo();
        tabela = new JTable(modelo);
        tabela.setPreferredScrollableViewportSize(new Dimension(500, 70));
        tabela.setFillsViewportHeight(true);

        //Cria o painel de rolagem e adiciona a tabela 		
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(new Rectangle(1, 1, 300, 150));

        //Adiciona o painel de rolagem a este painel.
        contentPane.add(scrollPane, null);
        contentPane.add(jBFechar, null);
    }

    public void popularTabela(List<Cliente> clientes) {
        modelo.popularTabela(clientes);
    }
}
