package BasicLogics;
class SearchingElementInArray{
    public static void main(String[] args) {

        //Using linear Search logic
        
        int[] arr = {10,20,3,04,60,50,80};
        boolean flag = false;

        int key = 555;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println(key+" found at "+(i+1)+" position");
                flag = true;
                break;                
            }
        }
        if(flag==false)
            System.out.println(key+" not found");
    }
}