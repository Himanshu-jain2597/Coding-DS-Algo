import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr  = new int[n];
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            arr[i]=x;

        } 
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

    }
}