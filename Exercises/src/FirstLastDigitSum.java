public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0)
            return -1;
        String txt = ""+number;
        int first = Integer.parseInt(Character.toString(txt.charAt(0)));
        int last = 0;
        last = Integer.parseInt(Character.toString(txt.charAt(txt.length()-1)));
        return first + last;
    }
}
