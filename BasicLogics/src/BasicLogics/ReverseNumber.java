package BasicLogics;
import java.util.*;

class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number to reverse");
        int num = sc.nextInt();

        int rev = 0;

        while(num!=0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
            System.out.println("Remender is : "+rem);
        }
        System.out.println("Reversed Number is : "+rev);

        System.out.println("Enter Number to reverse");
        System.out.println("Reverse Using String Buffer :");
        num = sc.nextInt();
        StringBuffer s = new StringBuffer(String.valueOf(num));
        StringBuffer reverse = s.reverse();
        System.out.println("Reversed Number is : "+reverse);
    }
}