package 프로젝트연습;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 상품 정보 관리 컨트롤러
 */
@WebServlet("/sku") // sku URL로 들어오는 요청을 처리하도록 매핑
public class SkuController extends HttpServlet {

    private P_skuDAO skuDAO = new P_skuDAO(); // P_skuDAO 객체 생성

    /**
     * GET 요청 처리 메서드
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action"); // action 파라미터 값 가져오기

        if ("list".equals(action) || action == null) { // action이 list이거나 null이면
            try {
                List<P_skuDTO> skus = skuDAO.selectSkuList(); // 상품 목록 조회
                request.setAttribute("skus", skus); // 조회된 상품 목록을 request 속성에 저장
                request.getRequestDispatcher("/sku_list.jsp").forward(request, response); // sku_list.jsp로 포워딩
            } catch (Exception e) {
                e.printStackTrace();
                response.getWriter().write("데이터베이스 오류 발생"); // 오류 발생 시 클라이언트에 오류 메시지 전송
            }
        } else if ("editForm".equals(action)) { // action이 editForm이면
            int skuId = Integer.parseInt(request.getParameter("skuId")); // skuId 파라미터 값 가져오기
            try {
                // 수정 폼으로 전달할 상품 정보 조회
                P_skuDTO sku = skuDAO.selectSkuList().stream()
                        .filter(s -> s.getSkuId() == skuId)
                        .findFirst()
                        .orElse(null);
                request.setAttribute("sku", sku); // 조회된 상품 정보를 request 속성에 저장
                request.getRequestDispatcher("/sku_edit.jsp").forward(request, response); // sku_edit.jsp로 포워딩
            } catch (Exception e) {
                e.printStackTrace();
                response.getWriter().write("데이터베이스 오류 발생"); // 오류 발생 시 클라이언트에 오류 메시지 전송
            }
        }
    }

    /**
     * POST 요청 처리 메서드
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action"); // action 파라미터 값 가져오기

        if ("insert".equals(action)) { // action이 insert이면
            P_skuDTO sku = new P_skuDTO(); // P_skuDTO 객체 생성
            sku.setSkuCode(request.getParameter("skuCode")); // 상품 코드 설정
            sku.setSkuName(request.getParameter("skuName")); // 상품명 설정
            sku.setSkuSize(request.getParameter("skuSize")); // 규격 설정
            sku.setVendorName(request.getParameter("vendorName")); // 업체명 설정
            sku.setPrice(Double.parseDouble(request.getParameter("price"))); // 단가 설정

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 포맷 설정
            try {
                sku.setCreateDate(dateFormat.parse(request.getParameter("createDate"))); // 등록 날짜 설정
                if (request.getParameter("modifyDate") != null && !request.getParameter("modifyDate").isEmpty()) {
                    sku.setModifyDate(dateFormat.parse(request.getParameter("modifyDate"))); // 수정 날짜 설정
                }
            } catch (ParseException e) {
                e.printStackTrace();
                response.getWriter().write("날짜 형식 오류 발생"); // 날짜 형식 오류 발생 시 클라이언트에 오류 메시지 전송
                return;
            }

            sku.setCategory(request.getParameter("category")); // 제품 분류 설정

            try {
                skuDAO.insertSku(sku); // 상품 정보 삽입
                response.sendRedirect("/sku?action=list"); // 상품 목록 페이지로 리다이렉트
            } catch (Exception e) {
                e.printStackTrace();
                response.getWriter().write("데이터베이스 오류 발생"); // 오류 발생 시 클라이언트에 오류 메시지 전송
            }
        } else if ("update".equals(action)) { // action이 update이면
            P_skuDTO sku = new P_skuDTO(); // P_skuDTO 객체 생성
            sku.setSkuId(Integer.parseInt(request.getParameter("skuId"))); // 상품 고유 번호 설정
            sku.setSkuCode(request.getParameter("skuCode")); // 상품 코드 설정
            sku.setSkuName(request.getParameter("skuName")); // 상품명 설정
            sku.setSkuSize(request.getParameter("skuSize")); // 규격 설정
            sku.setVendorName(request.getParameter("vendorName")); // 업체명 설정
            sku.setPrice(Double.parseDouble(request.getParameter("price"))); // 단가 설정

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 포맷 설정
            try {
                if (request.getParameter("modifyDate") != null && !request.getParameter("modifyDate").isEmpty()) {
                    sku.setModifyDate(dateFormat.parse(request.getParameter("modifyDate"))); // 수정 날짜 설정
                }
            } catch (ParseException e) {
                e.printStackTrace();
                response.getWriter().write("날짜 형식 오류 발생"); // 날짜 형식 오류 발생 시 클라이언트에 오류 메시지 전송
                return;
            }

            sku.setCategory(request.getParameter("category")); // 제품 분류 설정

            try {
                skuDAO.updateSku(sku); // 상품 정보 수정
                response.sendRedirect("/sku?action=list"); // 상품 목록 페이지로 리다이렉트
            } catch (Exception e) {
                e.printStackTrace();
                response.getWriter().write("데이터베이스 오류 발생"); // 오류 발생 시 클라이언트에 오류 메시지 전송
            }
        } else if ("delete".equals(action)) { // action이 delete이면
            int skuId = Integer.parseInt(request.getParameter("skuId")); // 상품 고유 번호 설정
            try {
                skuDAO.deleteSku(skuId); // 상품 정보 삭제
                response.sendRedirect("/sku?action=list"); // 상품 목록 페이지로 리다이렉트
            } catch (Exception e) {
                e.printStackTrace();
                response.getWriter().write("데이터베이스 오류 발생"); // 오류 발생 시 클라이언트에 오류 메시지 전송
            }
        }
    }
}