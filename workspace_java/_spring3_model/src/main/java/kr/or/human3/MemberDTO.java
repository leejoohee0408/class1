package kr.or.human3;

public class MemberDTO {

	private String id;
	private String pw;
	private String name;
	private int age;// 이거
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	} //이거
	public int getAge() { //이거
		return age;
	}
	public void setAge(int age) { //이거
		this.age = age;
	}
}
