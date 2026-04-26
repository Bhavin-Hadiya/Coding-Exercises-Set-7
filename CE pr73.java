import java.util.*;

class Table {
    synchronized void print(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
        }
    }
}

class T1 extends Thread {
    Table t;

    T1(Table t) {
        this.t = t;
    }

    public void run() {
        t.print(5);
    }
}

class T2 extends Thread {
    Table t;

    T2(Table t) {
        this.t = t;
    }

    public void run() {
        t.print(7);
    }
}

public class CE pr73 {
    public static void main(String[] args) {
        Table t = new Table();

        T1 a = new T1(t);
        T2 b = new T2(t);

        a.start();
        b.start();
    }
}