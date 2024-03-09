package lab6;

import java.util.*;

public class Stack {
    public static int findMax(List<Integer> list) {
        Deque<Integer> deque = new ArrayDeque<>(list);
        int max = Integer.MIN_VALUE;

        while (!deque.isEmpty()) {
            int current = deque.removeLast();
            max = Math.max(max, current);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        System.out.println(findMax(l));
    }
}