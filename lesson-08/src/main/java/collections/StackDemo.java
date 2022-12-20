package collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Last In - First Out
        Stack<String> stack = new Stack<>();

        // Thêm 1 phần tử vào stack
        // Cam -> Dứa -> Xoài -> Nho
        stack.push("Cam");
        stack.push("Dứa");
        stack.push("Xoài");
        stack.push("Nho");

        // Lấy 1 phần tử ra khỏi stack
        String fruit = stack.pop();
        System.out.println("fruit = " + fruit);

        // Xem phần tử đầu tiên
        String top = stack.peek();
        System.out.println("top = " + top);

        // Lấy từng phần tử ra khỏi stack
        while (!stack.empty()) {
            String pop = stack.pop();
            System.out.println("- pop = " + pop);
        }
    }
}
