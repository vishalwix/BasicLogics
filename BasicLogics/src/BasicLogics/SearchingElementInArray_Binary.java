package BasicLogics;
class SearchingElementInArray_Binary{
    public static void main(String[] args) {
        int[] arr = {10,20,5,90,10,100,55};

        int low = 0;
        int high = arr.length-1;

        int key = 55;

        boolean status = false;

        while(low<=high){

            int mid = (low+high)/2;

            if(arr[mid]==key){
                System.out.println("Fount at "+mid);
                status = true;
                break;
            }

            if(arr[mid]<key){
                low= mid+1;
            }

            if(arr[mid]>key){
                high= mid-1;
            }
        }
        if(status){
            System.out.println("Not found");
        }
    }
}