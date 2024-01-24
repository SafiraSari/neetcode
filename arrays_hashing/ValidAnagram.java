package arrays_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // Sorts the characters in the strings, and then compares them to see if they are equal (=anagram).
    public static boolean isAnagram1(String s, String t){
        s = s.toLowerCase();
        t = t.toLowerCase();

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    // Creates an unordered map storing letetr frequency, and then comparing it.
    public static boolean isAnagram2(String s, String t){
        Map<Character, Integer> count = new HashMap<>();

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()){
            count.put(x, count.getOrDefault(x,0) + 1);
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()){
            count.put(x, count.getOrDefault(x,0)-1);
        }

        // Check if any character has non-zero frequency
        for (int val : count.values()){
            if (val != 0){
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args){

        System.out.println(isAnagram2("car", "rat"));

    }

}
