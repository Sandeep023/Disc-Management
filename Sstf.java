package Discmanagement;

import java.util.Random;

public class Sstf {
	int[] arr = new int[1000];
	int[] b = new int[1000];
	int n;
	public void main(int st,int end,int head)
	{
		int  m, inm;
		Random R = new Random();
		n = R.nextInt(10 - 0) +1;
		for(int i=0 ;i<n ;i++)
			arr[i] = R.nextInt(end-st)+ 1;
		for(int i=0;i<n;i++){
			m = 10000000;
			inm = 0;
			for(int j=0 ;j<n ;j++){
				if( Math.abs(head-arr[j]) < m ){
					m = Math.abs(head-arr[j]);
					inm =j;
				}
			}
			b[i] = arr[inm];
			head = b[i];
			arr[inm] = 10000;
		}
	}	
}
