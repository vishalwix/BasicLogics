package BasicLogics;
import java.util.*;

class RandomNumberGenerate {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(1000);

        System.out.println(num);


        //Method 2 ! In this we need to add common apache jar file.

        /*
        String rand_num = RandomStringUtils.randomNumeric(5);
        System.out.println(rand_num);
        */
    }
}