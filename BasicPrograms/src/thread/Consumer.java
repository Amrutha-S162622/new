package thread;

class Consumer extends Thread {

    Shared s;

    Consumer(Shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            s.consume();
        }
    }
}
