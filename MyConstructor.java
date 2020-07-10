
public class MyConstructor {

    int wheel;

MyConstructor() {
    System.out.println("object is created")

}

MyConstructor(int wheel)
{
    this.wheel=wheel;
    System.out.println(wheel)
}


public static void main(String[] args)
{
    MyConstructor cons = new MyConstructor(4);
    
}

}