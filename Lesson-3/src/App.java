import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//заполнить массив десятью случайными числами, отсортировать методо sort и вывести его на экран
public class App {
    public static void main(String[] args) throws Exception {
        Random rnd = new Random();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(100));
        } 
        System.out.println(arr);
        printArray(arr);     
        Collections.sort(arr);
        printArray(arr); 
    }
    public static void printArray(ArrayList<Integer> arr) {
        StringBuilder printSB = new StringBuilder();
        for (Integer number : arr) {
            printSB.append(number+", ");
        }
        String output = printSB.substring(0, printSB.length()-2);
        System.out.println(output);
    }
}
