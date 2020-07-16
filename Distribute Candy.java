public class Solution {
    public int candy(ArrayList<Integer> A) {
        
        int res = A.size();
        int n = A.size();
        int [] dist = new int[n];
        for(int i=0;i<n;i++)
        {
            dist[i]=1;
        }
        for(int i=1;i<n;i++)
        {
            if(A.get(i)>A.get(i-1))
            {
                dist[i]=dist[i-1]+1;
            }
            
        }
        for(int i=n-2;i>=0;i--)
        {
            if(A.get(i)>A.get(i+1))
            {
                dist[i]=Math.max(dist[i],dist[i+1]+1);
            }
        }
        
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=dist[i];
        }
        return sum;
        
    }
}
