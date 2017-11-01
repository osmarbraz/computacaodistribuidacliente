package formulario;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 * Classe que implementa a interface principal do sistema.
 */
@SuppressWarnings("serial")
public class FrmCliente extends JFrame {

    private JPanel contentPane;

    public JLabel jLClienteId;
    public JTextField jTClienteId;
    private JLabel jLNome;
    public JTextField jTNome;
    private JLabel jLCpf;
    public JTextField jTCpf;

    public JButton jBIncluir;
    public JButton jBAlterar;
    public JButton jBExcluir;
    public JButton jBConsultar;
    public JButton jBListar;
    public JButton jBLimpar;
    public JButton jBFechar;

    /**
     * Constructor for the FrmCliente object
     */
    public FrmCliente() {
        inicializar();
    }

    /**
     * Description of the Method
     */
    private void inicializar() {

        //Recupera o container da janela
        contentPane = (JPanel) this.getContentPane();

        jLClienteId = new JLabel();
        jTClienteId = new JTextField();
        jLNome = new JLabel();
        jTNome = new JTextField();
        jLCpf = new JLabel();
        jTCpf = new JTextField();

        jBIncluir = new JButton();
        jBAlterar = new JButton();
        jBConsultar = new JButton();
        jBExcluir = new JButton();
        jBListar = new JButton();
        jBLimpar = new JButton();
        jBFechar = new JButton();

        contentPane.setLayout(null);
        this.setSize(new Dimension(310, 250));
        this.setTitle("Cadastro de Cliente");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        jLClienteId.setBounds(new Rectangle(11, 11, 60, 17));
        jTClienteId.setBounds(new Rectangle(11, 28, 70, 21));
        jLClienteId.setText("ClienteId");

        jLNome.setBounds(new Rectangle(11, 60, 60, 17));
        jTNome.setBounds(new Rectangle(11, 75, 180, 21));
        jLNome.setText("Nome");

        jLCpf.setBounds(new Rectangle(11, 109, 170, 17));
        jTCpf.setBounds(new Rectangle(11, 124, 120, 21));
        jLCpf.setText("CPF");

        jBIncluir.setBounds(new Rectangle(200, 9, 90, 27));
        jBIncluir.setText("Incluir");

        jBAlterar.setBounds(new Rectangle(200, 39, 90, 27));
        jBAlterar.setText("Alterar");

        jBConsultar.setBounds(new Rectangle(200, 69, 90, 27));
        jBConsultar.setText("Consultar");

        jBExcluir.setBounds(new Rectangle(200, 99, 90, 27));
        jBExcluir.setText("Excluir");

        jBListar.setBounds(new Rectangle(200, 129, 90, 27));
        jBListar.setText("Listar");

        jBLimpar.setBounds(new Rectangle(200, 159, 90, 27));
        jBLimpar.setText("Limpar");

        jBFechar.setBounds(new Rectangle(200, 189, 90, 27));
        jBFechar.setText("Fechar");

        contentPane.add(jLClienteId, null);
        contentPane.add(jTClienteId, null);
        contentPane.add(jLNome, null);
        contentPane.add(jTNome, null);
        contentPane.add(jLCpf, null);
        contentPane.add(jTCpf, null);

        contentPane.add(jBIncluir, null);
        contentPane.add(jBAlterar, null);
        contentPane.add(jBConsultar, null);
        contentPane.add(jBExcluir, null);
        contentPane.add(jBListar, null);
        contentPane.add(jBLimpar, null);
        contentPane.add(jBFechar, null);
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            System.exit(0);
        }
    }
}
