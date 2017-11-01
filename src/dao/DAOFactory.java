package dao;

import dao.cliente.ClienteDAO;

/**
 * Abstrai as fontes de dados do sistema.
 */
public abstract class DAOFactory {

    //Tipos de Fonte de Dados suportados pela Factory
    public static final int HASHMAP = 1;

    //Retorna o DAO instanciado
    public abstract ClienteDAO getClienteDAO();

    //Retorna a Factory do tipo especificado	
    public static DAOFactory getDAOFactory() {
        int whichFactory = Factory.FABRICA;
        switch (whichFactory) {
            case HASHMAP:
                HashMapDAOFactory factory = new HashMapDAOFactory();
                return factory;
            default:
                return null;
        }
    }
}
