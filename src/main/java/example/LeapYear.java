package example;

/**
 * @author huisheng.jin
 * @date 2020/11/23.
 */
public class LeapYear {
    public static boolean check(int number) {
        if (number % 4 != 0) {
            return false;
        }
        if (number % 400 == 0) {
            return true;
        }
        return number % 100 != 0;
    }

}
