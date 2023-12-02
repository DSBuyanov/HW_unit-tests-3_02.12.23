package seminars.third.tdd;

public class NumberUtils {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isInInterval(int number) {
        return number > 25 && number < 100;
    }
}
