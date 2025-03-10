package 프로젝트연습;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * 상품 정보에 대한 데이터베이스 접근 객체 (DAO - Data Access Object) 클래스
 */
public class P_skuDAO {

	/**
     * 데이터베이스 연결을 가져오는 메서드
     *
     * @return Connection 객체
     * @throws Exception 데이터베이스 연결 실패 시 예외 발생
     */
    private Connection getConnection() throws Exception {
        Context ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
        return ds.getConnection();
    }

    /**
     * 상품 정보를 데이터베이스에 삽입하는 메서드
     *
     * @param skuDTO 상품 정보를 담은 DTO 객체
     * @return 삽입된 레코드 수
     */
    public int insertSku(P_skuDTO skuDTO) {
        System.out.println("P_skuDAO insertSku 실행");
        int result = -1;

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement("INSERT INTO p_sku VALUES (p_sku_seq.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)")) {

            ps.setString(1, skuDTO.getSkuCode());
            ps.setString(2, skuDTO.getSkuName());
            ps.setString(3, skuDTO.getSkuSize());
            ps.setString(4, skuDTO.getVendorName());
            ps.setDouble(5, skuDTO.getPrice());
            ps.setDate(6, new java.sql.Date(skuDTO.getCreateDate().getTime()));
            ps.setDate(7, skuDTO.getModifyDate() != null ? new java.sql.Date(skuDTO.getModifyDate().getTime()) : null);
            ps.setString(8, skuDTO.getCategory());

            result = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    /**
     * 상품 정보 목록을 데이터베이스에서 조회하는 메서드
     *
     * @return 상품 정보 목록
     */
    public List<P_skuDTO> selectSkuList() {
        System.out.println("P_skuDAO selectSkuList 실행");

        List<P_skuDTO> list = new ArrayList<>();

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM p_sku");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                P_skuDTO dto = new P_skuDTO();
                dto.setSkuId(rs.getInt("sku_id"));
                dto.setSkuCode(rs.getString("sku_code"));
                dto.setSkuName(rs.getString("sku_name"));
                dto.setSkuSize(rs.getString("sku_size"));
                dto.setVendorName(rs.getString("vendor_name"));
                dto.setPrice(rs.getDouble("price"));
                dto.setCreateDate(rs.getDate("create_date"));
                dto.setModifyDate(rs.getDate("modify_date"));
                dto.setCategory(rs.getString("category"));

                list.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    /**
     * 상품 정보를 데이터베이스에서 수정하는 메서드
     *
     * @param skuDTO 수정할 상품 정보를 담은 DTO 객체
     * @return 수정된 레코드 수
     */
    public int updateSku(P_skuDTO skuDTO) {
        System.out.println("P_skuDAO updateSku 실행");
        System.out.println(skuDTO);
        int result = -1;

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement("UPDATE p_sku SET sku_code = ?, sku_name = ?, sku_size = ?, vendor_name = ?, price = ?, modify_date = ?, category = ? WHERE sku_id = ?")) {

            ps.setString(1, skuDTO.getSkuCode());
            ps.setString(2, skuDTO.getSkuName());
            ps.setString(3, skuDTO.getSkuSize());
            ps.setString(4, skuDTO.getVendorName());
            ps.setDouble(5, skuDTO.getPrice());
            ps.setDate(6, skuDTO.getModifyDate() != null ? new java.sql.Date(skuDTO.getModifyDate().getTime()) : null);
            ps.setString(7, skuDTO.getCategory());
            ps.setInt(8, skuDTO.getSkuId());

            result = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 상품 정보를 데이터베이스에서 삭제하는 메서드
     *
     * @param skuId 삭제할 상품 고유 번호
     * @return 삭제된 레코드 수
     */
    public int deleteSku(int skuId) {
        System.out.println("P_skuDAO deleteSku 실행");
        int result = -1;

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement("DELETE FROM p_sku WHERE sku_id = ?")) {

            ps.setInt(1, skuId);
            result = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}