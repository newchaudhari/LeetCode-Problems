package arrays;

public class PalindromeNumber {
    public static void main(String[] args) {
   /*     int x=121;
        int reverseNumber=0;
        while(x!=0){
            int remainder=x%10;
            reverseNumber=reverseNumber*10+remainder;
            x=x/10;
        }
        System.out.println(reverseNumber);*/
        System.out.println(isPalindrome(111));

    }
    public static boolean isPalindrome(int x) {
        int checkNumber=x;
        if(x<0){
            return false;
        }
        int reverseNumber=0;
        while(x!=0){
            int remainder=x%10;
            reverseNumber=reverseNumber*10+remainder;
            x=x/10;
        }
        if(checkNumber==reverseNumber){
            return true;
        }
        return false;
    }

}
