package assignment5;
class ass_5_q3 {
    public static String convertCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) result.append(Character.toUpperCase(c));
            else result.append(Character.toLowerCase(c));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertCase("abcdEFGH")); // ABCDefgh
    }
}
