package cafe;

public class Clerk extends Employee {
    public Clerk(String name, int salary) {
        super(name, salary);
    }
    
    void manageStore() {
        System.out.println(name + "이(가) 매장을 관리합니다.");
    }
    
    void settleAccounts() {
        System.out.println(name + "이(가) 일정산을 합니다.");
    }
    

}
