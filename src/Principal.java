
import controle.CtrCliente;

/**
 * Classe que possui a operação main da aplicação. 
 * 
 * Serve para dar ínicio ao sistema.
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
