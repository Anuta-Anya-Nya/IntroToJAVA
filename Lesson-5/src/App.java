import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//справочник с номером паспорта и фамилией, вывести все номера которые имеют фамилию Иванов
public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> list = new HashMap<>();
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите номер и фамилию: ");
            String s = iScanner.nextLine();
            String[] sMap = s.split(" ");
            list.put(Integer.parseInt(sMap[0]), sMap[1]);
        }
        for (var el : list.entrySet()) {
            System.out.println(el.getKey()+" "+el.getValue());
        }
        System.out.println();
        for (var el : list.entrySet()) {
            if(el.getValue().equals("Иванов"))
            System.out.println(el.getKey()+" "+el.getValue());
        }
        iScanner.close();
    }
}

