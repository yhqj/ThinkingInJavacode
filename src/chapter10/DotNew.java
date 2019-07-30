package chapter10;

public class DotNew {
    public class inner {

    }
//创建内部类的靠谱方式 不是静态内部类

    public static void main(String[] args) {
        DotNew d = new DotNew();
        DotNew.inner di =  d. new inner();
    }
}
