package formulario;

import javax.swing.JOptionPane;

/**
 * Classe que implementa a interface principal do sistema.
 */
public class FrmCliente extends javax.swing.JFrame {

    private javax.swing.JPanel jPaineBotoes;
    public javax.swing.JButton jBIncluir;
    public javax.swing.JButton jBAlterar;
    public javax.swing.JButton jBConsultar;
    public javax.swing.JButton jBExcluir;
    public javax.swing.JButton jBListar;
    public javax.swing.JButton jBLimpar;
    public javax.swing.JButton jBFechar;

    private javax.swing.JPanel jPainelCampos;
    public javax.swing.JLabel jLClienteId;
    public javax.swing.JTextField jTClienteId;
    private javax.swing.JLabel jLNome;
    public javax.swing.JTextField jTNome;
    private javax.swing.JLabel jLCpf;
    public javax.swing.JTextField jTCpf;

    private javax.swing.JPanel jPainelServidor;
    private javax.swing.JLabel jLEnderecoServidor;
    public javax.swing.JTextField jTEnderecoServidor;
    private javax.swing.JLabel jLPortaServidor;
    public javax.swing.JTextField jTPortaServidor;

    /**
     * Cria um novo FrmCliente
     */
    public FrmCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        //Instancia dos componentes
        jPainelCampos = new javax.swing.JPanel();
        jLClienteId = new javax.swing.JLabel();
        jTClienteId = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jTCpf = new javax.swing.JTextField();
        jLCpf = new javax.swing.JLabel();

        jPaineBotoes = new javax.swing.JPanel();
        jBIncluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBConsultar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBListar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();

        jPainelServidor = new javax.swing.JPanel();
        jLEnderecoServidor = new javax.swing.JLabel();
        jTEnderecoServidor = new javax.swing.JTextField();
        jTPortaServidor = new javax.swing.JTextField();
        jLPortaServidor = new javax.swing.JLabel();

        //Saida da janela
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        jPainelCampos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLClienteId.setText("ClienteId:");
        jLNome.setText("Nome:");
        jLCpf.setText("CPF:");        
        jBIncluir.setText("Incluir");
        jBAlterar.setText("Alterar");
        jBConsultar.setText("Consultar");
        jBExcluir.setText("Excluir");
        jBListar.setText("Listar");
        jBLimpar.setText("Limpar");
        jBFechar.setText("Fechar");

        jPaineBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jPaineBotoesLayout = new javax.swing.GroupLayout(jPaineBotoes);
        jPaineBotoes.setLayout(jPaineBotoesLayout);
        jPaineBotoesLayout.setHorizontalGroup(
                jPaineBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPaineBotoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPaineBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jBAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBIncluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPaineBotoesLayout.setVerticalGroup(
                jPaineBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPaineBotoesLayout.createSequentialGroup()
                                .addComponent(jBIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBListar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBFechar)
                                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPainelCamposLayout = new javax.swing.GroupLayout(jPainelCampos);
        jPainelCampos.setLayout(jPainelCamposLayout);
        jPainelCamposLayout.setHorizontalGroup(
                jPainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelCamposLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLClienteId)
                                        .addComponent(jLCpf)
                                        .addComponent(jLNome)
                                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jPaineBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
        jPainelCamposLayout.setVerticalGroup(
                jPainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPainelCamposLayout.createSequentialGroup()
                                .addComponent(jLClienteId)
                                .addGap(1, 1, 1)
                                .addComponent(jTClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLNome)
                                .addGap(1, 1, 1)
                                .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jTCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPainelCamposLayout.createSequentialGroup()
                                .addComponent(jPaineBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPainelServidor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLEnderecoServidor.setText("Endereço Servidor:");
        jTEnderecoServidor.setText("localhost");
        jTPortaServidor.setText("1099");
        jLPortaServidor.setText("Porta Servidor:");

        javax.swing.GroupLayout jPainelServidorLayout = new javax.swing.GroupLayout(jPainelServidor);
        jPainelServidor.setLayout(jPainelServidorLayout);
        jPainelServidorLayout.setHorizontalGroup(
                jPainelServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPainelServidorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPainelServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTEnderecoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLEnderecoServidor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPainelServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLPortaServidor)
                                        .addComponent(jTPortaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPainelServidorLayout.setVerticalGroup(
                jPainelServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelServidorLayout.createSequentialGroup()
                                .addGroup(jPainelServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLEnderecoServidor)
                                        .addComponent(jLPortaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPainelServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTEnderecoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTPortaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPainelServidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPainelCampos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPainelServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPainelCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * Mostra mensagem na saida padrão  
     * @param mensagem Uma mensagem a ser exibida
     */
    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
