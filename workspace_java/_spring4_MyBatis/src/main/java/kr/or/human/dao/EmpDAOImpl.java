package kr.or.human.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.human.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	SqlSession sqlSession;

	@Override
	public List<EmpDTO> selectEmpList() {
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("result : " + result);
		return result;
	}
	
	@Override
	public EmpDTO selectOneEmp() {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectOneEmp");
		System.out.println("dto : " + dto);
		return dto;
	}
	
	@Override
	public EmpDTO selectOneEmpno(int empno) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno", empno);
		System.out.println("dto : " + dto);
		return dto;
	}
	
	@Override
	public EmpDTO selectEmpno3(int empno) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno3", empno);
		System.out.println("dto : " + dto);
		return dto;
	}
	
	@Override
	public EmpDTO selectEmpno4(EmpDTO empDTO) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno3", empDTO);
		System.out.println("dto : " + dto);
		return dto;
	}
	
	

}
