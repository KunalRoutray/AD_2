package assignment5;

class ass_5_q5 {
    public static boolean areEqual(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(areEqual("abc", "abc")); // true
        System.out.println(areEqual("abc", "ABC")); // false
    }
}
