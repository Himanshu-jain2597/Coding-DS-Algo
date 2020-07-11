
// there are two method to implement this one is through o(n^2) and this is using merge sort(o(nlog(n)))


public class gfg {

    public static int mergeandcount(int arr[],int l,int m,int r)
    {
         int[] left = Arrays.copyOfRange(arr, l, m + 1); 
  
        // Right subarray 
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 
  
        int i = 0, j = 0, k = l, swaps = 0; 
  
        while (i < left.length && j < right.length) { 
            if (left[i] <= right[j]) 
                arr[k++] = left[i++]; 
            else { 
                arr[k++] = right[j++]; 
                swaps += (m + 1) - (l + i); 
            } 
        } 
  
        // Fill from the rest of the left subarray 
        while (i < left.length) 
            arr[k++] = left[i++]; 
  
        // Fill from the rest of the right subarray 
        while (j < right.length) 
            arr[k++] = right[j++]; 
  
        return swaps; 
    } 





    private static int inversionandcount(int arr[],int l,int r)
    {
        if(l<r) {
        int m = (l+r)/2;

        int count=0;

        count+=inversionandcount(arr,l,m);

        count+=inversionandcount(arr,m+1,r);


        count+=mergeandcount(arr,l,m,r);

        }

        return count;


    }


    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int count=0;

        int [] arr =new int[n];

        for(int i=0;i<n;i++)
        {
            int x= sc.nextInt();
            arr[i]=x;

        }

        System.out.println(inversionandcount(arr,0,n-1));





        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(arr[i]>arr[j])
        //         {
        //             count++;
        //         }
        //     }
        // }



    }

}