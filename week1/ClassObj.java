/**
b) Write a program using classes and objects in java?
*/

import java.util.Scanner;

class SampleClass{
    int n;
    void EvenOdd(){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number : ");
            n = scan.nextInt();
        }
        if (n/2 == 0){
            System.out.println(n + " is a even.");
        }
        else {
            System.out.println(n + " is a odd.");
        }
    }
}
class ClassObj{
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.EvenOdd();
    }
}