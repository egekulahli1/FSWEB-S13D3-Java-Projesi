import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        person.pets= new String[2];
        person.pets[0]="cat";
        person.pets[1]="dog";
        System.out.println(Arrays.toString(person.pets));
        person.salary = 20000;
        System.out.println(person);
        System.out.println("***********************************************");

        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());

        System.out.println("***********************************************");

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area=" + wall.getArea());


    }
}