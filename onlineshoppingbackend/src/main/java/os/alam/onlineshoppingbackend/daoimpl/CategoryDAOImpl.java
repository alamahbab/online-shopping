package os.alam.onlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.RespectBinding;

import org.springframework.stereotype.Repository;

import os.alam.onlineshoppingbackend.dao.CategoryDAO;
import os.alam.onlineshoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> list;

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

		list.add(c1);
		list.add(c2);
		list.add(c3);
	}

	@Override
	public List<Category> getCategories() {
		return list;
	}

}
