
// Solution class to implement function largestAndSecondLargest
class ArrayMax{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        int first=Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int i=0;i<sizeOfArray;i++)
        {
            if(arr[i]>first)
            {
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second&&arr[i]<first) 
            {
                second=arr[i];
                
            }
        }
        ArrayList<Integer>a = new ArrayList<Integer>(); 
        a.add(first);
        if(second==Integer.MIN_VALUE)
        a.add(-1);
        else
        a.add(second);
        return a; 
        
        
        //code here.
    }
}