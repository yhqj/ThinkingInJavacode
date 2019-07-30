package chapter5;

public class P8 {
    public void t1(){
    System.out.println("11");
    }
    public  void t2(){
        t1();
        this.t1();
    }

    public static void main(String[] args) {
        P8 p8 =new P8();
        p8.t2();
    }

}
