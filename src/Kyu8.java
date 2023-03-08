public class Kyu8 {
    public static void main(String[] args) {

        System.out.println(shortcut("hello"));// 1
        System.out.println(quarterOf(51));// 2
        System.out.println((4+2)/3);
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
        }else {
            System.out.println("Given a month as an integer from 1 to 12");
        }

        return month;
    }

}
