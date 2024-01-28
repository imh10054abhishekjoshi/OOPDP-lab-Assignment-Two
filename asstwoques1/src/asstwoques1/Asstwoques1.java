/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asstwoques1;
import java.util.Scanner;
public class Asstwoques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeofarray = scanner.nextInt();
        int[] array = new int[sizeofarray];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i< sizeofarray; i++){
            array[i] = scanner.nextInt();
        }
        System.out.print("The array entered is: [ ");
        for(int i = 0; i<sizeofarray; i++){
            System.out.print(array[i]);
            if(i<sizeofarray - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        scanner.close();
    }
}

