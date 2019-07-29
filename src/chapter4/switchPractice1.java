package chapter4;


/**
 * break 直接退出break
 * **/
public class switchPractice1 {
    public static void main(String[] args) {
        for (int i =1 ;i<2;i++){
            switch (i) {
                case  1:
                System.out.println("one");
                //break;

                case 2:
                    System.out.println("two");

            }
        }
    }
}
