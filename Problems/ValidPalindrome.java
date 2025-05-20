public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        String palinStr="";

        if(s.isEmpty()){
            return true;
        }

        for(int i=0; i < s.length() ; i++){

            char tempChr = s.charAt(i);

            if(Character.isLetterOrDigit(tempChr)){

                palinStr+=Character.toLowerCase(tempChr);

            }
        }

        for(int j=0 ; j<palinStr.length() ; j++){

            if(palinStr.charAt(j) != palinStr.charAt(palinStr.length() -j-1)){

                return false;
            }
        }

        return true;
    }
}
