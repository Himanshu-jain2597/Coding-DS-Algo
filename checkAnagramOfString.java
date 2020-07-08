/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0)
	    {
	       // sc.hasNextLine();
	        String a = sc.next();
	        String b = sc.next();
	        int[] arr = new int[256];
	        int[] abb= new int[256];
	        for(int i=0;i<a.length();i++) {
	            int w = (int)a.charAt(i);
	            arr[w]++;
	        }
	        for(int i=0;i<b.length();i++) {
	            int w = (int)b.charAt(i);
	            abb[w]++;
	        }
	        int boll=0;
	        for(int i=0;i<256;i++)
	        
	        {
	            if(arr[i]!=abb[i])
	            {
	                boll=1;
	                System.out.println("NO");
	                break;
	            }
	        }
	        if(boll==0)
	        {
	        System.out.println("YES");

	        }
	        
	        
	    }
		//code
	}
}