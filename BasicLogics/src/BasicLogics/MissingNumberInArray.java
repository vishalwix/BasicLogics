package BasicLogics;
class MissingNumberInArray{
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};

        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<arr.length-1; i++){
            sum1 = sum1+arr[i];
        }

        for(int i=0; i<5; i++){
            sum2 = sum2+i;
        }

        int diff = sum2-sum1;
        System.out.println("Missing Number is : "+diff);
    }
}