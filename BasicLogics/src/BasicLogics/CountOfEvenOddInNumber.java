package BasicLogics;

class CountOfEvenOddInNumber{
    public static void main(String[] args) {
        int count_odd = 0;
        int count_even = 0;

        int num = 1122;

        while(num!=0){
            int rem = num%10;
            if(rem%2==0){
                count_even++;
            }else{
                count_odd++;
            }
            num = num/10;
        }
        System.out.println("Even count is : "+count_even);
        System.out.println("Odd count is : "+count_odd);
    }
}