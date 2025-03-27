package kr.or.human0408;

public class PracticeDTO {

	String image; // 그림
	String title; // 제목
	String author; // 작가
	String detail; // 내용
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "PracticeDTO [image=" + image + ", title=" + title + ", author=" + author + ", detail=" + detail + "]";
	}
}
