package chapter10;

public class Parcel3 {
    class Contents {
        private int i =11;
        public int value(){
            return i;
        }
        class Destination {
            private String lable;

            Destination(String whereTo) {
                lable = whereTo;
            }

            String readLable() {
                return lable;
            }
        }

    }
}
