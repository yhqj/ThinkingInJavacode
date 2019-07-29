package chapter10;

import java.util.ArrayList;

public class Parcel2 {
    class Destination {
        private String lable;

        Destination(String whereTo) {
            lable = whereTo;
        }

        String readLable() {
            return lable;
        }
    }

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }

    }
    public Destination toDes(String s){
        return new Destination(s);
    }

    public Contents toCon(){
        return new Contents();
    }
    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLable());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("nike");
        Parcel2 q = new Parcel2();

       
    }
}
