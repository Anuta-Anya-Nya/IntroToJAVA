
//принимает строку и определяет полендром или нет
public class L2_app2 {
    public static void main(String[] args) {
        System.out.println(polindrom("dasnsad"));
    }
    public static boolean polindrom(String word){
        String str = word;
        char[] array = str.toCharArray();
        char[] array2 = str.toCharArray();
        
        for (int i = 0; i < array.length/2; i++) {
            char temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            
            if (array2[i] != array[i]){
                return false;
            }
        }
        return true;
        
    }
}
