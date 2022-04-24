package concurrent;

public class ThreadDemoMain {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        Thread thread = new Thread(threadDemo2);
        thread.start();
    }
}