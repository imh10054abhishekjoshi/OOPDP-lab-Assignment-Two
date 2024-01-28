/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package astwoques4;

import java.util.Scanner;
public class Astwoques4 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i< n; i++){
            System.out.print("Element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int element = scanner.nextInt();
        boolean found = false;
        for(int i = 0; i< n; i++){
            if(array[i] == element){
                found = true;
                System.out.println("Element " + element + " found at index " + i);
                break;
            }
        }
        if(!found){
            System.out.println("Element " + element + " not found in the array.");
        }
        scanner.close();
    }
    
}