package com.vinodh.ecommerceBE;

import model.dao.ProductDAO;
import model.entity.Product;

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
        
    		Product c = new Product();
    		c.setpName("Laptop");
    		c.setpCost(50000);
    		ProductDAO cd = new ProductDAO();
    		boolean b = cd.insertProduct(c);
    		if(b)
    		{
    			System.out.println("Inserted Successfully");
    		}
    	}
    	catch(Exception exp)
    	{
    		exp.printStackTrace();
    	}
    }
}
