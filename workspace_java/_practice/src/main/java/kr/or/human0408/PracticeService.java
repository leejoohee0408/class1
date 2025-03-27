package kr.or.human0408;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PracticeService {

	@RequestMapping("/practice.do")
	public ModelAndView practiceForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("practice");
		
		return mav;
	}
	
	
	
}
