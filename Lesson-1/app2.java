
// Спросить имя и вывести приветствие в зависимости от времени
import java.time.LocalTime;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // int nowTime = LocalTime.now().getHour();
        // if (nowTime >= 5 && nowTime < 12) {
        // System.out.printf("Доброе утро, %s", name);
        // } else if (nowTime >= 12 && nowTime < 17) {
        // System.out.printf("Добрый день, %s", name);
        // } else if (nowTime >= 17 && nowTime < 23) {
        // System.out.printf("Добрый вечер, %s", name);
        // } else {
        // System.out.printf("Доброй ночи, %s", name);
        // }
        LocalTime now_time = LocalTime.now();
        LocalTime morning = LocalTime.of(5, 0, 0);
        LocalTime day = LocalTime.of(12, 0, 0);
        LocalTime evening = LocalTime.of(18, 0, 0);
        LocalTime night = LocalTime.of(23, 0, 0);
        if (now_time.isAfter(morning) && now_time.isBefore(day))
            System.out.printf("Доброе утро, %s", name);
        if (now_time.isAfter(day) && now_time.isBefore(evening))
            System.out.printf("Добрый день, %s", name);
        if (now_time.isAfter(evening) && now_time.isBefore(night))
            System.out.printf("Добрый вечер, %s", name);
        if (now_time.isAfter(night) && now_time.isBefore(morning))
            System.out.printf("Доброй ночи, %s", name);
        sc.close();
    }
}
