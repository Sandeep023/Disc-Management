package Discmanagement;

import java.util.Random;

public class Clook {
	
	
	int pos;
	int[] arr = new int[1000];
	int[] b = new int[1000];
	int n;
	public void main(int st,int end,int head) 
	{
		int  m, inm;
	     Random R = new Random();
	     n = R.nextInt(10 - 0 ) +1;
		for(int i=0 ;i<n ;i++)
			arr[i] = R.nextInt(end - st) +1;
		arr[n] = head;
		for (int c = 0; c < ( n+1 ); c++){
		      for (int d = 0; d < n-c ; d++){
		    	  if (arr[d] > arr[d+1]){ /* For descending order use < */
		    		  int swap = arr[d];
		    		  arr[d]   = arr[d+1];
		    		  arr[d+1] = swap;
		    	  }
		      }
		}
		for(int i=0; i< n+1; i++){
			if (arr[i] == head )
				pos = i;
		}		
		for(int i=pos; i>=0; i--)
			System.out.println(arr[i] + " ");
		for(int i=n; i>pos; i--)
			System.out.println(arr[i] + " ");
	}

}
