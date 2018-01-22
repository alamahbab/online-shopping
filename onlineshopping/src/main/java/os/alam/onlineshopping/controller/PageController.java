package os.alam.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "home", "index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings", "Welcome to MVC");
		return mv;
	}
	
	@RequestMapping("/test/{greetings}")
	public ModelAndView test(@PathVariable("greetings") String param) {
		if(param == null) {
			param = "Ahbab Alam";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings",param);
		return mv;
	}
	
}
