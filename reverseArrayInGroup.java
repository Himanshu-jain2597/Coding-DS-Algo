   public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
        // add your code here
        
        for(int i=0;i<n;i=i+k) {
        
        int left=i;
        
        int right = Math.min(i+k-1,n-1);
        
        while(left<right)
        {
            int temp = mv.get(left);
            mv.set(left,mv.get(right));
            mv.set(right,temp); 
            left++;
            right--;
        }
        }
        
     return mv;   
    }
    
}