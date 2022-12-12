import java.util.HashMap;
import java.util.Map;

//метод проверяет является ли слово изоморфным или нет. буква не меняется, может остаться
//foo-bar - false
//paper - title - true
// add-egg true
// note-code true
public class App2 {
    public static void main(String[] args) {
        System.out.println(isIzomorph("foo", "bar"));
    }
        
    public static Boolean isIzomorph(String s1, String s2) {
        if(s1.length()!=s2.length()) 
            return false;                        
        if(s1.equals(s2)) 
            return true;           
        Map<Character, Character> subWord=new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char a=s1.charAt(i);
            char b=s2.charAt(i);
            if(subWord.containsKey(a) && subWord.get(a) !=b)
                return false;    
            else 
                subWord.put(a,b);
        }
        return true;
    }
    
}
