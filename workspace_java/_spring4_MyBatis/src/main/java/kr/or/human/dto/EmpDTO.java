package kr.or.human.dto;
import java.sql.Date;

import lombok.Data;

// DTO : Data Transfer Object
// VO : Value Object
/*@Getter
@Setter
@ToString
@RequiredArgsConstructor // 생성자
@EqualsAndHashCode*/
@Data
public class EmpDTO {

	
	private int empno;		// 사원번호
	private String ename;	// 사원명
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private Integer comm;
	private int deptno;
	
	
	
	// 이거 밑에있는거는 웹툰 연습
	String image; // 그림
	String title; // 제목
	String author; // 작가
	String detail; // 내용

	
}
