package assignment5;

import java.util.HashSet;

class ass_5_q2 {
    public static boolean hasUniqueCharacters(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("abcdefg: " + hasUniqueCharacters("abcdefg")); // true
        System.out.println("hello: " + hasUniqueCharacters("hello")); // false
    }
}
