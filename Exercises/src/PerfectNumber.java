public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int num){
        if (num < 1){
            return false;
        }
        int total = 0;
        for (int i=1;i<num;i++){
            int remain = num % i;
            if (remain == 0){
                total += i;
            }
        }
        return (num == total);
    }
}
