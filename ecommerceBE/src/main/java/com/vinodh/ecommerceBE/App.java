package com.vinodh.ecommerceBE;

import model.dao.CustomerDAO;
import model.entity.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try
    	{
    		System.out.println( "Hello World!" );
        
    		Customer c = new Customer();
    		c.setCustId(2);
			//c.setCustAge(20);
			//c.setCustName("Barath");
    		CustomerDAO cd = new CustomerDAO();
    		boolean b = cd.deleteCustomer(c);
    		if(b)
    		{
    			System.out.println("Deleted Successfully");
    		}
    	}
    	catch(Exception exp)
    	{
    		exp.printStackTrace();
    	}
    }
}
