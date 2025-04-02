package Dayone.assignment2.AppointmentSchedulingSystem;

public class Appointment {
    String description;
    String date;
    String name;


    Appointment(){

    }

    Appointment(String description, String date, String name){
        this.description = description;
        this.date = date;
        this.name = name;
    }

    // Methods ..
    void updateTime(String newTime){
        this.date = newTime;
    }

    void printAppointmentDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Description: " + this.description);
        System.out.println("Date: " + this.date);
    }

    public static void main(String[] args) {
        // Initialize
        Appointment newappointment = new Appointment("Love appointment", "2021-11-11", "Doctor Love");
        newappointment.printAppointmentDetails();

    }
}
