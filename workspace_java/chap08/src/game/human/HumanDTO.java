package game.human;

public class HumanDTO {
	
	  private String id;
	    private String pw;
	    private String name;
	    private int age;

	    // id
	    public String getId(){
	        return this.id;
	    }

	    public void setId(String id){
	        this.id = id;
	    }

	    // pw
	    public String getPw() {
	        return pw;
	    }

	    public void setPw(String pw) {
	        this.pw = pw;
	    }

	    // name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // age
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	}