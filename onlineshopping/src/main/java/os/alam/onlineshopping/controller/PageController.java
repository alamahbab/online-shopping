package os.alam.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("tile","Home");
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
	
	@RequestMapping(value = {"/listproducts"})
	public ModelAndView listproduct() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("tile","List products");
		mv.addObject("userClickedListproducts",true);
		return mv;
	}
}
