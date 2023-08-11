package org.example;

public class ReverseArray {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {11, 22, 33, 44, 45};
        System.out.println("Original array is : ");

        //here using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order will be: ");

        //Loop through the array in reverse order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
