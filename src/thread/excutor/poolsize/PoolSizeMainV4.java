package thread.excutor.poolsize;

import thread.excutor.RunnableTask;

import java.util.concurrent.*;

import static thread.excutor.ExecutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class PoolSizeMainV4 {

//    static final int TASK_SIZE = 1100;
//    static final int TASK_SIZE = 1200;
    static final int TASK_SIZE = 1201;

    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(100, 200, 60L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(1000));

        log("pool 생성");
        printState(es);

        long startMs = System.currentTimeMillis();

        for (int i = 1; i <= TASK_SIZE; i++) {
            String taskName = "task" + i;
            try {
                es.execute(new RunnableTask(taskName));
                printState(es, taskName);
            } catch (RejectedExecutionException e) {
                log(taskName + " -> " + e);
            }
        }

        sleep(13000);
        log("== maximumPoolSize 대기 시간 초과 ==");
        printState(es);

        log("== 작업 수행 완료 ==");
        printState(es);

        es.close();
        long endMs = System.currentTimeMillis();
        log("time : " + (endMs - startMs));
        log("== shutdown 완료 ==");
        printState(es);

    }
}
