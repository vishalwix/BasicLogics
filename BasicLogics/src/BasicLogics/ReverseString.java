package BasicLogics;
class ReverseString {
    public static void main(String[] args){
        String str = "Vishal";
        String rev = "";

        int len = str.length();

        // Method 1

        for(int i=len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String is: "+rev);

        //Method 2

        str = "Kanu";
        len = str.length();
        rev = "";

        char arr[] = str.toCharArray();

        for(int i=len-1; i>=0; i--){
            rev = rev + arr[i];
        }
        System.out.println("Reversed String is: "+rev);

        //Method 3

        str = "Mrunal";
        len = str.length();
        rev = "";

        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reversed String is: "+sb.reverse());

    }
}