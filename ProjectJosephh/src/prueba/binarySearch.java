/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Arrays;

/**
 *
 * @author josep
 */
public class binarySearch {

    public static boolean binarySearch(int[] numbers, int numberToSearch) {

        int size = numbers.length;  // Número de elementos
        int middle = size / 2;        // Mitad del array

        System.out.println("Size: " + size);
        System.out.println("Middle: " + middle);
        System.out.println("Array: " + Arrays.toString(numbers));

        if (numbers[middle] == numberToSearch) {
            return true;
        } else if (size == 1) {
            return false;
        } else if (numbers[middle] > numberToSearch) {
            return binarySearch(Arrays.copyOfRange(numbers, 0, middle), numberToSearch);
        } else {
            return binarySearch(Arrays.copyOfRange(numbers, middle + 1, size), numberToSearch);
        }

    }
}
