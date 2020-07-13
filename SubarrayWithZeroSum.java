

public class subarray {
    public static void main(String[] args)
    {
        int arr[]={3,2,2,4,-1,-2,-3}

        // for(int i=0;i<arr.length;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++)
        //     {
        //         sum+=sum[j]
        //         if(sum==0)
        //         boolean found=true;
        //         break;
        //     }
        // }

        Set<Integer>set=new Set<>();
        int sum=0;
        for(int element:arr)
        {
        set.add(sum);
        sum+=element;
        if(set.contains(sum))
        {
            boolean found=true;
            break;
        }
        }

    }
}