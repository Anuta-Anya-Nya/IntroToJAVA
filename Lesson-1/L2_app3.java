//написать метод, который принимает слово и составляет строку из повтора этого слова 100 раз. другой метод записывает его в файл. обработать исключения
import java.io.*;

public class L2_app3 {
    public static void main(String[] args) {
        String testString=makeString("Love ");
        System.out.println(testString);
        printString(testString);
    }


    public static String makeString(String word) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append(word);
        }
        String result = str.toString();
        return result;
    }
    public static void printString(String str) {
        String fileName="Lesson2_Text.txt";
        
        
        try(FileWriter writer = new FileWriter(fileName, true))
        {           
            writer.write(str);  
            writer.flush();     
        }
        catch(IOException ex){             
            System.out.println(ex.getMessage());
        } 

    }
}
