package chapter8;
class Super{
    public int filed = 10;
    public int getFiled(){
        return filed;
    }
}
public class Sub extends  Super{
    public int filed = 100;
    public int getFiled(){
        return filed;
    }

    public static void main(String[] args) {
        Super s = new Sub();
        Super s2 = new Sub();
        System.out.println(s.filed+s.getFiled());
    }
}
