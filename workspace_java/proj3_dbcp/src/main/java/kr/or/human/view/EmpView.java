package kr.or.human.view;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import kr.or.human.dto.EmpDTO;

public class EmpView {

	public	void viewEmp(List<EmpDTO> list, HttpServletResponse response) throws  IOException{
		
		
		
		response.getWriter().println("<table border='1'>");
		// View
		for(int i=0; i<list.size(); i++) {
		response.getWriter().println("<tr>");
		response.getWriter().println("<td>"+list.get(i).getEmpno()+"</td>");
		response.getWriter().println("<td>"+list.get(i).getEname()+"</td>");
		response.getWriter().println("<td>"+list.get(i).getJob()+"</td>");
		response.getWriter().println("<td>"+list.get(i).getMgr()+"</td>");
		response.getWriter().println("<td>"+list.get(i).getHiredate()+"</td>");
		response.getWriter().println("<td>"+list.get(i).getSal()+"</td>");
		response.getWriter().print("<td>"+list.get(i).getDeptno()+"</td>");
		response.getWriter().println("</tr>");
		}
		response.getWriter().println("</table>");
	}
	
}
