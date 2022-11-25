import java.util.Scanner;

// дан массив цифр, задана цифра. элементы равные заданному, переместить в конец, остальные в начало
public class app4 {
    public static void main(String[] args) {
        int[] array = new int[] { 7, 3, 7, 2, 4, 7, 9, 1, 0 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        sc.close();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == number) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    array[j + 1] = number;
                }
            }

        }

        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
