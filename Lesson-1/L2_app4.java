//метод, который вернет содержимое текущей папки в виде массива строк.  
// Написать метод, который запишет массив, возвращенный предыдузим методом в файл. обработать ошибки, 
// записать исключения в лог файл
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class L2_app4 {
    public static void main(String[] args) {
        String path = "C://Users/aeshe/OneDrive/Documents/Учеба/ГБ/Знакомство с Java/Lesson-8";
        ArrayList<String> result = getFolderContent(path);
        print(result);
        writeFolderContent(result);
    }
    public static ArrayList<String> getFolderContent(String path) {
        ArrayList<String> array = new ArrayList<>();
        try{
            File f1=new File(path);
            for (File file: f1.listFiles()) {
                        array.add(file.getName());
                    }
            return array;
        }
        catch(Exception e){
            System.out.println("Ошибка открытия файла");
            logger("Ошибка открытия файла");
        }            
        array.add("ошибка");
        return array;
    }
    public static void print(ArrayList<String> array) {
        for (String i: array){
            System.out.println(i);
        }
    }
    public static void writeFolderContent(ArrayList<String> array) {
        try{
            FileWriter fw=new FileWriter("Content.txt", true);
            for (String f : array) {
                fw.write(f);
                fw.append('\n');
            }
            fw.flush();    
            fw.close();        
        }
        catch(Exception e){
            System.out.println("Ошибка открытия файла");
            logger("Ошибка");
            array.add("ошибка"); 
        }            
               
    }
        public static void logger(String text){
            try {
                FileWriter log=new FileWriter("log.txt", true);
                log.write(LocalDateTime.now()+" - "+ text+"\n");
                log.flush();
                log.close();
            }
            catch(Exception e){
                System.out.println("ex");
            }
            
        }
    }
