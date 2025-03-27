package kr.or.human0408;

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

@Controller
public class PracticeController {

    private List<PracticeDTO> webtoonList = new ArrayList<PracticeDTO>(); // 웹툰 정보를 저장할 리스트

    @RequestMapping(value = "/practice.do", method = RequestMethod.POST)
    public String practice(String action, Model model) {
        if ("추가".equals(action)) {
            return "addwebtoon"; // 입력하는 곳으로 가기
        } else if ("조회".equals(action)) {
            model.addAttribute("webtoonList", webtoonList); // 리스트를 모델에 추가
            return "practice"; // 조회 결과를 보여주는 페이지로 이동
        }
        return "addwebtoon"; 
    }

    @RequestMapping(value = "/addwebtoon.do", method = RequestMethod.POST)
    public String addwebtoon(PracticeDTO dto, Model model, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");

        webtoonList.add(dto); // 리스트에 웹툰 정보 추가
        model.addAttribute("webtoonList", webtoonList); // 리스트를 모델에 추가
        return "practice"; // 다 쓴 걸 처음 페이지로 보냄
    }
}