package kr.or.human.service;

public class EmpServiceImpl {

	void paging() {
		int page = 3;
		int viewCount = 10;
		
//		(10 * 2) + 1
//		(viewCount * 2) + 1
//		(viewCount * (3-1)) + 1
		int idxStart = (viewCount * (page-1)) + 1;
		int idxEnd = page * viewCount;
	}
	
}
