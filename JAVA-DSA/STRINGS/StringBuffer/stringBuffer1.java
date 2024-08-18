//covert the first letter of the string to upper case "shubhnedu bhakat " op is "Shubhnedu Bhakat";
public class stringBuffer1 {
public static void toUpperCaseString(StringBuffer str){
    StringBuffer s = new StringBuffer("");
    s.append(Character.toUpperCase(str.charAt(0)));
    for(int i=1;i<str.length();i++){
        if(str.charAt(i) ==' '){
            s.append(str.charAt(i));
            i++;
            s.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            s.append(str.charAt(i));
        }
    }
    System.out.println(s);
}
    public static void main(String[] args) {
        StringBuffer s2 = new StringBuffer("hellow WORLD");
        toUpperCaseString(s2);
        StringBuffer s = new StringBuffer("");
        for (char c = 'a'; c <= 'z'; c++) {
            s.append(c);
        }
        System.out.print(s);
    }

}