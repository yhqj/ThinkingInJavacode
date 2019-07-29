package chapter10;


/**
 *内部类可以访问其外部类的方法和字段
 * **/
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];

    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }
        public Object currrent(){
            return items[i];
        }

    }
}
