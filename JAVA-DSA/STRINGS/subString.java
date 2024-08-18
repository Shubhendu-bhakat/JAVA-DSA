public class subString {
    public static String printSubString(String str, int si, int ei) {
        String snew = "";
        for (int i = si; i < ei; i++) {
            snew += str.charAt(i);
        }
        return snew;
    }

    public static void main(String[] args) {
        String str = "ShubhenduBhakat";
        System.out.println(printSubString(str, 0, 9));
    }
}
