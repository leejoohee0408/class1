import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class P_skuDAO {
	
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
				ps.setString(6, p_skuDTO.getCategory());

				// [SQL 실행] 및 [결과 확보]
				// int executeUpdate() : select 외 모든 것
				result = ps.executeUpdate();
				

				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return result;
	
	


	}

}
