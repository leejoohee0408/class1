package ������Ʈ�������԰����;

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
		 
		
		 
		    try {
		    	P_material_in_outDAO p_skuDAO = new P_material_in_outDAO();
		    	List<P_material_in_outDTO> resultList;
		        
		            // �˻�� ���� ��� ��ü ��� ��ȸ
		            resultList = p_skuDAO.selectP_skuList();
		       
		        // ��ȸ ��� ����
		        request.setAttribute("resultList", resultList);
		    } catch (SQLException e) {
		        e.printStackTrace();
		        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "�����ͺ��̽� ����");
		        return;
		    }
		    
		    
		    String url = "p_material_in_out.jsp";
		    request.getRequestDispatcher(url).forward(request, response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
	        response.setContentType("text/html; charset=utf-8");
	        
	        try {
	            // �� �Ķ���Ͱ� ��������
	        	int materialcount = Integer.parseInt(request.getParameter("p_sku"));
	        	int materialprice = Integer.parseInt(request.getParameter("p_sku1"));
	            String skutype = request.getParameter("p_sku2");
	            String remarks = request.getParameter("p_sku3");
	            int skuid = Integer.parseInt(request.getParameter("p_sku4")); 
	            int billid = Integer.parseInt(request.getParameter("p_sku5"));

	            // DTO�� �� ����
	            P_material_in_outDTO p_skuDTO = new P_material_in_outDTO();
	            p_skuDTO.setMaterial_count(materialcount);
	            p_skuDTO.setMaterial_price(materialprice);
	            p_skuDTO.setSku_type(skutype);
	            p_skuDTO.setRemarks(remarks);
	            p_skuDTO.setSku_id(skuid);
	            p_skuDTO.setBill_id(billid);

	            // DAO�� ���� ��� �޼��� ȣ��
	            P_material_in_outDAO p_skuDAO = new P_material_in_outDAO();
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

	        // ��� �Ϸ� �� �����̷�Ʈ
	        response.sendRedirect("P_material_in_outController");
	    }
}