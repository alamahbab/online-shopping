package os.alam.onlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.RespectBinding;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import os.alam.onlineshoppingbackend.dao.CategoryDAO;
import os.alam.onlineshoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> list;
	
	@Autowired
	private SessionFactory factory;
	
	static {
		list = new ArrayList<>();

		Category c1 = new Category();
		c1.setName("Laptops");
		c1.setDescription("Various laptops, windows and macs");
		c1.setId(1);

		Category c2 = new Category();
		c2.setName("Mobiles");
		c2.setDescription("Mobiles of all brands");
		c2.setId(2);

		Category c3 = new Category();
		c3.setName("TVs");
		c3.setDescription("LCD, LED TVs and 4K TVs ");
		c3.setId(3);
		
		Category c4 = new Category();
		c4.setName("Home Appliances");
		c4.setDescription("All home appliances");
		c4.setId(4);

		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
	}

	@Override
	public List<Category> getCategories() {
		return list;
	}

	@Override
	public Category getCategory(int id) {
		for (Category category : list) {
			if (category.getId() == id) {
				return category;
			}
		}
		return null;
	}

	@Override
	@Transactional
	public boolean addCategory(Category category) {
		boolean returnValue = true;
		try {
		factory.getCurrentSession().persist(category);
		}catch(Exception e) {
			returnValue = false;
			e.printStackTrace();
		}
		return returnValue;
	}
	
	

}
