import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class P_skuDAO {
	
	 // JNDI 방식으로 연결하는 메서드
    public Connection getConnection() {
        Connection con = null;
        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            con = ds.getConnection();
            // DB 접속 끝
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
	
	int insertsku(P_skuDTO p_skuDTO) {
		 System.out.println("p_skuDTO insertsku 실행");
		 int result = -1;

			try {
				// [DB 접속] 시작
				Context ctx = new InitialContext();
				DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
				Connection con = ds.getConnection();
				// DB 접속 끝

				// [SQL 준비]
				// 방법 1 : sql string을 그냥 만들기
//				String query = "insert into todo values(seq_todo.nextval, '"+todoDTO.getTodo()+"',sysdate, null, 'N')";
				// 방법 2 : ? 활용하기
				String query = " insert into p_sku";
					   query += " values(seq_p_sku.nextval, ?,?,?,?,?,sysdate,null,?)";
				PreparedStatement ps = con.prepareStatement(query);
				// 1이라고 한것은 첫번째 물음표에 값을 넣어달라
				ps.setString(1, p_skuDTO.getSku_code());
				ps.setString(2, p_skuDTO.getSku_name());
				ps.setString(3, p_skuDTO.getSku_size());
				ps.setString(4, p_skuDTO.getVendor_name());
				ps.setInt(5, p_skuDTO.getPrice());
				ps.setString(6, p_skuDTO.getSku_category());

				// [SQL 실행] 및 [결과 확보]
				// int executeUpdate() : select 외 모든 것
				result = ps.executeUpdate();
				

				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return result;
	
	


	}
	
	// 여기서 부터 하는거는 데이터베이스에 있는 테이블을
	// 입력하는거 아래에 보여주게 하기위한 것이다.
	List selectP_skuList(){
		System.out.println("selectP_skuList 실행");
		List list = new ArrayList();
		
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();
			// DB 접속 끝

			// [SQL 준비]
			String query = " select * from p_sku";
				  
			PreparedStatement ps = con.prepareStatement(query);
			
			

			// [SQL 실행] 및 [결과 확보]
			// int executeUpdate() : select 외 모든 것
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				P_skuDTO dto = new P_skuDTO();
				dto.setSku_id(rs.getInt("sku_id"));
				dto.setSku_code(rs.getString("sku_code"));
				dto.setSku_name(rs.getString("sku_name"));
				dto.setSku_size(rs.getString("sku_size"));
				dto.setVendor_name(rs.getString("vendor_name"));
				dto.setPrice(rs.getInt("price"));
				dto.setCreate_date(rs.getDate("create_date"));
				dto.setModify_date(rs.getDate("modify_date"));
				dto.setSku_category(rs.getString("sku_category"));
				
				list.add(dto);
			}
			

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	// 삭제구역
	// 삭제할 sku_id목록을 배열로 받아 DB에서 삭제 작업수행
	 public int deleteSkus(String[] skuIds) {
	        int result = 0;
	        try {
	        	// [DB 접속] 시작
	            Context ctx = new InitialContext();
	            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
	            Connection con = ds.getConnection();
	            // DB 접속 끝
	            
	            // [SQL 삭제준비]
	            // SQL에서 DELETE FROM이 삭제하는건데 
	            // 그거랑 똑같이 사용하는거임
	            // WHERE는 삭제할 레코드를 선택하는 조건을 지정한다
	            // = ?는 삭제하고 싶은 sku_id의 값을 의미
	            //각 sku_id에 대해 삭제 쿼리를 실행하고 삭제된 행 수를 누적
	            for (String skuId : skuIds) {
	            	String query = "DELETE FROM p_sku WHERE sku_id = ?";
	            	PreparedStatement ps = con.prepareStatement(query);
	                ps.setInt(1, Integer.parseInt(skuId));
	                ps.executeUpdate();
	                ps.close();
	            }

	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return result;
	    }
}

