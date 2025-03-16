package snippet;


import java.io.IOException;
import java.sql.SQLException;
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
		
		 String searchKeyword = request.getParameter("searchKeyword");
		    P_skuDAO p_skuDAO = new P_skuDAO();
		    List<P_skuDTO> resultList;
		    try {
		        if (searchKeyword != null && !searchKeyword.isEmpty()) {
		            // �˻�� ���� ��� �˻� �޼��� ȣ��
		            resultList = p_skuDAO.searchP_skuList(searchKeyword);
		        } else {
		            // �˻�� ���� ��� ��ü ��� ��ȸ
		            resultList = p_skuDAO.selectP_skuList();
		        }
		        request.setAttribute("resultList", resultList);
		    } catch (SQLException e) {
		        e.printStackTrace();
		        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "�����ͺ��̽� ����");
		        return;
		    }
		    String url = "p_sku.jsp";
		    request.getRequestDispatcher(url).forward(request, response);
		}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
	        response.setContentType("text/html; charset=utf-8");
	        String action = request.getParameter("action");
	        String action1 = request.getParameter("action1");

	        if ("����".equals(action)) {
	            String checkParam = request.getParameter("check");
	            if (checkParam != null && !checkParam.isEmpty()) {
	                String[] skuIds = checkParam.split(",");
	                P_skuDAO p_skuDAO = new P_skuDAO();
	                try {
	                    p_skuDAO.deleteSkus(skuIds);
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                    response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "���� �� ���� �߻�");
	                    return;
	                }
	            }
	        } else if ("����".equals(action1)) {
	            try {
	                int skuId = Integer.parseInt(request.getParameter("skuId"));
	                String skuCode = request.getParameter("p_sku");
	                String skuName = request.getParameter("p_sku1");
	                String skuSize = request.getParameter("p_sku2");
	                String vendorName = request.getParameter("p_sku3");
	                int price = Integer.parseInt(request.getParameter("p_sku4"));
	                String skuCategory = request.getParameter("p_sku5");

	                P_skuDTO p_skuDTO = new P_skuDTO();
	                p_skuDTO.setSku_id(skuId);
	                p_skuDTO.setSku_code(skuCode);
	                p_skuDTO.setSku_name(skuName);
	                p_skuDTO.setSku_size(skuSize);
	                p_skuDTO.setVendor_name(vendorName);
	                p_skuDTO.setPrice(price);
	                p_skuDTO.setSku_category(skuCategory);

	                P_skuDAO p_skuDAO = new P_skuDAO();
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
	            
	        } else {
	            String skuCode = request.getParameter("p_sku");
	            String skuName = request.getParameter("p_sku1");
	            String skuSize = request.getParameter("p_sku2");
	            String vendorName = request.getParameter("p_sku3");
	            try {
	                int price = Integer.parseInt(request.getParameter("p_sku4"));
	                String skuCategory = request.getParameter("p_sku5");

	                P_skuDTO p_skuDTO = new P_skuDTO();
	                p_skuDTO.setSku_code(skuCode);
	                p_skuDTO.setSku_name(skuName);
	                p_skuDTO.setSku_size(skuSize);
	                p_skuDTO.setVendor_name(vendorName);
	                p_skuDTO.setPrice(price);
	                p_skuDTO.setSku_category(skuCategory);

	                P_skuDAO p_skuDAO = new P_skuDAO();
	                p_skuDAO.insertsku(p_skuDTO);
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
	        response.sendRedirect("p_sku");
	    }
	}