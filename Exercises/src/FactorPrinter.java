public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
    }

    public static void printFactors(int num){
        if (num < 1){
            System.out.println("Invalid Value");
            return;
        }
        String toPrint = "";
        for (int i=1;i<=num;i++){
            int remain = num % i;
            if (remain == 0){
                toPrint += (i+" ");
            }
        }
        System.out.println(toPrint);
    }

}
