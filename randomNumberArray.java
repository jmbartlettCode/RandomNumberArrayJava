/*
 * Josh Bartlett
 * Purpose: Fill an int array with random numbers and then print the array
 * May 26, 2019
 * Bellevue University
 * randomNumberArray.java
 */

public class randomNumberArray {
    public static void main(String[] args){
        
        // Declare and create an int array with a lenght of 10
        int[] intArray = new int[10];
        
        // for loop to fill the array with random numbers
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = (int) (Math.random() * 100);
        }
        
        // for loop to print the random numbers in the array 
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }
}
