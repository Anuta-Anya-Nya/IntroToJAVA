import java.util.List;

//продумайте струтуру класса кот. 
// какие поля и методы будут актуальны для приложения
// 1. информационной системы ветеринарной клиники
// 2. архивом выставки кошек
// 3. информационной системы театра кошек

public class Cat {
    int age;
    String name;
    List<String> seekStory;
    String color;
    String nameDoctor;
    //Doctor nameDoctor если есть класс Doctor и устанавливаем ссылку на обьект доктора
    public Cat(String name){ //какие поля передавать при создании конструктора
        this.name = name; //
    }
    public void invite() {
        
    }
    @Override
    public String toString() {
        return "Cat "+name+" age: "+age+" color: "+color;
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj)
        {return true;}
        if(!(obj instanceof Cat)) //если объект не является классом cat
        {return false;}
        Cat cat = (Cat) obj; //явно преобразовали к объекту к котику
        if(this.name.equals(cat.name) && this.age == cat.age){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return age+name.hashCode();
    }
}
