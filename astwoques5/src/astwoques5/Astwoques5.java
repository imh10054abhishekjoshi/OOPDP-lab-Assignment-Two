/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package astwoques5;

import java.util.Scanner;
public class Astwoques5 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            System.out.print("Element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Duplicate elements and their frequencies: ");
        for(int i=0; i< array.length; i++){
            if(array[i] != -1){
                int count = 1;
                for(int j= i+1; j< array.length; j++){
                    if(array[i] == array[j]){
                        count++;
                        array[j] = -1;
                    }
                }
                if(count>1){
                    System.out.println("Element: " + array[i] + ", Frequency: " + count);
                }
            }
        }
        scanner.close();
    }
    
}
