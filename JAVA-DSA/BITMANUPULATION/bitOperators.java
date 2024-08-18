
public class bitOperators {
public static void main(String[] args) {
    int a = 5;
    int b = 6;
    System.out.println("Binary and operaor "+ (a&b));
    System.out.println("binary or operator is "+ (a|b));
    System.out.println("Binary XOR operator is "+ (a^b));
    System.out.println("Binary 1's compliment is "+ (~a));
    System.out.println("Binary left shift operator is "+(a<<b));
    System.out.println("Binary right shift operator is "+ (a>>b));
}

}