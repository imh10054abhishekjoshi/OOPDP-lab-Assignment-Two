/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asstwoques2;
import java.util.Scanner;

public class Asstwoques2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3};
        System.out.print("Original array is: [");
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i]);
            if(i<array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Enter the position for insertion: ");
        int position = scanner.nextInt();
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();
        if(position >= 0 && position <= array.length){
            int[] newarray = new int[array.length + 1];
            for(int i= 0; i< position; i++){
                newarray[i] = array[i];
            }
            newarray[position] = element;
            for(int i = position + 1; i< newarray.length; i++){
                newarray[i] = array[i-1];
            }
            array = newarray;
            System.out.print("Array after insertion: [");
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i]);
                if(i < array.length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } else{
            System.out.println("Invalid position for insertion of value.");
        }
        scanner.close();
    }
}
    
    

