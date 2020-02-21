import java.util.*;
public class LongestStringArray2 {
    static ArrayList<String> longestStringsinArray(String[] longString) {
        ArrayList<String> list = new ArrayList<String>();
        int longestLength = 0;
        for (String str : longString) {
            int length = str.length();
            if (length > longestLength) {
                longestLength = length;
                list.clear();
            }
            if (length == longestLength) {
                list.add(str);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String [] longestStrings = {"once", "upon", "a", "time"};
        System.out.println("The Longest word(s) of the Array {\"once\", \"upon\", \"a\", \"time\"} are :\n"+longestStringsinArray(longestStrings));
    }
}