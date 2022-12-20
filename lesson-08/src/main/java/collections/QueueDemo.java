package collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Last In - Last Out ~ First In - First Out
        Queue<String> queue = new ArrayDeque<>();
        // Queue<String> queue = new LinkedList<>();
        // Queue<String> queue = new PriorityQueue<>();

        // Thêm 1 phần tử vào hàng đợi
        queue.offer("Duy");
        queue.offer("Ngọc Anh");
        queue.add("Hùng");
        queue.add("Đức Anh");

        // Lấy 1 phần tử ra khỏi hàng đợi
        String first = queue.poll();
        System.out.println("first = " + first);

        // Xem phần tử đầu tiên trong hàng đợi
        String peek = queue.peek();
        System.out.println("peek = " + peek);

        // Lấy từng phần tử ra khỏi hàng đợi
        while (!queue.isEmpty()) {
            String name = queue.poll();
            System.out.println("- name = " + name);
        }
    }
}
