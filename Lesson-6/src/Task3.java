import java.util.HashSet;
import java.util.Set;

//сщздать класс Cat, создать несколько экземпляров класса и распечатать
//создать hashSet c экземплярами котов, создать похожие экземпляры, переписать метод equals

public class Task3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka"); // конструктрор, который создает метод класса
        cat1.invite();
        cat1.age = 10;
        cat1.color = "white";

        Cat cat2 = new Cat("Barsik");
        cat2.age=5;
        cat2.color="black";

        Cat cat3 = new Cat("Barsik");
        cat3.age=5;
        cat3.color="black";

        Set<Cat> setCat=new HashSet<>();
        setCat.add(cat1);
        setCat.add(cat2);
        setCat.add(cat3);


        System.out.println(setCat);
        System.out.println(cat2.equals(cat3));
        
    }
}
