/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author PC
 */
import java.util.Random;

public class LinearSearch {
    private int[] array;

    public LinearSearch(int size) {
        array = new int[size];
        generateRandomArray();
    }

    private void generateRandomArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; 
        }
    }

    public int search(int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public void displayArray() {
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displaySearch(int size, int target) {
        LinearSearch linearSearch = new LinearSearch(size);
        linearSearch.displayArray();

        int index = linearSearch.search(target);
        if (index != -1) {
            System.out.println("Number " + target + " found at index: " + index);
        } else {
            System.out.println("Number " + target + " not found.");
        }
    }
}
