
public class gfg {

    public static power(int a,int b)
    {
        if(b==0)
        return 1;

        if(b%2==0)
        return power(a*a,b/2);

        return a*power(a,b-1);
    }

    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);

        int a = Sc.nextInt();
        
        int b= Sc.nextInt();

        System.out.println(power(a,b));
    }
}