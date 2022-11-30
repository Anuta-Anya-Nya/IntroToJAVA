import java.util.Scanner;
//дано четное число, и символы с1 и с2. на четное место ставим один символ, на нечентое другой, длину вводит пользователь
public class app1 {
    public static void main(String[] args) {
        Character c1='a';
        Character c2 = 'b';
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        StringBuilder bilder = new StringBuilder();
        for (int i=0; i<n; i++) {
            if (i%2==0){
                bilder.append(c1);                
            }
            else {
                bilder.append(c2);
            }
            
        }
        System.out.println(bilder.toString());
    }
    
}