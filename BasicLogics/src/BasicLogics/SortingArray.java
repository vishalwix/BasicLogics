package BasicLogics;
import java.util.*;

class SortingArray{
    public static void main(String[] args) {
        
        //Method 1        
        int[] arr = {30,20,5,1,50,8};

        int len = arr.length;

        for(int i=0; i<len-1; i++){
            for(int j=0; j<len-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        System.out.println("After sorting array : "+Arrays.toString(arr));

        //Method 2 (Built in method)
        int[] arr1 = {10,20,95,12,32};

        System.out.println("Before sorting array : "+Arrays.toString(arr1));

        Arrays.parallelSort(arr1);

        System.out.println("After sorting array : "+Arrays.toString(arr1));




    }
}