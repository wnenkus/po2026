package agh.po.lab3;
import java.util.ArrayList;



public class CodingBat {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;

    }

    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        }
        return 21 - n;
    }
    public boolean firstLast6(int[] nums) {

        if (nums[0] == 6) {
            return true;
        } else if (nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }
    public String withoutEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }


    public static void main(String[] args) {
        CodingBat cb = new CodingBat();

        System.out.println("sleepIn(false, false) = " + cb.sleepIn(false, false));
        System.out.println("sleepIn(true, false)  = " + cb.sleepIn(true, false));
        System.out.println("sleepIn(false, true)  = " + cb.sleepIn(false, true));

        System.out.println("diff21(19) = " + cb.diff21(19));
        System.out.println("diff21(10) = " + cb.diff21(10));
        System.out.println("diff21(21) = " + cb.diff21(21));
        System.out.println("diff21(25) = " + cb.diff21(25));

        System.out.println(("firstLast6([1, 2, 6]) = " + cb.firstLast6(new int[]{1,2,6})));

        System.out.println(cb.withoutEnd2("Hello"));

    }
}



