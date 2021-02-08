package BasicLogics;
import java.util.*;

class SwapArray {

    Scanner sc = new Scanner(System.in);

    int[] getArray(int size, int[] arr){
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    void display(int size, int[] arr){
        for(int i=0; i<size; i++){
            System.out.println(" "+arr[i]);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];

        SwapArray sa = new SwapArray();
        System.out.println("Enter array elements : ");
        arr = sa.getArray(size,arr);

        System.out.println("Display Array : ");
        sa.display(size,arr);
    }
}