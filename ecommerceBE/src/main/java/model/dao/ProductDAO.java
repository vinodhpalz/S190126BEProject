package model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.HibernateUtil;
import model.entity.Product;

public class ProductDAO {
	private Session sess;
	private Transaction trans;
	public ProductDAO() {
		sess = HibernateUtil.getSessionFactory().openSession();
	}
	public boolean insertProduct(Product c) {
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
	public boolean updateProduct(Product c) {
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
	public boolean deleteProduct(Product c) {
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
