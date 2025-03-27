package kr.or.human0408;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PracticeDAO {

	@RequestMapping("/addwebtoon.do")
	public ModelAndView practiceForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("addwebtoon");
		
		return mav;
	}
	
}
