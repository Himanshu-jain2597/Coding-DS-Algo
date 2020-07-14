/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
	    
	    int t = sc.nextInt();
	    while(t>0)
	    {
	       
	        int n = sc.nextInt();
	        int[]arr=new int[n+2];
	        for(int i=0;i<n+2;i++)
	        {
	            int x = sc.nextInt();
	            arr[i]=x;
	        }
	        for(int i=0;i<n+2;i++)
	        {
	            if(arr[Math.abs(arr[i])]>0)
	            arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
	            else
	            System.out.print(Math.abs(arr[i])+" ");

	        }
	        t--;
	        System.out.println();
	    }
		//code
	}
}