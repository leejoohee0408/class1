package cafe;

public class Barista extends Employee {
    public Barista(String name, int salary) {
        super(name, salary);
    }
    
    void makeCoffee() {
        System.out.println(name + "이(가) 다양한 종류의 커피를 만듭니다.");
    }
    
    void washDishes() {
        System.out.println(name + "이(가) 설거지를 합니다.");
    }
    
    void writeLedger() {
        System.out.println(name + "이(가) 장부를 작성합니다.");
    }
    
    void study() {
        System.out.println(name + "이(가) 커피 공부를 합니다.");
    }
    

}