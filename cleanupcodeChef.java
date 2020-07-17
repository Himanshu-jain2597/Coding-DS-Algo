/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

	    while(t>0)
	    {
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        

	        
            ArrayList<Integer>farray=new ArrayList<>();

	        for(int i=0;i<m;i++)
	        {
	       if(sc.hasNextInt())
	       {
           farray.add(sc.nextInt());
	       }
	       }
	      List<Integer> total=new ArrayList<>();
	        for(int i=1;i<=n;i++){
	            total.add(i);
	        }
	  
	  total.removeAll(farray);
	  
	    for(int i=0;i<total.size();i=i+2)
	    {
	        System.out.print(total.get(i)+" ");
	        
	    }
	    System.out.println();
	    for(int i=1;i<total.size();i=i+2)
	    {
	        System.out.print(total.get(i)+" ");
	        
	    }
	   t--;
	    System.out.println();
}
		// your code goes here
	}
}
