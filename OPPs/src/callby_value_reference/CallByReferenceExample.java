package callby_value_reference;

public class CallByReferenceExample {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Before calling method, person = " + person.getName());
        changeName(person);
        System.out.println("After calling method, person = " + person.getName());
    }
    
    public static void changeName(Person p) {
        p.setName("Bob"); // Changes the name of the Person object
        System.out.println("Inside method, person = " + p.getName());
    }
}

class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
