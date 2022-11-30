import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner sc=new Scanner(System.in);
        int numb_1=sc.nextInt();   
        System.out.print("Введите второе число: ");
        int numb_2=sc.nextInt();
        System.out.print("Введите математическое действие: ");
        sc.nextLine();
        String action=sc.nextLine();                     
        sc.close();
        int result=0;
        if (action.equals("+")) {
            result=numb_1+numb_2;                        
        }
        else if(action.equals("-")){
            result=numb_1-numb_2;                        
        }
        else if(action.equals("*")){
            result=numb_1*numb_2;                        
        }
        else if(action.equals("/") && numb_2 != 0){
            result=numb_1/numb_2;            
        }else{
            System.out.println("Не знаю, что вы от меня хотите");            
        }
        System.out.println(numb_1+action+numb_2+"="+result);
        logging(numb_1, action, numb_2, result);
    }
    public static void logging(int a, String act, int b, int res) {
        String fileName = "loggingCalc.txt";
        try {
            FileWriter wr=new FileWriter(fileName, true);  
            if (b==0 && act.equals("/")){
                wr.write(LocalDateTime.now()+": Ошибка, на ноль делить нельзя!");
            }    
            else {
                wr.write(LocalDateTime.now()+": "+a+act+b+"="+res);
            }                  
            wr.append("\n");
            wr.flush();
            wr.close();
            }
        catch(Exception ex){
            System.out.println(ex);
        }        
    }
}
