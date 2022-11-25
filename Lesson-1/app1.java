import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s\n", name);
        iScanner.close();
    }
}
