package cafe;

public class Baker extends Employee {
    public Baker(String name, int salary) {
        super(name, salary);
    }
    
    void bakeBread() {
        System.out.println(name + "이(가) 다양한 종류의 빵을 만듭니다.");
    }
    
    void study() {
        System.out.println(name + "이(가) 빵 공부를 합니다.");
    }
    

}
