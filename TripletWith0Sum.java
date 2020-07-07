class Triplet
{
    // Function to check if triplet is present 
    // arr[]: input array
    // n: size of the array
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++) 
        {
        if(twoSum(arr,n,-arr[i],i+1))
        return true;
        
        }        
        return false;
    
    }
    
    public boolean twoSum(int a[],int n,int x,int i)
    {
        int j=a.length-1;
        while(i<j)
        {
            if(a[i]+a[j]>x)
            {
                j--;
            }
            else if(a[i]+a[j]<x)
            {
                i++;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    
}