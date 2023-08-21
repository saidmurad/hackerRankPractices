class ThreadA {
    public static void main(String[] args) throws Exception {
        ThreadB b = new ThreadB();
        b.start();
        // Thread.sleep(10000);
        synchronized(b) {
            System.out.println("main thread calling waiting method");
            b.wait();
            System.out.println("Main thread got notification");
            System.out.println(b.total);
        }
    }
}
class ThreadB extends Thread {
    int total = 0;
    public void run() {
        synchronized(this){
            System.out.println("child thread starts calculation");
            for(int i=0;i<=100;i++) {
                total = total + i;
            }
            System.out.println("child Thread giving notification");
            this.notify();
        }
    }
}
