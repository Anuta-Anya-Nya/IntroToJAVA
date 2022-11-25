import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class App1 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите число: ");
        Scanner sc=new Scanner(System.in);
        int numb=sc.nextInt();
        sc.close();
        int result = 0;
        int result_2=1;
        for (int i = 1; i <= numb; i++) {
            result +=i;
            result_2 *=i;
        }
        System.out.println("Треугольное число равно " + result);
        System.out.println("Факториал равен " + result_2);    
    }
}
