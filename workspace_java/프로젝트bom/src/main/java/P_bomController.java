

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/P_bomController")
public class P_bomController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchKeyword = request.getParameter("searchKeyword");

		if (searchKeyword != null) {
			searchKeyword = searchKeyword.trim();
		}
		P_bomDAO p_skuDAO = new P_bomDAO();
		List<P_bomDTO> resultList;
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
		String url = "p_bom.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
				P_bomDAO p_skuDAO = new P_bomDAO();
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
				int bom_id = Integer.parseInt(request.getParameter("bom_id"));
				String sku_id_material = request.getParameter("sku_id_material");
				int consumption = Integer.parseInt(request.getParameter("p_sku1"));
//				
				
				

				P_bomDTO p_skuDTO = new P_bomDTO();
				// �� �Ķ���� ���� p_skuDTO�� ����
				p_skuDTO.setBom_id(bom_id);
				p_skuDTO.setSku_id_material(sku_id_material);
				p_skuDTO.setConsumption(consumption);
//				
				
				P_bomDAO p_skuDAO = new P_bomDAO();
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
		} else {
			try {
				// �� �Ķ���Ͱ� ��������
				String skuidmaterial = request.getParameter("p_sku");
				int consumption = Integer.parseInt(request.getParameter("p_sku1"));
				int skuid = Integer.parseInt(request.getParameter("p_sku2"));
				int work_method = Integer.parseInt(request.getParameter("p_sku3"));
				
				
	            
				// DTO�� �� ����
				P_bomDTO p_skuDTO = new P_bomDTO();
				p_skuDTO.setSku_id_material(skuidmaterial);
				p_skuDTO.setConsumption(consumption);
				p_skuDTO.setSku_id(skuid);
				p_skuDTO.setSku_id(work_method);
				

				// DAO�� ���� ��� �޼��� ȣ��
				P_bomDAO p_skuDAO = new P_bomDAO();
				p_skuDAO.insertsku(p_skuDTO);
				System.out.println("������ ��� ����: " + p_skuDTO.getBom_id());

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
		response.sendRedirect("P_bomController");
	}
}