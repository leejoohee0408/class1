package cafe;

public class Employee {

	 String name;
	    int salary;
	    
	     Employee(String name, int salary) {
	        this.name = name;
	        this.salary = salary;
	    }
	    
	    void serveCustomers() {
	        System.out.println(name + "이(가) 손님을 접대합니다.");
	    }
	    
	    void study() {
	        System.out.println(name + "이(가) 미래를 위한 공부를 합니다.");
	    }
	    
	    void receiveSalary() {
	        System.out.println(name + "이(가) 월급 " + salary + "원을 받았습니다.");
	    }
	    

}
