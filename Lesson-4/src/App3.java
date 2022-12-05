import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;
// Релизовать консольное приложение, которое:
// 1. Принимает от пользователя и запоминает строки
// 2. если введено print выводит строчки так, чтобы последняя была выведена первой, а первая последней
// 3. если введено revert, удаляет предыдущую введеную строку из памяти
public class App3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Deque<String> dq=new ArrayDeque<>();
        while(true){
            System.out.println("введите строку: ");
            String line=sc.nextLine();
            if(line.equals("")){
                break;
            } 
            else if(line.equals("print")){
                while (!dq.isEmpty()) {
                    System.out.print(dq.removeLast() + " ");
                }
            } else if(line.equals("revert")){
                dq.removeLast();
            }
            else {
                dq.add(line);
            }
        }
        System.out.println(dq);
        sc.close();
    }
}
