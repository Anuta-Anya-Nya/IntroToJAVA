import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

//Написать программу, определяющую правильность расстановки скобок в выражении.
//a+(d*3) - истина
// \[a+(1*3) - ложь
// \[6+(3*3)] - истина
// {a}\[+\]{(d*3)} - истина
// <{a}+{(d*3)}> - истина
// {a+]}{(d*3)} - ложь
public class App3 {
    public static void main(String[] args) {
        String str="{a+]}{(d*3)}";
        System.out.println(checkCorrect(str));                 
    }
    public static Boolean checkCorrect(String str) {
        String[] mathExp=str.split("");
        String[] bracStart = {"(","[","{","<"};
        String[] bracEnd = {")","]","}",">"};
        ArrayList<String> symbStart = new ArrayList<>(Arrays.asList(bracStart)); 
        ArrayList<String> symbEnd = new ArrayList<>(Arrays.asList(bracEnd)); 
        ArrayDeque<String> brackets = new ArrayDeque<String>();
        for (String string : mathExp) {
            if(symbStart.indexOf(string) != -1){  //если символ найден в списке открывающих скобок
                brackets.addFirst(symbEnd.get(symbStart.indexOf(string))); // кладем закрывающуюся скобку
            }
            else if (symbEnd.indexOf(string) != -1){//если символ найден в списке закрывающих скобок
                String elem=brackets.pollFirst(); // проверяе равен ли он скобке сверху стека, удаляем если равен и идем дальше
                if( !string.equals(elem)){
                    return false;
                }                
            }            
        }
        return brackets.isEmpty();   // все ли скобки удалили из стека     
        
    }

    // public static Map<String, Integer> makeMap(String expression) {
    //     String[] mathExp=expression.split("");
    //     Map<String, Integer> expSymbols = new HashMap<>(); 
    //     int count = 0;     
    //     for (String string : mathExp) {
    //         if(expSymbols.containsKey(string)){
    //             count = expSymbols.get(string)+1;
    //             expSymbols.replace(string, count); 
    //         }
    //         else {
    //             expSymbols.put(string, 1);
    //         }
    //     }
    //     return expSymbols;
    // }

    // public static Boolean checkCorrect(String expression) {
    //     Map<String, Integer> expSymbols = makeMap(expression);
    //     String[] symbols = {"(", ")", "[", "]", "{", "}", "<", ">"}; 
        
    //     for (int i = 0; i < symbols.length-1; i+=2) {
    //         if(expSymbols.get(symbols[i]) != expSymbols.get(symbols[i+1])){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    
    
}
