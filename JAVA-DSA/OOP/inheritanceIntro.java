// //parent or base class
// class Animal{
//     String color;
//     int teeth;
//     void eat(){
//         System.out.println("eats");
//     }
//     void breath(){
//         System.out.println("breathes");
//     }
// }
// //child one or derived class one 
// class fish extends Animal{
//     void swim(){
//         System.out.println("Swims in water");
//     }
//     public static void main(String[] args) {
//         fish shark = new fish();
//         shark.eat();
//         shark.swim();

//     }
// }
//child class two
class Mammels extends Animal{
    void run(){
        System.out.println("Mammels can run");
    }
    public static void main(String[] args) {
        // Mammels m1 = new Mammels();
        // m1.eat();
        // m1.run();
        // int c = 4;
        System.out.println(Integer.SIZE/8);
        System.out.println(Character.SIZE/8);
        String str = "5";
        System.out.println(Integer.parseInt(str));

    }
}
