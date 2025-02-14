package sec01.exam01;

public class ExtendsExam {

	public static void main(String[] args) {
		
		Child name = new Child();
		
		name.printName();
		String cName = name.getName();
		
		//둘이 똑같다		
		System.out.println("cName: "+cName);
		System.out.println("name.name: "+name.name);
		
	String pName =	name.parentName();
	System.out.println(pName);
	
	Child c2 = new Child("새로운 이름");
	String pName2 =	c2.parentName();
	System.out.println(pName2); // "새로운 이름"

	}

}
