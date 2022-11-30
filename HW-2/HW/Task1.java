import java.io.FileWriter;

//сортировка пузырьком
public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[] {100,0,333,8,3,4,10,0};
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) {
                if(numbers[j]>numbers[j+1]){
                int temp=numbers[j];
                numbers[j]=numbers[j+1];
                numbers[j+1]=temp;
                }               
            }
            logging(numbers);
        }        
    }
    public static void logging(int[] arr) {
        String fileName = "logging.txt";
        try {
            FileWriter wr=new FileWriter(fileName, true);
            for (int i : arr) {
                wr.write(i+",");
                }
            wr.append("\n");
            wr.flush();
            wr.close();
            }
        catch(Exception ex){
            System.out.println(ex);
        }        
    }
}
