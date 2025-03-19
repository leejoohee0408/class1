package ������Ʈ�������԰����;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class P_material_in_outDAO {
	// DB �����ϱ�
		public Connection getConnection() throws SQLException {
			try {
				Context ctx = new InitialContext();
				DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
				return ds.getConnection();
			} catch (Exception e) {
				e.printStackTrace();
				throw new SQLException("�����ͺ��̽� ���� ����");
			}
		}

		// ���� �Է��Ѱ� ����
		// id�� 1�� ������ SYSDATE�� ���ݳ�¥�� �������߰� ������¥�� �ϴ� null�� �س���
		public int insertsku(P_material_in_outDTO p_skuDTO) throws SQLException {
		        int result = -1;
		        Connection con = null;
		        PreparedStatement ps = null;
		        try {
		            con = getConnection();
		            String query = "INSERT INTO p_material_in_out (ib_id, material_count, material_price, sku_type,create_date,modify_date,remarks,sku_id,bill_id) "
		                     + "VALUES (seq_p_material_in_out.nextval, ?, ?, ?, SYSDATE, NULL,?,?,?)";
		            ps = con.prepareStatement(query);
		            ps.setInt(1, p_skuDTO.getMaterial_count()); 
		            ps.setInt(2, p_skuDTO.getMaterial_price());              
		            ps.setString(3, p_skuDTO.getSku_type());            
		            ps.setString(4, p_skuDTO.getRemarks());          
		            ps.setInt(5, p_skuDTO.getSku_id());          
		            ps.setInt(6, p_skuDTO.getBill_id()); 
		            result = ps.executeUpdate();
		        } finally {
		            if (ps != null) ps.close();
		            if (con != null) con.close();
		        }
		        return result;
		    }
	    
		// ���� ����� ���̺� ��ü ��������
		// ��ǰ������������ ��ǰ�ڵ�,��ǰ��,�԰ݵ� ��������
		public List<P_material_in_outDTO> selectP_skuList() throws SQLException {
		    List<P_material_in_outDTO> list = new ArrayList<>();
		    Connection con = null;
		    PreparedStatement ps = null;
		    ResultSet rs = null;
		    try {
		        con = getConnection();
		        String query = "SELECT pmio.*, ps.sku_code, ps.sku_name, ps.sku_size " +
		                       "FROM P_MATERIAL_IN_OUT pmio LEFT JOIN P_SKU ps ON pmio.sku_id = ps.sku_id";
		        ps = con.prepareStatement(query);
		        rs = ps.executeQuery();
		        while (rs.next()) {
		            P_material_in_outDTO dto = new P_material_in_outDTO();
		            dto.setIb_id(rs.getInt("ib_id"));
		            dto.setMaterial_count(rs.getInt("material_count")); // ������ Ÿ�� ����
		            dto.setMaterial_price(rs.getInt("material_price")); // ������ Ÿ�� ����
		            dto.setSku_code(rs.getString("sku_code"));
		            dto.setSku_name(rs.getString("sku_name"));
		            dto.setSku_size(rs.getString("sku_size"));
		            dto.setSku_type(rs.getString("sku_type"));
		            dto.setCreate_date(rs.getDate("create_date"));
		            dto.setModify_date(rs.getDate("modify_date"));
		            dto.setRemarks(rs.getString("remarks"));
		            dto.setSku_id(rs.getInt("sku_id"));
		            dto.setBill_id(rs.getInt("bill_id"));
		            list.add(dto);
		        }
		    } finally {
		        if (rs != null) rs.close();
		        if (ps != null) ps.close();
		        if (con != null) con.close();
		    }
		    return list;
		}
		  
		  
	    
	    // �����Ҷ� ���̴� ��
	    public int deleteSkus(String[] skuIds) throws SQLException {
	        int result = 0;
	        Connection con = null;
	        PreparedStatement ps = null;
	        try {
	            con = getConnection();
	            String query = "DELETE FROM p_material_in_out WHERE ib_id = ?";
	            ps = con.prepareStatement(query);
	            for (String skuId : skuIds) {
	                ps.setInt(1, Integer.parseInt(skuId));
	                result += ps.executeUpdate();
	            }
	        } finally {
	            if (ps != null) ps.close();
	            if (con != null) con.close();
	        }
	        return result;
	    }
	    // �̰� �����Ҷ� ���̴� ������Ʈ 
	    public int updateSku(P_material_in_outDTO p_skuDTO) throws SQLException {
	        int result = 0;
	        Connection con = null;
	        PreparedStatement ps = null;
	        try {
	            con = getConnection();
	            String query = "UPDATE p_material_in_out SET material_count = ?, material_price = ?, sku_type = ?, modify_date = SYSDATE, remarks = ? WHERE ib_id = ?";
	            ps = con.prepareStatement(query);
	            ps.setInt(1, p_skuDTO.getMaterial_count());
	            ps.setInt(2, p_skuDTO.getMaterial_price());
	            ps.setString(3, p_skuDTO.getSku_type());
	            ps.setString(4, p_skuDTO.getRemarks());
	            ps.setInt(5, p_skuDTO.getIb_id());
	            result = ps.executeUpdate();
	        } finally {
	            if (ps != null) ps.close();
	            if (con != null) con.close();
	        }
	        return result;
	    }
	    
	    // ��ȸ�Ҷ� ���̴� ��
		public List<P_material_in_outDTO> searchP_skuList(String searchKeyword) throws SQLException {
		    List<P_material_in_outDTO> list = new ArrayList<>();
		    Connection con = null;
		    PreparedStatement ps = null;
		    ResultSet rs = null;
		    try {
		        con = getConnection();
		        String query = "SELECT pmio.*, ps.sku_code, ps.sku_name, ps.sku_size " +
		                       "FROM P_MATERIAL_IN_OUT pmio LEFT JOIN P_SKU ps ON pmio.sku_id = ps.sku_id " +
		                       "WHERE UPPER(ps.sku_code) LIKE UPPER(?) OR UPPER(ps.sku_name) LIKE UPPER(?)";
		        ps = con.prepareStatement(query);
		        ps.setString(1, "%" + searchKeyword + "%");
		        ps.setString(2, "%" + searchKeyword + "%");
		        rs = ps.executeQuery();
		        while (rs.next()) {
		            P_material_in_outDTO dto = new P_material_in_outDTO();
		            dto.setIb_id(rs.getInt("ib_id"));
		            dto.setMaterial_count(rs.getInt("material_count"));
		            dto.setMaterial_price(rs.getInt("material_price"));
		            dto.setSku_code(rs.getString("sku_code") != null ? rs.getString("sku_code") : "");
		            dto.setSku_name(rs.getString("sku_name") != null ? rs.getString("sku_name") : "");
		            dto.setSku_size(rs.getString("sku_size") != null ? rs.getString("sku_size") : "");
		            dto.setSku_type(rs.getString("sku_type"));
		            dto.setCreate_date(rs.getDate("create_date"));
		            dto.setModify_date(rs.getDate("modify_date"));
		            dto.setRemarks(rs.getString("remarks") != null ? rs.getString("remarks") : "");
		            dto.setSku_id(rs.getInt("sku_id"));
		            dto.setBill_id(rs.getInt("bill_id"));
		            list.add(dto);
		        }
		    } finally {
		        if (rs != null) try { rs.close(); } catch (SQLException e) {}
		        if (ps != null) try { ps.close(); } catch (SQLException e) {}
		        if (con != null) try { con.close(); } catch (SQLException e) {}
		    }
		    return list;
		}
	}
