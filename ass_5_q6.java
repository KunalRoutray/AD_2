package assignment5;

class ass_5_q6 {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // olleh
    }
}

