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
	    int n = sc.nextInt();
	    while(n>0)
	    {
	        String j = sc.next();
	        String s = sc.next();
	        
	        char[] a = j.toCharArray();
	        char[] b = s.toCharArray();
	        List<Character>c = new ArrayList<>();
	        List<Character>d = new ArrayList<>();
	        
	          for(int i=0;i<a.length;i++)
            {
                c.add(a[i]);
            }
            for(int i=0;i<b.length;i++)
            {
                d.add(b[i]);
            } 
            int count=0;
	        for(int i=0;i<d.size();i++)
	        {
	               if(c.contains(d.get(i)))
	               count++;
            	       
	        }
	        System.out.println(count);
	        n--;
	        
	    }
		// your code goes here
	}
}
