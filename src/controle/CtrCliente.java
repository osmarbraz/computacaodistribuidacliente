package controle;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import formulario.FrmCliente;
import entidade.Cliente;

/**
 * Classe que realiza a interação entre a interface e a entidade do sistema.
 */
public class CtrCliente {

    private FrmCliente frmCliente;

    /**
     * Construtor sem argumentos.
     */
    public CtrCliente() {
        // Instacia a janela
        setFrmCliente(new FrmCliente());

        // Associa os eventos aos componentes
        getFrmCliente().jBIncluir
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBIncluir_actionPerformed(e);
                    }
                });

        getFrmCliente().jBAlterar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBAlterar_actionPerformed(e);
                    }
                });

        getFrmCliente().jBConsultar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBConsultar_actionPerformed(e);
                    }
                });

        getFrmCliente().jBExcluir
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBExcluir_actionPerformed(e);
                    }
                });

        getFrmCliente().jBListar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBListar_actionPerformed(e);
                    }
                });

        getFrmCliente().jBLimpar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBLimpar_actionPerformed(e);
                    }
                });

        getFrmCliente().jBFechar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBFechar_actionPerformed(e);
                    }
                });

        getFrmCliente().jLClienteId
                .addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        System.out.println("Inserido 2 clientes");
                        Cliente cli1 = new Cliente("1", "Joao", "1111");
                        cli1.inserir(getFrmCliente().jTEnderecoServidor.getText(), Integer.parseInt(getFrmCliente().jTPortaServidor.getText()));
                        Cliente cli2 = new Cliente("2", "maria", "2222");
                        cli2.inserir(getFrmCliente().jTEnderecoServidor.getText(), Integer.parseInt(getFrmCliente().jTPortaServidor.getText()));

                    }
                });
    }

    /**
     * Operação que inicia a sequência de interações da manutenção de cliente.
     */
    public void executar() {
        getFrmCliente().setVisible(true);
    }

    /**
     * Realiza a inclusão de clientes
     *
     * @param e Objeto do evento
     */
    public void jBIncluir_actionPerformed(ActionEvent e) {
        Cliente cliente = new Cliente();
        cliente.setClienteId(getFrmCliente().jTClienteId.getText());
        cliente.setNome(getFrmCliente().jTNome.getText());
        cliente.setCpf(getFrmCliente().jTCpf.getText());

        boolean resultado = cliente.inserir(getFrmCliente().jTEnderecoServidor.getText(), Integer.parseInt(getFrmCliente().jTPortaServidor.getText()));
        if (resultado == true) {
            getFrmCliente().mostrarMensagem("Inclusão realizada com sucesso!");
        } else {
            getFrmCliente().mostrarMensagem("Inclusão não realizada!");
        }
    }

    /**
     * Realiza a alteração de cliente
     *
     * @param e Objeto do evento
     */
    public void jBAlterar_actionPerformed(ActionEvent e) {
        if (!getFrmCliente().jTClienteId.getText().equalsIgnoreCase("")) {
            Cliente cliente = new Cliente();
            cliente.setClienteId(getFrmCliente().jTClienteId.getText());
            cliente.setNome(getFrmCliente().jTNome.getText());
            cliente.setCpf(getFrmCliente().jTCpf.getText());
            int resultado = cliente.alterar(getFrmCliente().jTEnderecoServidor.getText(), Integer.parseInt(getFrmCliente().jTPortaServidor.getText()));
            if (resultado != 0) {
                getFrmCliente().mostrarMensagem("Alteração realizada com sucesso!");
            } else {
                getFrmCliente().mostrarMensagem("Alteração não realizada!");
            }
        } else {
            getFrmCliente().mostrarMensagem("Consulte o cliente pelo Id para depois fazer alteração!");
        }
    }

    /**
     * Consulta de cliente pelo id
     *
     * @param e Objeto do evento
     */
    public void jBConsultar_actionPerformed(ActionEvent e) {
        if (!getFrmCliente().jTClienteId.getText().equalsIgnoreCase("")) {
            Cliente cliente = new Cliente();
            cliente.setClienteId(getFrmCliente().jTClienteId.getText());
            boolean resultado = cliente.abrir(getFrmCliente().jTEnderecoServidor.getText(), Integer.parseInt(getFrmCliente().jTPortaServidor.getText()));
            if (resultado == true) {
                getFrmCliente().jTNome.setText(cliente.getNome());
                getFrmCliente().jTCpf.setText(cliente.getCpf());
                getFrmCliente().mostrarMensagem("Cliente encontrado!");
            } else {
                getFrmCliente().mostrarMensagem("Cliente não encontrado!");
            }
        } else {
            getFrmCliente().mostrarMensagem("Preencha o Id do cliente a ser consultado!");
        }
    }

    /**
     * Realiza a exclusão de cliente por id
     *
     * @param e Objeto do evento
     */
    void jBExcluir_actionPerformed(ActionEvent e) {
        if (!getFrmCliente().jTClienteId.getText().equalsIgnoreCase("")) {
            Cliente cliente = new Cliente();
            cliente.setClienteId(getFrmCliente().jTClienteId.getText());
            int resultado = cliente.excluir(getFrmCliente().jTEnderecoServidor.getText(), Integer.parseInt(getFrmCliente().jTPortaServidor.getText()));
            if (resultado != 0) {
                getFrmCliente().mostrarMensagem("Exclusão realizada com sucesso!");
            } else {
                getFrmCliente().mostrarMensagem("Exclusão nao realizada!");
            }
        } else {
            getFrmCliente().mostrarMensagem("Preencha o Id do cliente a ser excluído!");
        }
    }

    /**
     * Executa a controle de listar clientes
     *
     * @param e Objeto do evento
     */
    public void jBListar_actionPerformed(ActionEvent e) {
        CtrClienteListar controle = new CtrClienteListar(getFrmCliente());
        controle.executar();
    }

    /**
     * Limpa as caixas de texto
     *
     * @param e Objeto do evento
     */
    public void jBLimpar_actionPerformed(ActionEvent e) {
        getFrmCliente().jTClienteId.setText("");
        getFrmCliente().jTNome.setText("");
        getFrmCliente().jTCpf.setText("");
    }

    /**
     * Sai do programa
     *
     * @param e Objeto do evento
     */
    public void jBFechar_actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    /**
     * Retorna o formulário utilizado por este controle.
     * @return Retorna um formulário de cliente
     */
    public FrmCliente getFrmCliente() {
        return frmCliente;
    }

    /**
     * Modifica o formulário utilizando por este controle.
     *
     * @param frmCliente Um formulário do tipo FrmCliente.
     */
    public void setFrmCliente(FrmCliente frmCliente) {
        this.frmCliente = frmCliente;
    }
}
