package thread;

public class Test {

    public static void main(String[] args) {

        Shared s = new Shared();

        Producer p = new Producer(s);
        Consumer c = new Consumer(s);

        p.start();
        c.start();
    }
}