import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Map<String, String>> peopleInfo = makeMap(getStudents());
        printMessage(peopleInfo);
    }

    public static String getStudents() {
        String fileName = "Students.json";
        try{
            FileReader rd=new FileReader(fileName);
            StringBuilder text = new StringBuilder();
            while (rd.ready()) {
                int c = rd.read();                             
                text.append((char)c);               
            }             
            rd.close();
            String str=text.substring(1, text.length()-1);
            System.out.print(str);
            System.out.println("\n");
            return str;
        }
        catch(Exception ex){
            System.out.println(ex);
            return "ошибка";
        }
        
    }
    public static ArrayList<Map<String, String>> makeMap(String text) {        
        String[] students=text.substring(1, text.length()-1).split("\\},\\{");
        ArrayList<Map<String, String>> people=new ArrayList<Map<String, String>>();  
        for (String string : students) {            
            String[] student=string.split(",|:");
            Map<String, String> diction = new HashMap<String, String>();
            for (int i = 0; i < student.length; i+=2) {
                diction.put(student[i].replaceAll("\"", ""), student[i+1].replaceAll("\"", ""));
            }
            people.add(diction);
        }        
        for (Map<String,String> map : people) {
            System.out.println(map);
        }
        return people;        
    }
    public static void printMessage(ArrayList<Map<String, String>> arrMap) {
        for (Map<String,String> map : arrMap) {
            StringBuilder message = new StringBuilder();
            String text="Студент фамилия получил оценка по предмету предмет";
            String[] mes=text.split(" ");
            for (String word : mes) {
                if(map.containsKey(word)){
                    message.append(map.get(word));
                }
                else {
                    message.append(word);
                }
                message.append(" ");
            }
            System.out.println(message.toString());
        }
    }
}
