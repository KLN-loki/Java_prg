package First;

import java.util.Scanner;
public class Student {
    public void studentInfo() {
        try (Scanner s = new Scanner(System.in)) {
            String rno, name;
            double cgpa;
            System.out.println("Enter the roll number : ");
            rno = s.nextLine();
            System.out.println("Enter the name  : ");
            name = s.nextLine();
            System.out.println("Ente the cgpa : ");
            cgpa = s.nextInt();
            System.out.println("Roll no. :" + rno);
            System.out.println("Name :" + name);
            System.out.println("cGPA :" + cgpa);
        }
    }
}
