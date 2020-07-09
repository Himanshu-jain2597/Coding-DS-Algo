

public class Methods {

    public static void main(String[] args)
    {

            int a=1;
            int b=2;
            int res=maxOf(a,b);
    }
                                    
   static int maxOf(int a,int b)  // static function can only call static function it cannot call non static


   // java is always pass by value in every case whether primitive or non-primitive data type
    {
        return a<b?b:a;
    }

}