package Dayone.assignment_encapsulation;

public class Person {
    // private cannot be accessed directly...
    private String name;

    // Getter method
    public String getName(){
        return name;
    }

    //setter method
    public void setName(String newName){
        this.name = newName;
    }



        public static void main(String[] args) {
            Person person = new Person();
            person.setName("Jack");
            System.out.println(person.getName());
        }

}
