package 프로젝트연습;

import java.util.Date;


// 상품 정보를 담는 DTO (Data Transfer Object) 클래스
 
public class P_skuDTO {
	 private int skuId;
	    private String skuCode;
	    private String skuName;
	    private String skuSize;
	    private String vendorName;
	    private double price;
	    private Date createDate;
	    private Date modifyDate;
	    private String category;

	    // 기본 생성자
	    public P_skuDTO() {}

	    
	    /**
	     * 모든 필드를 매개변수로 받는 생성자
	     *
	     * @param skuId      상품 고유 번호
	     * @param skuCode    상품 코드
	     * @param skuName    상품명
	     * @param skuSize    규격
	     * @param vendorName 업체명
	     * @param price      단가
	     * @param createDate 등록 날짜
	     * @param modifyDate 수정 날짜
	     * @param category   제품 분류
	     */
	    public P_skuDTO(int skuId, String skuCode, String skuName, String skuSize, String vendorName, double price, Date createDate, Date modifyDate, String category) {
	        this.skuId = skuId;
	        this.skuCode = skuCode;
	        this.skuName = skuName;
	        this.skuSize = skuSize;
	        this.vendorName = vendorName;
	        this.price = price;
	        this.createDate = createDate;
	        this.modifyDate = modifyDate;
	        this.category = category;
	    }

	    // getter 및 setter 메서드
	    public int getSkuId() { return skuId; }
	    public void setSkuId(int skuId) { this.skuId = skuId; }
	    public String getSkuCode() { return skuCode; }
	    public void setSkuCode(String skuCode) { this.skuCode = skuCode; }
	    public String getSkuName() { return skuName; }
	    public void setSkuName(String skuName) { this.skuName = skuName; }
	    public String getSkuSize() { return skuSize; }
	    public void setSkuSize(String skuSize) { this.skuSize = skuSize; }
	    public String getVendorName() { return vendorName; }
	    public void setVendorName(String vendorName) { this.vendorName = vendorName; }
	    public double getPrice() { return price; }
	    public void setPrice(double price) { this.price = price; }
	    public Date getCreateDate() { return createDate; }
	    public void setCreateDate(Date createDate) { this.createDate = createDate; }
	    public Date getModifyDate() { return modifyDate; }
	    public void setModifyDate(Date modifyDate) { this.modifyDate = modifyDate; }
	    public String getCategory() { return category; }
	    public void setCategory(String category) { this.category = category; }
	}