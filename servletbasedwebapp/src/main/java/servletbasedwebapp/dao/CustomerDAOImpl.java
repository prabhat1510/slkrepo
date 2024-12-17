package servletbasedwebapp.dao;

import java.util.List;

import org.hibernate.Session;

import servletbasedwebapp.entities.Customer;
import servletbasedwebapp.utility.HibernateUtility;

public class CustomerDAOImpl implements CustomerDAO {

	Session session = HibernateUtility.getSessionFactory().openSession();
	@Override
	public Customer addCustomer(Customer customer) {
		session.beginTransaction();
		session.persist(customer);
		session.getTransaction().commit();
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return session.createQuery("select c from Customer c",Customer.class).getResultList();
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		session.beginTransaction();
		Customer customer = session.get(Customer.class, customerId);
		session.getTransaction().commit();
		return customer;
	}
}
