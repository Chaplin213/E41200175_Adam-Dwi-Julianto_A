/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author ADAM
 */
public class Selectionsort {
    public static void main(String[] args){
        int[]numbers = {10,2,4,6,7};
        
        sort(numbers);
        printArray(numbers);
    }
    public static int[] sort(int[] A){
        for(int i = 0; i <A.length-1; i++){
            int minIndex =i;
            for(int j = i + 1; j<A.length; j++){
                if(A[j] < A[minIndex]){
                    minIndex = j;
                }
            }
            int temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
        }
        return A;
    }
    public static void printArray(int[] A){
        for(int i =0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }
}
