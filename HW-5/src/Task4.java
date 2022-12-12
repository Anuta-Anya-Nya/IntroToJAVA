//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
public class Task4 {
    public static void main(String[] args) {
        start();
    }
    public static String start() {
        
    
            // printArray(chessField);
         
        for (int i = 0; i < 8; i++){
            for(int j=0; j < 8; j++){
                int[][] chessField= { {0,0,0,0,0,0,0,0}, 
                              {0,0,0,0,0,0,0,0}, 
                              {0,0,0,0,0,0,0,0}, 
                              {0,0,0,0,0,0,0,0}, 
                              {0,0,0,0,0,0,0,0}, 
                              {0,0,0,0,0,0,0,0}, 
                              {0,0,0,0,0,0,0,0}, 
                              {0,0,0,0,0,0,0,0} };
                
                int count = countFerz(chessField, i, j);
                if (count != 8){
                    System.out.println("Попробуем еще раз.");
                } else{
                    System.out.println("Готово! 8 ферзей установлены!");
                    return "Список положений ферзей"; //доделать
                }  
            }
        }
        return "не получилось расставить 8 ферзей";
    }
        
        
        
        
    
    // public static void printArray(int[][] arr) {
    //     for (int i = 0; i < arr.length; i++){
    //         for(int j=0; j < arr[i].length; j++){
    //             System.out.printf("%d ", arr[i][j]);
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();
    // }
    public static int[][] fillField(int[][] field, int a, int b) {
        System.out.println("Ферзь стоит на позиции ["+a+","+b+"].");
        for (int i = 0; i < field.length; i++) {
            field[a][i]=1;
            field[i][b]=1;
        }
        int j=1;
        while(a+j<field.length && b+j<field.length){
            field[a+j][b+j]=1;
            j++;
        }
        j=1;
        while(a-j>=0 && b-j>=0){
            field[a-j][b-j]=1;
            j++;
        }
        j=1;
        while(a-j>=0 && b+j<field.length){
            field[a-j][b+j]=1;
            j++;
        }
        j=1;
        while(a+j<field.length && b-j>=0){
            field[a+j][b-j]=1;
            j++;
        }           
        return field;
    }
    public static int[] findPositionF(int[][] arr) {
        int index1=-1;
        int index2=-1;
        for (int i = 0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                     if(arr[i][j]==0){
                        index1=i;
                        index2=j;
                        return new int[] { index1, index2 };
                     }                
            }
        }
        return new int[] { index1, index2 };
    }
    public static int countFerz(int[][] arr, int a, int b) {
        int count = 0;
            while(a != -1 && b != -1){
                arr=fillField(arr, a, b);
                // printArray(chessField);
                int[] posFerz=findPositionF(arr);
                a=posFerz[0];
                b=posFerz[1];
                count++;
            }
        System.out.println("Стоит ферзей: "+ count);
        return count;
    }
}
