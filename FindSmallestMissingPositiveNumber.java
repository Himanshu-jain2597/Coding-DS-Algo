class Solution {
    
        public  int segregate(int[] arr,int n) {
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=0)
            {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            
        }
        return j;
    }
    
    public int findmissingpos(int[] arr2,int size) {
        

        for(int i=0;i<size;i++)
        {
            int x = Math.abs(arr2[i]);
            if(x-1<size&&arr2[x-1]>0)
            {
                arr2[x-1]=-arr2[x-1];
            }
        }
            for(int i=0;i<size;i++)
            {
                if(arr2[i]>0)
                return i+1;
            }
            
            return size+1;
        
        
        
        
    }
    
    public  int findmissing(int [] arr,int n) {
        int shift = segregate(arr, n);
        int[] arr2= new int[n-shift];
        int j=0;
        for(int i=shift;i<n;i++)
        {
            arr2[j] = arr[i];
            j++;
        }
        
        return findmissingpos(arr2,j);
    }
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int missing = findmissing(nums,n);
        return missing;        
    }
}