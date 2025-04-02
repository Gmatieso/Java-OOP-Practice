package DayThree;

class Bank {
    double rateOfInterest(){
        return 0;
    }
}

class SBI extends Bank {
    double rateOfInterest(){
        return 10.0;
    }
}

class ICIC extends Bank {
    double rateOfInterest(){
        return 20.5;
    }
}

public class MethodOveriding {
        /*
        // Rewrites the methods in child classes
            method definition should be same
            body should be changed
        Overloading:
                1. within single class and mulitple classes inheritance
                2. definition should be changed
         Overriding:
                1. Only in inheritance(multiple classes)
                2. definition should NOT be changed
         */
    public static void main(String[] args) {

        SBI sbi = new SBI();
        System.out.println(sbi.rateOfInterest());

        ICIC icic = new ICIC();
        System.out.println(icic.rateOfInterest());


    }
}
