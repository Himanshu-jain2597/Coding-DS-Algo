
class Cat {
    boolean hasfur;
    String color,breed;
    int legs,eyes;

    public void walk() {
        System.out.println("Cat is walking");
    }
}      // if class is default access modifier then it can be used within same package



public class OOPSAndClass {

    public static void main(String[] args)
    {
        Cat Cat1 = new Cat();

        Cat1.walk(); 
    }

}