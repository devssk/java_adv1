package thread.collection.simple.list;

import java.util.ArrayList;
import java.util.List;

public class SimpleListMainV0 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 스레드1, 스레드2 동시 실행 가정
        list.add("A");
        list.add("B");
    }
}
