/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t>0)
	    {
	        int count=0;
	        int n = sc.nextInt();
	        int [] arr=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            int x = sc.nextInt();
	            arr[i] = x;
	        }
	        int cur_sum=0;
	        int sum=sc.nextInt();
	        int start=0;
	        int end=-1;
	        HashMap<Integer,Integer>hash = new HashMap<>();
	        for(int i=0;i<n;i++)
	        {
	            cur_sum+=arr[i];
	            if(cur_sum-sum==0)
	            {
	                start = 0;
	                end = i;
	                count++;
	            }
	       
	        if(hash.containsKey(cur_sum-sum))    
	        {
	            
	            start = hash.get(cur_sum-sum)+1;
	            end=i;
	            count++;
	        }    
	            
	            hash.put(cur_sum,i);
	            
	        }
	        System.out.println(count);
	        t--;
	    }
	        
	        
	        
	        
		//code
	}
}