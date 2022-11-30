import java.util.Scanner;
// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
public class App4 {
    public static void main(String[] args) {
        System.out.print("Введите математический пример: ");
        Scanner sc=new Scanner(System.in);
        String expression=sc.nextLine();
        sc.close();
        
        int index1=expression.indexOf("+"); 
        int index2=expression.indexOf("="); 
        String number1=expression.substring(0, index1); 
        String number2=expression.substring(index1+1, index2); 
        String summa=expression.substring(index2+1, expression.length()); 
        
        System.out.println(number1+number2+summa);
               

    }
}
