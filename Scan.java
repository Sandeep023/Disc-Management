package Discmanagement;

import java.util.Random;

public class Scan {
	int[] arr = new int[1000];
	int[] b = new int[1000];
    int n;
    int pos;
	public  void main(int st,int end,int head) 
	{
	Random R = new Random();
		n = R.nextInt(10-1)+1;
		System.out.println("Enter the queue : ");
		for(int i=0 ;i<n ;i++)
			arr[i] = R.nextInt(end-st)+1;
		arr[n] = st;
		arr[n+1] = end;
		arr[n+2] = head;
		for (int c = 0; c < ( n+3 ); c++){
		      for (int d = 0; d < n+2-c ; d++){
		    	  	if(arr[d] > arr[d+1]){ /* For descending order use < */
		        		int swap = arr[d];
		          		arr[d]   = arr[d+1];
		          		arr[d+1] = swap;
		        	}
		      }
		}
		for(int i=0; i< n+2; i++){
			if (arr[i] == head )
				pos = i;
		}	
		for(int i=pos; i>=0; i--)
			System.out.println(arr[i] + " ");
		for(int i=pos+1; i<n+3; i++)
			System.out.println(arr[i] + " ");
	}
}
