import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kyu8 {
    public static void main(String[] args) {

        System.out.println(shortcut("hello"));// 1
        System.out.println(quarterOf(51));// 2
        System.out.println(repeatStr1(5, "dssd"));//3
        System.out.println(countSheeps2(new Boolean[]
                {true, true, true, false,
                        true, true, true, true,
                        true, false, true, false,
                        true, false, false, true,
                        true, true, true, true,
                        false, false, true, true}));//4
        System.out.println(strCount1("Hello", 'l'));//5
//        System.out.println(encode("din"));

    }


    //1. Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.
    public static String shortcut(String input) {
        String[] arr = new String[]{"a", "e", "i", "o", "u"};
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (input.contains(arr[i1])) {
                input = input.replaceAll(arr[i1], "");
            }
        }
        return input;
    }


    // 2. Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
    public static int quarterOf(int month) {
        if (month == 1 | month == 2 | month == 3) {
            return 1;
        } else if (month == 4 | month == 5 | month == 6) {
            return 2;
        } else if (month == 7 | month == 8 | month == 9) {
            return 3;
        } else if (month == 10 | month == 11 | month == 12) {
            return 4;
        } else {
            System.out.println("Given a month as an integer from 1 to 12");
        }

        return month;
    }


    //3. Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
    public static String repeatStr1(final int repeat, final String string) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            s.append(string);
        }
        return s.toString();
    }

    public static String repeatStr2(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    // 4.Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

    public static int countSheeps1(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).filter(x -> x).filter(x -> x != null).toArray().length;
    }

    // ---------
    public static int countSheeps2(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i]) {
                count++;
            }
        }
        return count;
    }

    // 5. Create a function that accepts a string and a single character, and returns an integer of the count of occurrences the 2nd argument is found in the first one.
    //If no occurrences can be found, a count of 0 should be returned.
    public static int strCount1(String str, char letter) {
        char[] s = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }

        }
        return count;
    }

    //------
    public static int strCount2(String str, char letter) {
        return (int) str.chars().filter(x -> x == letter).count();
    }



}
