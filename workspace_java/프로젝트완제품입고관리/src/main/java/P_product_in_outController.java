

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/P_product_in_outController")
public class P_product_in_outController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String searchKeyword = request.getParameter("searchKeyword");
		
	    if (searchKeyword != null) {
	        searchKeyword = searchKeyword.trim();
	    }
	    P_product_in_outDAO p_skuDAO = new P_product_in_outDAO();
	    List<P_product_in_outDTO> resultList;
	    try {
	        if (searchKeyword != null && !searchKeyword.isEmpty()) {
	            resultList = p_skuDAO.searchP_skuList(searchKeyword);
	            if (resultList.isEmpty()) {
	                request.setAttribute("message", "�˻� ����� �����ϴ�.");
	            }
	        } else {
	            resultList = p_skuDAO.selectP_skuList();
	        }
	        request.setAttribute("resultList", resultList);
	    } catch (SQLException e) {
	        e.printStackTrace();
	        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "�����ͺ��̽� ����");
	        return;
	    }
	    String url = "p_product_in_out.jsp";
	    request.getRequestDispatcher(url).forward(request, response);
	}
		    
		    
				
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
	        response.setContentType("text/html; charset=utf-8");
	        String action = request.getParameter("action");
	        String action1 = request.getParameter("action1");
	        
	     // ����
	        if ("����".equals(action)) {
	        	// check �Ķ���� ���� checkParam�ٲ���
	            String checkParam = request.getParameter("check");
	            // �����Ҳ� üũ�Ȱ��
	            if (checkParam != null && !checkParam.isEmpty()) {
	            	// üũ�Ѱ� ��ǥ�� �������� �и��Ͽ� �迭 ����
	                String[] skuIds = checkParam.split(",");
	                P_product_in_outDAO p_skuDAO = new P_product_in_outDAO();
	                try {
	                	// �迭�� ����ؼ� üũ�Ȱ� ���� �޼��带 �θ�
	                    p_skuDAO.deleteSkus(skuIds);
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                    response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "���� �� ���� �߻�");
	                    return;
	                }
	            }
	            // ����
	        } else if ("����".equals(action1)) {
	            try {
	            	// �� �Ķ���� ���� ������
	                int Ib_id = Integer.parseInt(request.getParameter("Ib_id"));
	                int productcount = Integer.parseInt(request.getParameter("p_sku"));
	                int productprice = Integer.parseInt(request.getParameter("p_sku1"));
	                String skutype = request.getParameter("p_sku2");
	                String remarks = request.getParameter("p_sku3");
	                
	                

	                P_product_in_outDTO p_skuDTO = new P_product_in_outDTO();
	                // �� �Ķ���� ���� p_skuDTO�� ����
	                p_skuDTO.setIb_id(Ib_id);
	                p_skuDTO.setProduct_count(productcount);
	                p_skuDTO.setProduct_price(productprice);
	                p_skuDTO.setSku_type(skutype);
	                p_skuDTO.setRemarks(remarks);

	                P_product_in_outDAO p_skuDAO = new P_product_in_outDAO();
	                // P_skuDTO�� ����Ͽ� DB ���� �޼��带 �θ�
	                p_skuDAO.updateSku(p_skuDTO);
	            } catch (NumberFormatException e) {
	                e.printStackTrace();
	                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "�߸��� ���� ����");
	                return;
	            } catch (SQLException e) {
	                e.printStackTrace();
	                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "���� �� ���� �߻�");
	                return;
	            }
	           // ���� �Ǵ� ������ �ƴϸ� ��ϵǰ� �ϱ�
	          }else {
	        try {
	            // �� �Ķ���Ͱ� ��������
	        	int productcount = Integer.parseInt(request.getParameter("p_sku"));
	        	int productprice = Integer.parseInt(request.getParameter("p_sku1"));
	            String skutype = request.getParameter("p_sku2");
	            String remarks = request.getParameter("p_sku3");
	            int skuid = Integer.parseInt(request.getParameter("p_sku4")); 
	            int empno = Integer.parseInt(request.getParameter("p_sku5"));

	            // DTO�� �� ����
	            P_product_in_outDTO p_skuDTO = new P_product_in_outDTO();
	            p_skuDTO.setProduct_count(productcount);
	            p_skuDTO.setProduct_price(productprice);
	            p_skuDTO.setSku_type(skutype);
	            p_skuDTO.setRemarks(remarks);
	            p_skuDTO.setSku_id(skuid);
	            p_skuDTO.setEmpno(empno);

	            // DAO�� ���� ��� �޼��� ȣ��
	            P_product_in_outDAO p_skuDAO = new P_product_in_outDAO();
	            p_skuDAO.insertsku(p_skuDTO);
	            System.out.println("������ ��� ����: " + p_skuDTO.getIb_id());
	            
	         // ��� �� doGet() �޼��� ȣ���Ͽ� ���̺� �ٽ� �ε�
	            doGet(request, response);

	        } catch (NumberFormatException e) {
	            e.printStackTrace();
	            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "�߸��� ���� ����");
	            return;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "��� �� ���� �߻�");
	            return;
	         }
	       }     
	        // ��� �Ϸ� �� �����̷�Ʈ
	        response.sendRedirect("P_product_in_outController");
	    }
}