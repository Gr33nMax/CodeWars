package PersistentBugger;


public class Persist {
    public static void main(String[] args) {
        System.out.println(persistence(4));
    }
    public static int persistence(long n) {
        int result = 0;
        long divisionResult = n;
        while (divisionResult >= 10) {
            divisionResult = division(divisionResult);
            result += 1;
        }
        return result;
    }

    public static long division(long n) {
        long multiRes = 1; // the result of multiplying digits
        while (n != 0) {
            multiRes *= (n % 10);
            n /= 10;
        }
        return multiRes;
    }
}
