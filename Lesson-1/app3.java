
// Вывести макимальное еоличество идущих подряд единичек из массива
import java.util.Random;

public class app3 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(0, 2);
            System.out.print(arr[i]);
        }
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        System.out.println("\n" + maxCount);
    }
}
