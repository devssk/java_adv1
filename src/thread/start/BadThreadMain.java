package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " : main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " : start() 호출 전");
        // 별도의 스레드가 아닌 main 스레드가 run() 호출
        helloThread.run();
        System.out.println(Thread.currentThread().getName() + " : start() 호출 후");

        System.out.println(Thread.currentThread().getName() + " : main() end");

    }
}
