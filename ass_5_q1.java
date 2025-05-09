package assignment5;

class ass_5_q1 {
    public static boolean isMatchingOrder(String text, String pattern) {
        int j = 0;
        for (int i = 0; i < text.length() && j < pattern.length(); i++) {
            if (text.charAt(i) == pattern.charAt(j)) {
                j++;
            }
        }
        return j == pattern.length();
    }

    public static void main(String[] args) {
        String T1 = "ABCDEFGHIJ", M1 = "BEFJ";
        String T2 = "ABCDEFGHIJ", M2 = "BHDJ";

        System.out.println("BEFJ: " + isMatchingOrder(T1, M1)); // true
        System.out.println("BHDJ: " + isMatchingOrder(T2, M2)); // false
    }
}
