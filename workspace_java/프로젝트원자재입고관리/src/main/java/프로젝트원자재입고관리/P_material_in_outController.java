package 프로젝트원자재입고관리;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;









@WebServlet("/P_material_in_outController")
public class P_material_in_outController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		 
		 P_material_in_outDAO p_skuDAO = new P_material_in_outDAO();
		    List<P_material_in_outDTO> resultList;
		    try {
		        
		            // 검색어가 없을 경우 전체 목록 조회
		            resultList = p_skuDAO.selectP_skuList();
		       
		        // 조회 결과 저장
		        request.setAttribute("resultList", resultList);
		    } catch (SQLException e) {
		        e.printStackTrace();
		        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "데이터베이스 오류");
		        return;
		    }
		    
		    
		    String url = "p_material_in_out.jsp";
		    request.getRequestDispatcher(url).forward(request, response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
	        response.setContentType("text/html; charset=utf-8");
	        
	        try {
	            // 각 파라미터값 가져오기
	        	int materialcount = Integer.parseInt(request.getParameter("p_sku"));
	        	int materialprice = Integer.parseInt(request.getParameter("p_sku1"));
	            String skutype = request.getParameter("p_sku2");
	            String remarks = request.getParameter("p_sku3");
	            int skuid = Integer.parseInt(request.getParameter("p_sku4")); 
	            int billid = Integer.parseInt(request.getParameter("p_sku5"));

	            // DTO에 값 설정
	            P_material_in_outDTO p_skuDTO = new P_material_in_outDTO();
	            p_skuDTO.setMaterial_count(materialcount);
	            p_skuDTO.setMaterial_price(materialprice);
	            p_skuDTO.setSku_type(skutype);
	            p_skuDTO.setRemarks(remarks);
	            p_skuDTO.setSku_id(skuid);
	            p_skuDTO.setBill_id(billid);

	            // DAO를 통해 등록 메서드 호출
	            P_material_in_outDAO p_skuDAO = new P_material_in_outDAO();
	            p_skuDAO.insertsku(p_skuDTO);
	            System.out.println("데이터 등록 성공: " + p_skuDTO.getIb_id());

	        } catch (NumberFormatException e) {
	            e.printStackTrace();
	            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "잘못된 가격 형식");
	            return;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "등록 중 오류 발생");
	            return;
	        }

	        // 등록 완료 후 리다이렉트
	        response.sendRedirect("P_material_in_outController");
	    }
}