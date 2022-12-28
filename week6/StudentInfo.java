package week6;
/**
 * 6) a) Design a package to contain the class Student that contains data members such as
name, roll number and another package contains the interface Sports which contains some
sports information. Import these two packages in a package called Report which process
both Student and Sport and give the report.
 */
import First.*;
import Second.*;

class sports2 implements Sports {
    public void display() {
        System.out.println("Cricket");
        System.out.println("Volley ball");
        System.out.println("Foot ball");
    }
}

class week7a {
    public static void main(String[] args) {
        sports2 s = new sports2();
        s.display();
        Student st = new Student();
        st.studentInfo();
    }
}