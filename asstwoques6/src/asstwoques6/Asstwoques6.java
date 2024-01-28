/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asstwoques6;

import java.util.Scanner;
public class Asstwoques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] originalarray = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            originalarray[i] = scanner.nextInt();
        }
        int[] evenarray = new int[n];
        int[] oddarray = new int[n];
        int evencount = 0;
        int oddcount = 0;
        for(int i = 0; i< n; i++){
            if(originalarray[i]%2 == 0){
                evenarray[evencount++] = originalarray[i];
            } else{
                oddarray[oddcount++] = originalarray[i];
            }
        }
        System.out.print("Original array is: ");
        displayarray(originalarray, n);
        System.out.print("Even array is: ");
        displayarray(evenarray, evencount);
        System.out.print("Odd array is: ");
        displayarray(oddarray, oddcount);
        scanner.close();
    }
    private static void displayarray(int[] array, int count){ 
        System.out.print("[");
        for(int i=0; i< count; i++){
            System.out.print(array[i]);
            if(i < count - 1){
                System.out.print(", ");
                
            }
        }
        System.out.println("]");
    }
    
}
