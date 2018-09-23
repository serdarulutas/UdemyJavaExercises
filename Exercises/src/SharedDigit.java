public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));

    }

    public static boolean hasSharedDigit(int num1, int num2){
        if ((num1 < 10) || (num1 > 99))
            return false;
        if ((num2 < 10) || (num2 > 99))
            return false;

        String txt1 = Integer.toString(num1);
        String txt2 = Integer.toString(num2);
        for (int i=0;i<txt1.length();i++){
            for (int j=0;j<txt2.length();j++){
                if (txt1.charAt(i) == txt2.charAt(j))
                    return true;
            }
        }

        return false;
    }
}
