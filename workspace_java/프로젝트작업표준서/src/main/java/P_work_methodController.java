
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/P_work_methodController")
public class P_work_methodController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String searchKeyword = request.getParameter("searchKeyword");

		if (searchKeyword != null) {
			searchKeyword = searchKeyword.trim();
		}
		P_work_methodDAO p_skuDAO = new P_work_methodDAO();
		List<P_work_methodDTO> resultList;
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
		String url = "p_work_method.jsp";
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
				P_work_methodDAO p_skuDAO = new P_work_methodDAO();
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
				String work_method = request.getParameter("work_method");
				String work = request.getParameter("p_sku");
				int consumption = Integer.parseInt(request.getParameter("p_sku1"));
//				int skuid = Integer.parseInt(request.getParameter("p_sku2"));
				
				

				P_work_methodDTO p_skuDTO = new P_work_methodDTO();
				// �� �Ķ���� ���� p_skuDTO�� ����
				p_skuDTO.setWork_method(work_method);
				p_skuDTO.setWork(work);
				p_skuDTO.setConsumption(consumption);
//				p_skuDTO.setSku_id(skuid);
				
				P_work_methodDAO p_skuDAO = new P_work_methodDAO();
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
				String work = request.getParameter("p_sku");
				int consumption = Integer.parseInt(request.getParameter("p_sku1"));
				int skuid = Integer.parseInt(request.getParameter("p_sku2"));
				
				
	            
				// DTO�� �� ����
				P_work_methodDTO p_skuDTO = new P_work_methodDTO();
				p_skuDTO.setWork(work);
				p_skuDTO.setConsumption(consumption);
				p_skuDTO.setSku_id(skuid);
				

				// DAO�� ���� ��� �޼��� ȣ��
				P_work_methodDAO p_skuDAO = new P_work_methodDAO();
				p_skuDAO.insertsku(p_skuDTO);
				System.out.println("������ ��� ����: " + p_skuDTO.getWork_method());

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
		response.sendRedirect("P_work_methodController");
	}
}