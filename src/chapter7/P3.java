package chapter7;

class one {
    one(){
        System.out.println("one");
    }
}

class two extends one{
    two(){
        System.out.println("two");
    }
}
public class P3 extends two{
    public static void main(String[] args) {
        P3 p3 = new P3();
    }
}
