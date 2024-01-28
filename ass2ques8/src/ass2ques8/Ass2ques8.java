/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ass2ques8;

import java.util.Scanner;
public class Ass2ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i= 0; i<n; i++){
            array[i] = scanner.nextInt();
        }
        int peakelement = findpeakelement(array);
        System.out.println("The peak element in the array is: " + peakelement);
        scanner.close();
    }
    private static int findpeakelement(int[] array){
        for(int i=1; i< array.length - 1; i++){
            if(array[i] >= array[i-1] && array[i]>= array[i+1]){
                return array[i];
            }
        }
        if(array[0] >= array[1]){
            return array[0];
        }
        if (array[array.length - 1] >= array[array.length - 2]){
            return array[array.length - 1];
        }
        return -1;
    }
}

