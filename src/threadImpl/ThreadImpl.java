package threadImpl;

import java.util.stream.IntStream;

class ThreadMain extends Thread{
    public void run() {
        try {
            System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
        } catch(Exception e) {
            System.out.println("Exception is found");
        }
    }
}
class ThreadMain2 implements Runnable{
    public void run() {
        try {
            System.out.println("Thread  "+ Thread.currentThread().getId()+" is running");
        } catch(Exception e) {
            System.out.println("Exception is found");
        }
    }
}
public class ThreadImpl {
    public static void main(String[] args) {
        {
            int n=8;
            IntStream.range(0, n).mapToObj(i -> new Thread(new ThreadMain())).forEach(Thread::start);
            IntStream.range(0, n).mapToObj(i -> new Thread(new ThreadMain2())).forEach(Thread::start);
        }
    }
}