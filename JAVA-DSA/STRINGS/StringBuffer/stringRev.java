public class stringRev {
    public static void RevString(StringBuilder s,int si,int ei){
        StringBuilder snew = new StringBuilder("");
        if(si == ei){
           System.out.println(snew);
           return;
        }
        if(si != ei){
            snew.append(ei);
            snew.append(si);
        }
        RevString(snew, si+1, ei-1);

    }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Santosh");
        int len = s.length();
        RevString(s, 0,len );
    }
}
