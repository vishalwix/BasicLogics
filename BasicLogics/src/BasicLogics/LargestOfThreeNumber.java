package BasicLogics;
class LargestOfThreeNumber{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        //Method 1        
        
        int largest = num3>( num1>num2 ? num1 : num2)? num3 : ( num1>num2 ? num1 : num2);

        System.out.println(largest+" is largest number");

        //Method 2
        System.out.println("Method 2");

        if(num1>num2 && num1>num3){
            System.out.println(num1+" is largest number");
        }else if(num2>num1 && num2>num3){
            System.out.println(num2+" is largest number");
        }else{
            System.out.println(num3+" is largest number");
        }
    }
}