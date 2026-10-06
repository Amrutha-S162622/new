package thread;

class Producer extends Thread {

    Shared s;

    Producer(Shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            s.produce(i);
        }
    }
}