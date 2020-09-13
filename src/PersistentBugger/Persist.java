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

/* Best Practices:
1. Recursive solution
public static int persistence(long n) {
    long m = 1, r = n;
    if (r / 10 == 0)
      return 0;
    for (r = n; r != 0; r /= 10)
      m *= r % 10;
    return persistence(m) + 1;
}
*
2. Functional solution
public static int persistence(long n) {
    int times = 0;
    while (n >= 10) {
      n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
      times++;
    }
    return times;
}
*/