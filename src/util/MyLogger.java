package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class MyLogger {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");

    public static void log(Object obj) {
        String dateTime = LocalDateTime.now().format(formatter);
        System.out.printf("%s [%9s] %s\n", dateTime, Thread.currentThread().getName(), obj);
    }

}
