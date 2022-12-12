import java.util.ArrayList;
import java.util.TreeMap;

//метод отсортирует строки по длине, используя treeMap. Строки одинаковой длины не должны потеряться
public class App3 {
    public static void main(String[] args) {
        sortStringBad();
        
    }
    public static void sortStringBad() {
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
        TreeMap<Integer, ArrayList<String>> list = new TreeMap<>();
        String[] sMas = s.substring(0, s.length()-1).split(" ");
        for (int i = 0; i < sMas.length; i++) {
            if(list.containsKey(sMas[i].length())){
                list.get(sMas[i].length()).add(sMas[i]);
            }
            else {
                ArrayList<String> lst = new ArrayList<>();
                lst.add(sMas[i]);
                list.put(sMas[i].length(), lst);
            }
            
        }
        for (var el : list.entrySet()) {
            System.out.println(el.getKey()+" "+el.getValue());
        }
    }
    
}
