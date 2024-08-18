public class classAndObject {
    public static void main(String[] args) {
        // student s1 = new student(); //object creation
        student s2 = new student("Mohan");
        student s3 = new student(121);
        System.out.println(s2.name);
        System.out.println(s3.roll);
        // s1.setRoll(23); //the error is beacuse the private method cant't be acess outside the class
        // s1.setName("mohan");
        // s1.setbankInfo(1450);
        // System.out.println(s1.getbankInfo());
    }
    
}
class student{
   public String name = "shubhnedu";
    int roll;
    int mark;
    
    private int bankInfo;
    // private void setRoll(int roll1 ){
    //     roll = roll1;
    //     System.out.println(roll);
    // }
    public void setName(String s1 ){
        name = s1;
        System.out.println(name);
    }
    int setMarks(int marks){
        return marks;
    }
    void setbankInfo(int bankInfo){
        this.bankInfo = bankInfo;
    }
    int getbankInfo(){
        return this.bankInfo;
    }
    student(){
        System.out.println("Non parametarized constructor");
    }
    student(int roll){
        this.roll = roll;
    }
    student(String name ){
        this.name = name;
    }
}