package com.qubole.qa.offline;

import java.util.Arrays;

public class SortBinary {
	public static void sort(int a[]){
		//int[] a={1,0,1,1,0,1,0,1,0,0,1,1,1,0};
		int count=0;
		for(int i=0;i<a.length;i++)
		{    
			if(a[i] != 0 || a[i] == 1 ){
				if(a[i] != 1 || a[i] == 0 ){
					System.out.println("break");
					break;
				}

			}

			if(a[i]==0)
			{
				a[count]=0;
				count++;
				a[i]=1;
				System.out.println(Arrays.toString(a));
			}
		}
		System.out.println(Arrays.toString(a));
	}


	public static void main(String args[]){
		int[] a={1,1,0,1,0};
		//int[] a={7,0,2,1};
		sort(a);
	}
}
