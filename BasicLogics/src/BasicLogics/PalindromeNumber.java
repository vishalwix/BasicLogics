package BasicLogics;
import java.util.*;

class PalindromeNumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int org_num = num;
        int rev = 0;

        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        if(org_num==rev){
            System.out.println(rev+" is palindrome");
        }else {
            System.out.println(rev+" not is palindrome");
        }

    }
}