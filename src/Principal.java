import controle.CtrCliente;

/**
 * Classe que possui a operação main da aplicação. Server para dar inicio ao
 * sistema.
 */
public class Principal { 

    /**
     * Inicia a aplicação.
     *
     * @param args
     */
	public static void main(String[] args) {

		CtrCliente controle = new CtrCliente();
		controle.executar();

	}    
}