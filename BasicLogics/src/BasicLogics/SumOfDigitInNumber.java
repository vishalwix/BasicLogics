package BasicLogics;
class SumOfDigitInNumber{
    public static void main(String[] args) {
        int num = 123345;

        int sum = 0;

        while(num!=0){
            int rem = num%10;
            sum = sum+rem;
            num = num/10;
        }

        System.out.println("Sum of Digit in number is :"+sum);
    }
}