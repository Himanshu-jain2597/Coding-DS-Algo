
public class gfg {

    public static grid(int a,int b)
    {

        if(a==1||b==1)
        return 1;

        return grid(a-1,b)+grid(a,b-1);





    }

    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);

        int a = Sc.nextInt();
        
        int b= Sc.nextInt();

        System.out.println(grid(a,b));
    }
}