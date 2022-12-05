import java.util.LinkedList;
import java.util.Queue;

public class App4 {
    public static void main(String[] args) {
        String[] base = {"1", "2", "3", "4", "5"};
        Queue<String> queueArray = new LinkedList<>(Arrays.asList(base));
        Queue<String> dequeArray = new LinkedList<>(Arrays.asList(base));
        System.out.println("Очередь:");
        while (!queueArray.isEmpty()) {
            System.out.print(queueArray.poll()+" ");
        }
        System.out.println("\nСтэк:");
        while (!dequeArray.isEmpty()) {
            System.out.println(dequeArray.pollLast()+" ");
        }
    }
}
