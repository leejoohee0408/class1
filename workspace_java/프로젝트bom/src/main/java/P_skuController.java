

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/p_sku")
public class P_skuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//DAO을 가져와서
		P_skuDAO p_skuDAO = new P_skuDAO();
		
		
		//그 DAO안에 있는 화면보여주는 리스트를 담았다
		List<P_skuDTO> resultList = p_skuDAO.selectP_skuList();
		// setAttribute은 넣는것 이다
		request.setAttribute("resultList", resultList);
		
		
		String url = "p_sku.jsp";
		//forward로 보낸다
		request.getRequestDispatcher(url).forward(request, response);
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("do Post 실행");
		
		// 한글깨짐 방지용
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		// 삭제버튼의 이름을 가져옴
		String action = request.getParameter("action");
		
				
		// 만약 action가 삭제인경우
		if("삭제".equals(action)) {
			//check안에 있는 sku_id목록을 담고있다
			// 이걸checkParam로 담았다
			String checkParam = request.getParameter("check");
			// 만약 checkParam 안에 sku_id목록이 null이 아니거나
			// isEmpty가 0인데 0이 아니면
			// 쉼표로 구분된 문자열을 배열로 변환
			// DAO를 통해 DB에서 해당 sku_id목록 삭제
			if (checkParam != null && !checkParam.isEmpty()) {
		         String[] check1 = checkParam.split(",");
		         P_skuDAO p_skuDAO = new P_skuDAO();
		         p_skuDAO.deleteSkus(check1);
		       }
		 
		}else {
				
				// insert 장소
				
				//p_sku.jsp에서 form영역의 것을 가져옴
				//상품코드를 가져옴
				String p_sku = request.getParameter("p_sku");
				System.out.println("p_sku : "+p_sku);
				//상품명를 가져옴
				String p_sku1 = request.getParameter("p_sku1");
				System.out.println("p_sku1 : "+p_sku1);
				//규격를 가져옴
				String p_sku2 = request.getParameter("p_sku2");
				System.out.println("p_sku2 : "+p_sku2);
				//업체명를 가져옴
				String p_sku3 = request.getParameter("p_sku3");
				System.out.println("p_sku3 : "+p_sku3);
				//단가를 가져옴
				//문자인 p_sku4를 받아서 
				//그 받은것을 Integer.parseInt에 넣어서 숫자로 바꿈
				String p_sku4 = request.getParameter("p_sku4");
				int p_sku4_1 = Integer.parseInt(p_sku4);
				System.out.println("p_sku4 : "+p_sku4_1);
				//제품분류를 가져옴
				String p_sku5 = request.getParameter("p_sku5");
				System.out.println("p_sku5 : "+p_sku5);
				
				
				P_skuDTO p_skuDTO = new P_skuDTO();
				//상품코드를 받음
				p_skuDTO.setSku_code(p_sku);
				//상품명코드를 받음
				p_skuDTO.setSku_name(p_sku1);
				//규격를 받음
				p_skuDTO.setSku_size(p_sku2);
				//업체명를 받음
				p_skuDTO.setVendor_name(p_sku3);
				//단가를 받음
				p_skuDTO.setPrice(p_sku4_1);
				//제품분류를 받음
				p_skuDTO.setSku_category(p_sku5);
				
				
				P_skuDAO p_skuDAO = new P_skuDAO();
				//숫자도 가능
				int result = p_skuDAO.insertsku(p_skuDTO);
				System.out.println("result : " + result);
				
				}
			
			
		
			
		
		
		
		
		
		
		//sendRedirect는 문자일때
		//sendError는 숫자일때
		response.sendRedirect("p_sku");
		
		
	}

}
