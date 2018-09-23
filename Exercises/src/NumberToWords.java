public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(10));
        System.out.println(reverse(10));
        numberToWords(10);

    }


    public static int getDigitCount(int num){
        if (num < 0){
            return -1;
        }
        int count = 1;
        for (int i = 10;i<=num;i=i*10) {
            if (i <= num) {
                count++;
            }
        }

        return count;
    }



    public static int reverse(int num){
        int result = 0;

        boolean isNegative = num < 0;
        int num2 = Math.abs(num);
        String txt = Integer.toString(num2);
        int currBase = 1;
        for (int i=0;i<txt.length();i++){
            result += Integer.parseInt(Character.toString(txt.charAt(i))) * currBase;
            currBase *=10;
        }
        if (isNegative)
            result *= -1;
        return result;
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }
        int digits = getDigitCount(number);
        int num2 = reverse(number);

        int len = Integer.toString(num2).length();
        int toPrintZeros = digits-len;

        while(num2 > 0){
            int mod = num2 % 10;
            int div = num2 / 10;
            num2 = div;

            switch (mod){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }
            //System.out.println();

        }
        for (int i = 0;i<toPrintZeros;i++){
            System.out.println("Zero");
        }
    }
}
