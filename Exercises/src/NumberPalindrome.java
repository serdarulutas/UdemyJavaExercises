public class NumberPalindrome
{

    public static void main(String[] args) {
        System.out.println(isPalindrome(11212  ));
    }

    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        String txt = ""+number;
        int length = txt.length();
        int half = length / 2;
        boolean palindromeNumber = true;
        for (int i = 0;i<length;i++){
            if (i > half)
                break;
            int corresponding = length - i - 1;

            if (txt.charAt(i) != txt.charAt(corresponding)){
                palindromeNumber = false;
                break;
            }
        }
        return palindromeNumber;
    }
}
