package controle;

import java.awt.event.ActionEvent;
import formulario.FrmClienteListar;
import formulario.FrmCliente;
import entidade.Cliente;

/**
 * Classe que realiza a interação entre a interface e a entidade do sistema.
 */
public class CtrClienteListar {

    private FrmCliente frmPai;
    private FrmClienteListar frmClienteListar;

    /**
     * Construtor sem argumentos.
     * @param frmPai o formulário pai da janela
     */
    public CtrClienteListar(FrmCliente frmPai) {
        //Seta a janela pai
        this.frmPai = frmPai;

        // Instacia a janela
        setFrmClienteListar(new FrmClienteListar());

        // Associa os eventos aos componentes
        getFrmClienteListar().jBFechar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBFechar_actionPerformed(e);
                    }
                });
    }

    /**
     * Operação que inicia a sequência de interações da manutenção de cliente.
     */
    public void executar() {
        Cliente cliente = new Cliente();
        getFrmClienteListar().popularTabela(cliente.getLista(getFrmPai().jTEnderecoServidor.getText(), Integer.parseInt(getFrmPai().jTPortaServidor.getText())));
        getFrmClienteListar().setVisible(true);
    }

    /**
     * Fecha a janela
     * @param e Objeto do evento
     */    
    public void jBFechar_actionPerformed(ActionEvent e) {
        getFrmClienteListar().setVisible(false);
    }

    /**
     * Retorna o formulário utilizado por este controle.
     *
     * @return Um formulário de listar cliente
     */
    public FrmClienteListar getFrmClienteListar() {
        return frmClienteListar;
    }

    /**
     * Modifica o formulário utilizando por este controle.
     *
     * @param frmClienteListar Um formulario do tipo FrmClienteListar.
     */
    public void setFrmClienteListar(FrmClienteListar frmClienteListar) {
        this.frmClienteListar = frmClienteListar;
    }

    /**
     * Retorna o formulário pai deste controle.
     * @return um formulário pai
     */
    public FrmCliente getFrmPai() {
        return frmPai;
    }

    /**
     * Modifica o formulário pai utilizado por este controle.
     *
     * @param frmPai Um formulário do tipo FrmCliente pai da janela.
     */
    public void setFrmPai(FrmCliente frmPai) {
        this.frmPai = frmPai;
    }
}
