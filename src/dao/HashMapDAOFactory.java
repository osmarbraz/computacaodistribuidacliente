package dao;

import dao.cliente.ClienteDAO;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;

/**
 * Implementa a fonte de dado para persistência em memória utilizando HashMap.
 */
public class HashMapDAOFactory extends DAOFactory {

    public HashMapDAOFactory() {
        super();
    }

    /**
     * Retorna uma Cliente DAO
     *
     * @return ClienteDAO Um DAORemoto para cliente
     */
    public ClienteDAO getClienteDAO() {
        try {
            //Referência para rmiregistry na porta 1099
            Registry registro = LocateRegistry.getRegistry("localhost");
            //Localiza a referência do objeto remoto 
            Object obj = registro.lookup("clienteDAO");
            ClienteDAO clienteDao = (ClienteDAO) obj;
            System.out.println("clienteDao: " + clienteDao);
            return clienteDao;
        } catch (NotBoundException e) {
            System.out.println("Erro no lookup: " + e);
            return null;
        } catch (RemoteException e) {
            System.out.println("Erro no servidor: " + e);
            return null;
        }
    }
}
