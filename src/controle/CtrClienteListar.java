package controle;

import java.awt.event.ActionEvent;
import formulario.FrmClienteListar;
import entidade.Cliente;

/**
 * Classe que realiza a interação entre a interface e a entidade do sistema.
 */
public class CtrClienteListar {

	private FrmClienteListar frmClienteListar;

	/**
	 * Construtor sem argumentos.
	 */
	public CtrClienteListar() {
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
		getFrmClienteListar().popularTabela(cliente.getLista());
		getFrmClienteListar().setVisible(true);
	}

	
	public void jBFechar_actionPerformed(ActionEvent e) {	
		getFrmClienteListar().setVisible(false);
	}

	/**
	 * Retorna o formulário utilizado por este controle.
	 */
	public FrmClienteListar getFrmClienteListar(){
		return frmClienteListar;
	}

	/**
	 * Modifica o formulário utilizando por este controle.
	 * 
	 * @param frmClienteListar    Um formulario do tipo FrmClienteListar.
	 */	 
	public void setFrmClienteListar(FrmClienteListar frmClienteListar){
		this.frmClienteListar = frmClienteListar;
	}
}
