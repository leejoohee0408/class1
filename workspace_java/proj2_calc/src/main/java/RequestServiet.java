

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/req")
public class RequestServiet extends HttpServlet {
	
       
    
    public RequestServiet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("req 생성자 실행");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doGet실행");
		
		// 요청 내용의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		// 응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");
		
		// getParameter
		// 전달받은 파라메터의 key를 적어서 해당 값을 얻어오기
		String num1 = request.getParameter("num1");
		System.out.println("num1 : " + num1);
		
		// 없으면 null
		String num2 = request.getParameter("num2");
		System.out.println("num2 : " + num2);
		
	// getParameterValues
	// 같은 name으로 여러개 온 경우
	// String 배열로 모두 받을 수 있음
	// 마찬가지로 없으며 null
	String[] nums =	request.getParameterValues("num1");
	if(nums != null) {
		// 선생님이 만드신거
//		for(String num : nums) {
//			System.out.println(num);
//		}
		// 내가 만든거
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	System.out.println("---------------");
	System.out.println("pw : " + request.getParameter("pw"));
	System.out.println("btn : " + request.getParameter("btn"));
	System.out.println("hidden1 : " + request.getParameter("hidden1"));
	System.out.println("radio1 : " + request.getParameter("radio1"));
	String[] checkbox1 =	request.getParameterValues("checkbox1");
	if(checkbox1 != null) {
		for(String num : checkbox1) {
			System.out.println(num);
		}
	}
	
	System.out.println("date1 : " + request.getParameter("date1"));
	System.out.println("number1 : " + request.getParameter("number1"));
	System.out.println("div1 : " + request.getParameter("div1"));
	System.out.println("span1 : " + request.getParameter("span1"));
	System.out.println("text1 : " + request.getParameter("text1"));
	System.out.println("select1 : " + request.getParameter("select1"));
	System.out.println("textarea1 : " + request.getParameter("textarea1"));
	
		PrintWriter out = response.getWriter();
		out.println("<strong>num1</strong>의 값은 : " + num1);
		
		String textarea = request.getParameter("textarea1");
//		textarea = textarea.replace("\n", "<br>");
		out.println(textarea);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 실행");
		// 요청 내용의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
				
		// 응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");
		
		String num1 = request.getParameter("num1");
		System.out.println("num1 : " + num1);
		
		String num2 = request.getParameter("num2");
		System.out.println("num2 : " + num2);
		
		response.getWriter().println("{\"a\":100}");
		
		
	}

}
