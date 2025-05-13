public class Palindrome Number {
    public boolean isPalindrome(int x) {
        
        boolean isPalindromeNum;

        if (x<0){

            isPalindromeNum = false;
            return isPalindromeNum;
        }

        int num = x;
        int revNum=0;
        int remainder = num % 10;
        int tenthVal=1;

        while(num>=10){

            remainder = num % 10;

            revNum = (revNum * tenthVal) + remainder;

            num = num / 10;

            tenthVal=10;

        }

        revNum = (revNum * 10) + num;

        System.out.println(revNum);

        if(revNum == x){
            isPalindromeNum = true;
        }
        else{
            isPalindromeNum = false;
        }

        return isPalindromeNum;
    }
}
