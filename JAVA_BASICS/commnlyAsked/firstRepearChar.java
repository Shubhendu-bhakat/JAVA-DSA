import java.util.Scanner;

public class firstRepearChar {
    private static void printRep(int t) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean flag = false;
        for (int k = 0; k < t; k++) {
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        System.out.println(s.charAt(i));
                        flag = true;
                        
                    }
                    break;
                }
            }
            if(flag == false){
                System.out.println(".");
            }
            
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            printRep(t);
        }

    }
}
