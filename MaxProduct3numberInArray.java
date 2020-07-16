public class Solution {
    public int maxp3(ArrayList<Integer> A) {
        
        Collections.sort(A); 
 
        int n=A.size();
        
        int max1=A.get(0)*A.get(1)*A.get(n-1);
        
        int max2= A.get(n-3)*A.get(n-2)*A.get(n-1);
 
        if(max1>max2)
        return max1;
        else
        return max2;
        
    }
}