import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
        System.out.println(even_or_odd(5));//6
        System.out.println(countingSheep(5));//7
        System.out.println(getStatus(true));//
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


    //6.Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
    public static String even_or_odd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }


    //7. Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
    public static String countingSheep(int num) {
        String sheep = "";
        for (int i = 1; i <= num; i++) {
            sheep = sheep + i + " sheep... ";
        }
        return sheep;
    }
    //8.Function should return a dictionary/Object/Hash with "status" as a key, whose value can : "busy" or "available" depending on the truth value of the argument is_busy.
//      But as you will see after clicking RUN or ATTEMPT this code has several bugs, please fix them.
    protected static final HashMap <String, String> getStatus(final boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();

        if (isBusy)
            status.put("status", "busy");
        else
            status.put("status", "available");

        return status;
    }
}

    //7. ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
    //If the function is passed a valid PIN string, return true, else return false.


//    public static boolean validatePin(String pin) {
//         char [] dd = pin.toCharArray();
//        for (Character s: dd) {
//            Integer.valueOf(s);
//            if (pin.length()==4||pin.length()==6){
//                return true;
//            }else{
//                return false;
//            }
//
//        }            return pin.length()==4||pin.length()==6;
//
//    }




    //7.The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
//
//    public static String encode(String word) {
//        char[] s = word.toCharArray();
//        for (int i = 0; i < s.length; i++) {
//            char result1 = word.charAt(i);
//            if (result1 == 1) {
//                word = word.replace(word.charAt(i), '(');
//                return word;
//            } else if (result1 != 1) {
//                word = word.replace(word.charAt(i), ')');
//                return word;
//
//            }
//
//        }
//
//        return word;
//
//    }
//}

        /*
        for(int i = 0; i<word.length();i++){
            word = (word.replace(word.charAt(i), ')'));
        }   return word;
//        for (int i = 0; i < word.length(); i++) {
            Character result1 = word.charAt(i);
            char i = ' ';
            if(result1.equals(result1)){
                return word.replace(result1,'(');
        }else{
                return word.replace(result1,')');

            }
        return word;
    }
//        public static boolean hasDuplicates(String str) {
//            Set<Character> characters = new HashSet<>();
//            for (char c : str.toCharArray()) {
//                if (!characters.add(c)) {
//                    return true;
//                }
//            }
//            return false;
        }
}
    /*4 . Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep. Fortunately, you are good at spotting them.
Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of the queue which is at the end of the array:
[sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
   7      6      5      4      3            2      1
If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue. */
//        public static String warnTheSheep (String[]array){
//            String[] ar = new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"};
//
//            if ("wolf".contains(array[array.length - 1])) {
//                System.out.println("\"Pls go away and stop eating my sheep\"");
//            } else {
//                System.out.println("Oi! Sheep number N! You are about to be eaten by a wolf!");
//            }
//
//            return "";
//        }



