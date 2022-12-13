import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* 1.Создайте HashSet, заполните числами {1,2,3,2,4,5,6,1}, распечатайте
   2. Создайте LinkedHash Set, заполните числами,{1,2,3,2,4,5,6,1} распечатайте
   3. Создайте TreeSet, заполните числами {1,2,3,2,4,5,6,1}, распечатайте
 */
public class Task1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,2,5,4,6,3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        System.out.println(set1); //хранит значения по хэшам
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set2); //хранит значения в порядке ввода
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set3); //хранит значения в отсортированном виде
    }
}
