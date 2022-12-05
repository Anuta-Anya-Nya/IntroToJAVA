import java.util.HashMap;
import java.util.Map;

//Написать программу, определяющую правильность расстановки скобок в выражении.
//a+(d*3) - истина
// \[a+(1*3) - ложь
// \[6+(3*3)] - истина
// {a}\[+\]{(d*3)} - истина
// <{a}+{(d*3)}> - истина
// {a+]}{(d*3)} - ложь
public class App3 {
    public static void main(String[] args) {
        String str="<{a}+{(d*3)}>";
        System.out.println(checkCorrect(str));                 
    }

    public static Map<String, Integer> makeMap(String expression) {
        String[] mathExp=expression.split("");
        Map<String, Integer> expSymbols = new HashMap<>(); 
        int count = 0;     
        for (String string : mathExp) {
            if(expSymbols.containsKey(string)){
                count = expSymbols.get(string)+1;
                expSymbols.replace(string, count); 
            }
            else {
                expSymbols.put(string, 1);
            }
        }
        return expSymbols;
    }

    public static Boolean checkCorrect(String expression) {
        Map<String, Integer> expSymbols = makeMap(expression);
        String[] symbols = {"(", ")", "[", "]", "{", "}", "<", ">"}; 
        
        for (int i = 0; i < symbols.length-1; i+=2) {
            if(expSymbols.get(symbols[i]) != expSymbols.get(symbols[i+1])){
                return false;
            }
        }
        return true;
    }
    
    
}
