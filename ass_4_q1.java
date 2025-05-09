package assignment4;

class ass_4_q1 {
    public static boolean bruteForceMatch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) break;
            }
            if (j == m) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String T = "abcdefghij";
        String P = "def";

        System.out.println("Pattern found: " + bruteForceMatch(T, P));
    }
}
