package os.alam.onlineshoppingbackend.test;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import os.alam.onlineshoppingbackend.dao.CategoryDAO;
import os.alam.onlineshoppingbackend.dto.Category;
import os.alam.onlineshoppingbackend.hibernateutils.HibernateHelper;

public class CategoryTest {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	

	
	@Test
	public void testAddCategory() {
		Category c1 = new Category();
		c1.setName("Laptops");
		c1.setDescription("Various laptops, windows and macs");
		c1.setId(1);
		try {
			System.out.println("CategoryTest.testAddCategory()aaaa");
		Session ses= HibernateHelper.getSession();
		System.out.println("CategoryTest.testAddCategory()000");
		Transaction tx = ses.beginTransaction();
		
		ses.save(c1);
		ses.flush();
		tx.commit();
		System.out.println("CategoryTest.testAddCategory()");
		}catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
//		assertEquals("Category added successfully", true,categoryDAO.addCategory(c1));
//		assertEquals("Successfully added ", true, categoryDAO.addCategory(c1));
	}
	
	

}
