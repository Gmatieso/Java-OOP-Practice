package Dayone;

public class Students {
    public Integer SID;
    public String Sname;
    public Integer Sub1;
    public Integer Sub2;
    public Integer Sub3;


    public void getStuData(Integer StudentId, String StudentName){
        SID = StudentId;
        Sname = StudentName;
    }

    public void getStuMarks(Integer subject1, Integer subject2, Integer subject3){
        Sub1 = subject1;
        Sub2 = subject2;
        Sub3 = subject3;
    }

    public void   getTotalMarks(){
       int  total = Sub3 + Sub1 + Sub2;
       System.out.println("Student ID:" + SID);
       System.out.println("Student Name:" + Sname);
       System.out.println("Total Marks:" + total);

    }



    public static void main(String[] args) {
        Students stu = new Students();
        stu.getStuData(1036653,"Joy Kairetu");
        stu.getStuMarks(40,59,30);
        stu.getTotalMarks();





        Students stu2 = new Students();
        stu2.getStuData(103897,"Mark Gathere");
        stu2.getStuMarks(20,60,40);
        stu2.getTotalMarks();

    }
}
