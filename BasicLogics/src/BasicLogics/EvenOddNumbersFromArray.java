package BasicLogics;
class EvenOddNumbersFromArray{
    public static void main(String[] args) {
        int arr[] = {12,3,1,5,20,84,1,2};

        System.out.println("Even Numbers");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.print("  "+arr[i]);
            }
        }

        System.out.println();
        System.out.println("Odd Numbers");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                System.out.print("  "+arr[i]);
            }
        }
    }
}