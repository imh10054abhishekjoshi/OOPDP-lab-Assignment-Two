/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package astwoques3;

import java.util.Scanner;
public class Astwoques3 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the size of the array (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the total number of elements in the array: ");
        int totalelement = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i< totalelement; i++){
            System.out.print("Element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the index position for deletion (0 to " + (totalelement -1) + "): " );
        int loc = scanner.nextInt();
        if(loc < 0 || loc>= totalelement){
            System.out.println("Invalid index position for deletion.");
        } else{
            for(int i = loc; i< totalelement -1; i++){
                array[i] = array[i+1];
            }
            totalelement--;
            System.out.println("Array after deletion:");
            for (int i = 0; i< totalelement; i++){
                System.out.print(array[i] + " ");
            }
        }
        scanner.close();
    }
    
}
