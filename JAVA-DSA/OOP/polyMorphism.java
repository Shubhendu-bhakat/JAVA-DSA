interface Mam {
    void run();
    void eat();
}
interface NonHuman{
    void s1();
    void s2();
}


class Animal{
    Animal(){
        System.out.println("patrent class constructor ");
    }
    void eat(){
        System.out.println("eats anything");
    }
}
class cat extends Animal{
    cat(){
        System.out.println("2nd child class constructor");
    }
    void eat(){
        System.out.println("Eats chichken and drinks milk ");
    }
}
class goat extends cat{
    goat(){
        System.out.println("3rd child class constructor");
    }
    void sound(){
        System.out.println("hin hin");
    }
}
class human implements Mam{
    public void run(){
        System.out.println("human runs ");
    }
    public void eat(){
        System.out.println("human must eat to survivie ");
    }
}
//multiple inheritance 
class JavaSurvivble implements Mam , NonHuman{
   public void run(){
        System.out.println("java survivbles run");
    }
   public void eat(){
    System.out.println("java survivle eat");
   }
   public void s1(){
    System.out.println("Method s1");
   }
   public void s2(){
    System.out.println("Method s2");
   }
}

public class polyMorphism {
    public static void main(String[] args) {
        // goat g = new goat();
        // g.sound();
        JavaSurvivble j = new JavaSurvivble();
        j.eat();
        j.s1();
        j.s2();
        j.run();
    }
}
