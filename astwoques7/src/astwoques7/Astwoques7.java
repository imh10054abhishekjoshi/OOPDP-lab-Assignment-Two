/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package astwoques7;

import java.util.Scanner;
public class Astwoques7 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the size of the array: ");
        int n = scanner.nextInt();
        int[] originalarray = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            System.out.print("Element " + (i+1) + ": ");
            originalarray[i] = scanner.nextInt();
        }
        System.out.print("Enter the position to divide the array (1 to " + n + "): ");
        int position = scanner.nextInt();
        if(position < 1 || position > n){
            System.out.println("Invalid position. Exiting program.");
            System.exit(0);
        }
        int[] firstpart = new int[position];
        int[] secondpart = new int[n - position];
        for(int i= 0; i< position; i++){
            firstpart[i] = originalarray[i];
        }
        for(int i = 0; i<n - position; i++){
            secondpart[i] = originalarray[i + position];
        }
        System.out.println("First part of the array:");
        displayarray(firstpart, position);
        System.out.println("Second part of the array:");
        displayarray(secondpart, n - position);
        checkanddisplaydup(firstpart, position);
        checkanddisplaydup(secondpart, n - position);
        scanner.close();
    }
    private static void displayarray(int[] array, int count){
        for(int i = 0; i< count; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    private static void checkanddisplaydup(int[] array, int count){
        System.out.println("Check for duplicates in the array:");
        boolean founddup = false;
        for(int i = 0; i< count - 1; i++){
            for(int j = i+1; j< count; j++){
                if(array[i] == array[j]){
                    founddup = true;
                    System.out.println("Duplicate found: " + array[i]);
                }
            }
        }
        if(!founddup){
            System.out.println("No duplicates found in the array.");
        }
    }
    
}
