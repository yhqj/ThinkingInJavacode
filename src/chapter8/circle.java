package chapter8;

class  shape{
    public void draw(){

    }
}
public class circle extends shape{
    public void draw(){
        System.out.println("cccc");
    }

    public static void main(String[] args) {
        shape s = new circle();
        s.draw();
    }
}
