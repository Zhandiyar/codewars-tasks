import java.util.PriorityQueue;
import java.util.Queue;

public class Kyu8 {
    public static void main(String[] args) {

        System.out.println(shortcut("hello"));// 1
        System.out.println(quarterOf(51));// 2
        System.out.println(repeatStr1(2,"dssd"));//3
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


//3. Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
    public static String repeatStr1(final int repeat, final String string) {
        StringBuilder s = new StringBuilder();
        for (int i= 0 ; i<repeat; i++){
            s.append(string);
        }
        return s.toString();
    }
    public static String repeatStr2(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    /*4 . Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep. Fortunately, you are good at spotting them.

Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of the queue which is at the end of the array:

[sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
   7      6      5      4      3            2      1
If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.
     */
    public static String warnTheSheep(String[] array) {
        String [] ar = new String[] {"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"};

        if ("wolf".contains(array[array.length-1])){
            System.out.println("\"Pls go away and stop eating my sheep\"");
        }else{
            System.out.println("Oi! Sheep number N! You are about to be eaten by a wolf!");
        }

        return "";
    }

}
