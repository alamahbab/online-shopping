package os.alam.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import os.alam.onlineshoppingbackend.dao.CategoryDAO;
import os.alam.onlineshoppingbackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO  categoryDAO;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("tile","Home");
		mv.addObject("categories", categoryDAO.getCategories());
		mv.addObject("userClickedHome",true);
		return mv;
	}
	
	@RequestMapping(value = {"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("tile","About us");
		mv.addObject("userClickedAbout",true);
		return mv;
	}
	
	@RequestMapping(value = {"/contactus"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("tile","Contact us");
		mv.addObject("userClickedContact",true);
		return mv;
	}
	
	@RequestMapping(value = {"/showallproducts"})
	public ModelAndView showAllProduts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("tile","All Products");
		mv.addObject("categories", categoryDAO.getCategories());
		mv.addObject("userClickedAllproducts",true);
		return mv;
	}
	
	@RequestMapping(value = {"/show/category/{id}/products"})
	public ModelAndView showCategoryProduts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		Category category = categoryDAO.getCategory(id);
		mv.addObject("tile",category.getName());
		mv.addObject("categories", categoryDAO.getCategories());
		mv.addObject("category",category);
		mv.addObject("userClickedCategoryProducts",true);
		return mv;
	}
}
