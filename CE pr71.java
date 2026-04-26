import java.util.*;

class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class CE pr71 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();
        t2.start();
    }
}