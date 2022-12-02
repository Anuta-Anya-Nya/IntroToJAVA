import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//заполни список названием планет солнечной системы в произвольном порядке с повторениями.
//вывести название каждой планеты и количество повторений в списке
//задача 2- удалить повторяющиеся значения
public class App2 {
    public static void main(String[] args) {
        String[] planets = {"Меркурий","Марс", "Венера", "Юпитер", "Земля", "Сатурн"};
        ArrayList<String> result = new ArrayList<>();
        Random rnd=new Random();
        for (int i = 0; i < 20; i++) {
            result.add(planets[rnd.nextInt(0, planets.length)]);
        }
        System.out.println(result);
        Set<String> mySet = new HashSet<String>(result);
        for (String s : mySet) {
            System.out.println(s+" "+Collections.frequency(result, s));
        }
        // Collections.sort(result);
        // System.out.println(result);
        // int count=0;
        // for (int i = 0; i < result.size()-1; i++) {
        //     count ++;
        //     if(result.get(i) != result.get(i+1)) {
        //         System.out.print(result.get(i)+": "+ count+"\n");
        //         count=0;
        //     }  
        //     if(i+1 == result.size()-1){
        //         count++;
        //         System.out.print(result.get(i)+": "+ count+"\n");
        //     }
            
        // }
        ArrayList<String> result2 = new ArrayList<>();        
        for (int i = 0; i < 20; i++) {
            result2.add(planets[rnd.nextInt(0, planets.length)]);
        }
        System.out.println(result2);
        Collections.sort(result2);
        System.out.println(result2);
        // int i=0;
        // while(i<result2.size()-1){
        //     if(result2.get(i)==result2.get(i+1)){
        //         result2.remove(result2.get(i));
        //         i--;
        //     }
        //     i++;
        // }
        for (int i = 0; i < result2.size()-1; i++) {
            if(result2.get(i) == result2.get(i+1)){
                result2.remove(i);
                i--;
            }
        }
        System.out.println(result2);
    }
}
