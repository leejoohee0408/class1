package kr.or.human.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.or.human.dto.EmpDTO;


@Controller
public class EmpController {

	

	@RequestMapping(value = "/emp")
	public ModelAndView listEmp() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("emp");

		return mav;
		

	}

	@RequestMapping("/addwebtoon.do")
	public ModelAndView practiceForm() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("addwebtoon");

		return mav;
	}
	
	 //추가누르면 이동
	@RequestMapping(value = "/addwebtoon.do", method = RequestMethod.GET)
    public ModelAndView submitForm() {
        return new ModelAndView("addwebtoon");
    }
	
	private List<EmpDTO> webtoonList = new ArrayList<EmpDTO>();
	 @RequestMapping(value = "/addwebtoon.do", method = RequestMethod.POST)
	    public String addwebtoon(EmpDTO dto, Model model, HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        request.setCharacterEncoding("utf-8");
	        response.setContentType("text/html; charset=utf-8");

	        webtoonList.add(dto); // 리스트에 웹툰 정보 추가
	        model.addAttribute("webtoonList", webtoonList); // 리스트를 모델에 추가
	        return "emp"; // 다 쓴 걸 처음 페이지로 보냄
	    }
	

}
