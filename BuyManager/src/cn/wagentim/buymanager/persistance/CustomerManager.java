package cn.wagentim.buymanager.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public enum CustomerManager implements ICustomerStatement
{
	instance;
	private static final String PERSISTENCE_UNIT_NAME = "BuyManager";
    private static final EntityManager em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
    
    public void addCustomer(CustomerEntity customer)
    {
    	if( null == customer )
    	{
    		return;
    	}
    	
    	em.getTransaction().begin();
    	em.persist(customer);
    	em.getTransaction().commit();
    	em.close();
    }
    
    public List<CustomerEntity> getCustomers()
    {
    	return em.createQuery(GET_ALL_CUSTOMERS, CustomerEntity.class).getResultList();
    }
}
