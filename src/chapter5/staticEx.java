package chapter5;

class cup {
    cup(int s){
        System.out.println(s);
    }
    void f(int s){
        System.out.println("f"+s);
    }
}

class cups{
    static cup cup1= new cup(1);
    static cup cup2= new cup(2);

}

public class staticEx {
    public static void main(String[] args) {
        cups.cup1.f(99);
    }
}

