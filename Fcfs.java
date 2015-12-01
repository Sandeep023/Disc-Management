package Discmanagement;

import java.util.Random;

public class Fcfs {
	public int[] arr = new int[1000];
	  int n;
		public  void main(int st,int end,int head) 
		{
			int[] b = new int[1000];
	        Random R = new Random();
			System.out.print("Head" + " ");
			System.out.print(st);
			System.out.print("End");
			System.out.print(end + " ");
			int range = 10;
			n = R.nextInt(range-st)+1;
			for(int i=0 ;i<n ;i++)
				arr[i] = R.nextInt(end-st)+ 1;
			
			arr[n] = head;
			
			for (int c = 0; c < ( n + 1 ); c++){
			      for (int d = 0; d < n-c ; d++){
			    	  	if (arr[d] > arr[d+1]){ /* For descending order use < */
			        		int swap = arr[d];
			          		arr[d]   = arr[d+1];
			          		arr[d+1] = swap;
			        	}
			      }
			}
		}

}
