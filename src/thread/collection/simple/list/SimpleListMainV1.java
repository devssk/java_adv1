package thread.collection.simple.list;

public class SimpleListMainV1 {
    public static void main(String[] args) {
        SimpleList list = new BasicList();

        // 스레드1, 스레드2 동시 실행 가정
        list.add("A");
        list.add("B");
        System.out.println("list = " + list);
    }
}
