import java.util.Scanner;

/*
b) Write a program that accepts an array of integers and print those which are both odd
and prime. If no such element in that array print “Not found”
*/


class ArrayPrimeOdd {
    public static void main(String[] args) {
        int n;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the size of the array : ");
            n = scan.nextInt();

            int a[] = new int[n];
            int i ;
            System.out.println("Enter the elements in the array : ");
            for (i = 0; i < n; i++){
                a[i] = scan.nextInt();
            }
            for (i = 0; i < n;i++){
                // int count = 0;
                if (a[i] > 1){
                    int count = 0;
                    for (int j = 2; j < a[i]; j++){
                        if (a[i]/j == 0){
                            count++;
                        }
                    }
                    System.out.println(count);
                    if (count == 0){
                        System.out.println(a[i] + " is a prime and odd.");
                    }
                }    
            }
        }
        
    }
    
}