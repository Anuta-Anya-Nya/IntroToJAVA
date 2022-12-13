import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*Напишите метод, который заполняет массив из 1000 элементов случайными числами от 0 до 24
2. Создайте метод, в который передайте заполненный массив и с помощью Set вычислите процент уникальных значений и верните его в ваиде числа с плавающей запятой
используйте формулу: процент уникальных чисел = количество уникальных чисел * 100 / количество чисел в массиве
 */
public class Task2 {
    public static void main(String[] args) {
        Integer[] array=createArr(1000, 0, 24);
        System.out.println(getUnic(array));
        
    }
    public static Integer[] createArr(int size, int min, int max) {
        Random rnd = new Random();
        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rnd.nextInt(max-min+1)+min;
        }
        return arr;
    }
    public static double getUnic(Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double unic = set.size() * 100.0 / arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println(set);
        return unic;
    }
}
