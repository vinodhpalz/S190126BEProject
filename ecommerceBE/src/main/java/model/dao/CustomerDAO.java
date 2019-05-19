package model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.HibernateUtil;
import model.entity.Customer;

public class CustomerDAO {
	private Session sess;
	private Transaction trans;
	public CustomerDAO() {
		sess = HibernateUtil.getSessionFactory().openSession();
	}
	public boolean insertCustomer(Customer c) {
		boolean b = true;
		try
		{
			trans = sess.beginTransaction();
			sess.save(c);
			trans.commit();
		}catch(Exception ex)
		{
			trans.rollback();
			b = false;
			ex.printStackTrace();
		}
		return b;
	}
	public boolean updateCustomer(Customer c) {
		boolean b = true;
		try
		{
			trans = sess.beginTransaction();
			sess.update(c);
			trans.commit();
		}catch(Exception ex)
		{
			trans.rollback();
			b = false;
			ex.printStackTrace();
		}
		return b;
	}
	public boolean deleteCustomer(Customer c) {
		boolean b = true;
		try
		{
			trans = sess.beginTransaction();
			sess.delete(c);
			trans.commit();
		}catch(Exception ex)
		{
			trans.rollback();
			b = false;
			ex.printStackTrace();
		}
		return b;
	}
	
}
