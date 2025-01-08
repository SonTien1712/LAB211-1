/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author PC
 */
import java.util.Scanner;
import java.util.Random;
public class LinearSearch {
    public int linearSearch ()){
    private int[] array;
    private int arraySize;
}
    public void main (String []args){
        Scanner scanner= new Scanner(System.in);
        Random random=new Random();
        System.out.println("Enter number of array: ");
        int arraySize=scanner.nextInt();
        if(arraySize<=0){
        System.out.println("Please input positive integer! ");
        return;
        }
        int[] array=new int[arraySize];
        for(int i=0; i<arraySize;i++){
        array[i]=random.nextInt(100)+1;
       
        System.out.print("Generated array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Enter the number to search in the array: ");
        int searchNumber = scanner.nextInt();

        int index = linearSearch(array, searchNumber);

        if (index != -1) {
            System.out.println("Number " + searchNumber + " found at index " + index + ".");
        } else {
            System.out.println("Number " + searchNumber + " not found in the array.");
        }

        scanner.close();
        }
    }
        
    }


