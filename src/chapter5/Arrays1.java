package chapter5;

import java.util.ArrayList;

public class Arrays1 {
    public static void main(String[] args) {
        int[] a1 ={1,2,3,4};
        int[] a2 = a1;
        for (int i =0;i<a2.length;i++){
            a2[i]=a2[i]+1;
        }
        for (int i =0;i<a1.length;i++){
            System.out.println(a1);
        }

    }
}
