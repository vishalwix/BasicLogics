package BasicLogics;
class MinMaxInArray {
    public static void main(String[] args) {
        
        int[] arr = {10,20,50,100,30,40};

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];

            if(arr[i]<min)
                min = arr[i];
        }

        System.out.println("Max Number is : "+max);
        System.out.println("Min Number is : "+min);
    }
}