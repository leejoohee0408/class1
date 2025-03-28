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

	

}
