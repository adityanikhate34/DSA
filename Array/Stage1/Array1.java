public class Array1{
    public static void main(String[] args){
        int[] array = {1,5,22,99,7,6,56,85,32,97,1,2,5,8};
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        secondLargestElementInUnsortedArray1(array);
        checkArrayIsSorted(array1);
    }


    // Second Largest Element In The Array - Array is not sorted
    /*
    * Time complexity O(n)
    * Brute Force can be First Sort and give the n - 1 element
    * Similarly we also have Second Smallest element
    */
    static void secondLargestElementInUnsortedArray1(int[] array){
        int largest = array[0];
        int secondLargest = -1;

        for(int element : array){
            if(element > largest){
                secondLargest = largest;
                largest = element;
            }else if(element > secondLargest && element != largest){
                secondLargest = element;
            }
        }

        System.out.println("The second Largest element in the array is: "+ secondLargest);
    }


    // Check Array is sorted or not 
    static void checkArrayIsSorted(int[] array){
        boolean isSorted = true;
        for(int i=0;i<array.length -1; i++){
            if(array[i] > array[i+1]){
                isSorted = false;
            }
        }
        System.out.println("Is Array Sorted: "+ isSorted);
    }
}

