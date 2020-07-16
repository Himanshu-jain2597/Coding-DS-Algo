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
	        int b=0;
	        int n = sc.nextInt();
	        int sum = sc.nextInt();
	        int[] arr = new int[n];
	        int start=0;
	        for(int i=0;i<n;i++)
	        {
	            int x=sc.nextInt();
	            arr[i]=x;
	        }
	        int curr_sum=arr[0];

	        for(int i=1;i<=n;i++)
	        {
	            if(curr_sum>sum&&start<i-1)
	            {
	                curr_sum=curr_sum-arr[start];
	                start++;
	            }
	            
	            if(curr_sum==sum)
	            {
	                b=1;
	                int p=i;
	                System.out.println(start+1+" " + p);
	                break;
	            }
	            if(i<n)
	            {
	                curr_sum=curr_sum+arr[i];
	            }
	        }
	        if(b==0)
	        System.out.println(-1);

	        t--;
	    }
	    
		//code
	}
}