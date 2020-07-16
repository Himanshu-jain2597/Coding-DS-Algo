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
	    int [] arr= new int[n];
	    for(int i=0;i<n;i++)
	    {
	        int x = sc.nextInt();
	        arr[i]=x;
	    }
	    int left=0;
	    int right=n-1;
	    while(left<right)
	    {
	        while(arr[left]==0&&left<right)
	        {
	            left++;
	        }
	        while(arr[right]==1&&left<right)
	        {
	            right--;
	        }
	        if(left<right)
	        {
	            int temp=arr[left];
	            arr[left]=arr[right];
	            arr[right]=temp;
	            left++;
	            right--;
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	    t--;
	}
		//code
	}
}