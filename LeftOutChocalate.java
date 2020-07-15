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
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int [] arr2 = new int[n+1];
	        for(int i=1;i<=n;i++)
	        {
	            arr2[i]=i;
	        }
	        int i=1;
	        while(arr2[i]<=m)
	        {
	            m=m-arr2[i];
	            if(i==n)
	            i=1;
	            else
	            i++;
	        }
	        t--;
	        System.out.println(m);
	    }
		//code
	}
}