// c) Write a program to accept contents into an Integer Array and print the frequency of
// each number in the order of their number of occurrences.

import java.util.Scanner;

class Frequency{
    public static void main(String[] args) {
        int n, a[];
        System.out.println("Enter the size of the array : ");
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();

            a = new int[n];

            System.out.println("Enter the elements in the array : ");
            for (int i = 0; i < n; i++){
                a[i] = s.nextInt();
            }
        }
        int f[][]= new int[n][3];
        int count = 1;
        boolean exist = false;
        for (int i = 0; i < n; i++){
            for (int k = i-1; k >= 0; k--){
                if (a[k] == a[i]){
                    exist = true;
                }
            }
            if (exist == false){
                for (int j = i+1; j < n; j++){
                    if (a[i] == a[j]){
                        count++;
                    }
                }
                f[i][0] = a[i];
                f[i][1] = count;
                System.out.println(a[i] + " frequency is " + count);
            }
            exist = false;
            count = 1;
        }
        
        // for (int i = 0; i < n; i++){
        //     int max = a[i];
        //     for (int j = i+1; j < n; j++){
        //         if (a[i])
        //     }
        // }
    }
}


// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         // Take input 'n' : Length of the array
//         System.out.println("\n Enter the value of n");
//         int n = sc.nextInt();
//         //Initialize array  
//         int [] arr = new int [n];
//             System.out.println("\n Enter the elements in the array");
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         //Array fr will store frequencies of element  
//         int [] fr = new int [n];  
//         int visited = -1;  
//         for(int i = 0; i < n; i++) {  
//             int count = 1;  
//             for(int j = i+1; j < n; j++) {  
//                 if(arr[i] == arr[j]) {  
//                     count++;  
//                     //To avoid counting same element again  
//                     fr[j] = visited;  
//                 }  
//             }  
//             if(fr[i] != visited)  
//                 fr[i] = count;  
//         }  
 
//         //Displays the frequency of each element present in array  
//         System.out.println("---------------------------------------\n");  
//         System.out.println(" Element | Frequency");  
//         System.out.println("---------------------------------------");  
//         for(int i = 0; i < fr.length; i++){  
//             if(fr[i] != visited)  
//                 System.out.println("\t" + arr[i] + "    |    " + fr[i]);  
//         }  
//         System.out.println("----------------------------------------");  
//     }
// }
