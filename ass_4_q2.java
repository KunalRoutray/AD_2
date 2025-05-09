package assignment4;

class ass_4_q2 {
    public static boolean rabinKarpMatch(String text, String pattern, int prime) {
        int n = text.length();
        int m = pattern.length();
        int base = 256;
        int h = 1;

        for (int i = 0; i < m - 1; i++) h = (h * base) % prime;

        int pHash = 0, tHash = 0;
        for (int i = 0; i < m; i++) {
            pHash = (base * pHash + pattern.charAt(i)) % prime;
            tHash = (base * tHash + text.charAt(i)) % prime;
        }

        for (int i = 0; i <= n - m; i++) {
            if (pHash == tHash) {
                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) return true;
            }
            if (i < n - m) {
                tHash = (base * (tHash - text.charAt(i) * h) + text.charAt(i + m)) % prime;
                if (tHash < 0) tHash += prime;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String T = "abcdefghij";
        String P = "def";

        System.out.println("Pattern found: " + rabinKarpMatch(T, P, 101));
    }
}
