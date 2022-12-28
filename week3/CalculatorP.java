/**
 * b) Create a new class called Calculator with the following methods:
 A static method called powerInt(int num1,int num2) This method should return num1 to the
power num2.
A static method called powerDouble(double num1,double num2). This method should return
num1 to the power num2.
 Invoke both the methods and test the functionality. Also count the number of objects created
 */
import java.util.Scanner;
import java.lang.Math;

class Calculator{
    int method1(int num1, int num2){
        return (int) (Math.pow(num1, num2));
    }

    double method2(double num1, double num2){
        return (Math.pow(num1, num2));
    }


}

class CalculatorP{
    public static void main(String[] args) {
        double num1, num2;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter num1 : ");
            num1 = s.nextDouble();
            System.out.println("Enter num2 : ");
            num2 = s.nextDouble();
        }
        int intnum1 = (int) num1;
        int intnum2 = (int) num2;
        
        Calculator obj = new Calculator();
        int intpower = obj.method1(intnum1, intnum2);
        double Dpower = obj.method2(num1, num2);
        System.out.println("integer power is : " + intpower + "\n");
        System.out.println("Double power is : " + Dpower + "\n");
    }
}