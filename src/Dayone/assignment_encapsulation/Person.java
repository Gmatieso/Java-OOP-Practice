package Dayone.assignment_encapsulation;

public class Person {
    // private variables cannot be accessed directly... they can be accessed directly only using getters and setters.
    private String name;

    // Getter method
    public String getName(){
        return name;
    }

    //setter method
    public void setName(String newName){
        this.name = newName;
    }

    public void display(){
        System.out.println("Print name" + name);
    }



        public static void main(String[] args) {
            Person person = new Person();
            person.name = "Oops Encapsulation enforced!.. i cannot be printed. sorry try the getter and setters if you want to access me:";
            person.setName("Jack");
            System.out.println(person.getName());
            person.display();
        }

}
