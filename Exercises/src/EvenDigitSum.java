public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));


    }

    public static int getEvenDigitSum(int number){
        if (number < 0)
            return  -1;

        String txt = Integer.toString(number);
        int sum = 0;
        for (int i=0;i<txt.length();i++){
            int currValue = Integer.parseInt(Character.toString(txt.charAt(i)));
            if ((currValue % 2) == 0){
                sum = sum + currValue;
            }
        }
        return sum;
    }
}
