package thread;

class Shared {

    int value;
    boolean available = false;

    synchronized void produce(int value) {

    	try { 
    		while(available) {
    			wait();
    		}
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
        this.value = value;//1
        available = true;

        System.out.println("Produced: " + value);
        notify();
    }

    synchronized void consume() {
    	try {
    		while(!available) {
    			wait();
    		}
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    	System.out.println("Consumed : " + value);
    	available = false;
    	
    	notify();
    }
}