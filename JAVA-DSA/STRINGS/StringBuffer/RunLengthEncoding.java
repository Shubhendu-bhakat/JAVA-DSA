public class RunLengthEncoding {
    public static StringBuilder compress(StringBuilder str) {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            s.append(str.charAt(i));
            if (count > 1) {
                s.append(count.toString());
            }
        }
        return s;
        
    }
    public static void main(String[] args) {
        
    }
}
