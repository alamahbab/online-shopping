package os.alam.onlineshoppingbackend.dao;

import java.util.List;

import os.alam.onlineshoppingbackend.dto.Category;

public interface CategoryDAO {

	public List<Category> getCategories();
	
	public boolean addCategory(Category category);
	
	public Category getCategory(int id);
}
