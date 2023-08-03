public class Person {
    String firstname;
    String lastname;
    int age;
    double salary;
    boolean isMarried;
    String [] pets;

    public Person(String firstname, String lastname, int age) {
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }
    public Person(String firstname, String lastname, int age, double salary, boolean  isMarried, String[] pets) {
        this(firstname, lastname, age);
        this.salary=salary;
        this.isMarried=isMarried;
        this.pets=pets;
    }
    public String getFirstName(){
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <=19;
    }

    @Override
    public String toString() {
        return String.format("Firstname: %s, Lastname: %s, Age: %d, salary: %f", firstname, lastname, age, salary);
    }
}
