public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

    }




    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 < 10) || (num1 > 1000))
            return false;
        if ((num2 < 10) || (num2 > 1000))
            return false;
        if ((num3 < 10) || (num3 > 1000))
            return false;
        String [] arr = new String[3];
        arr[0] = Integer.toString(num1);
        arr[1] = Integer.toString(num2);
        arr[2] = Integer.toString(num3);

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (i!=j){
                    if (arr[i].charAt(arr[i].length()-1)==
                            arr[j].charAt(arr[j].length()-1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
