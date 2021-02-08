package BasicLogics;
class FactorialOfNumbers{
    public static void main(String[] args) {
        
        // Method 1
        int num = 5;
        int fact = 1;

        for(int i=1; i<=5; i++){
            fact = fact*i;
        }
        System.out.println(fact);

        //Method 2
        num = 5;
        fact = 1;

        for(int i=num; i>=1; i--){
            fact = fact*i;
        }
        System.out.println(fact);

    }
}