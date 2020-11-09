package com.sum_of_n_array;

import java.util.Scanner;

public class Solution
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] numArray= new int[n];
	for(int i=0;i<n;i++){
		
		numArray[i]=sc.nextInt();
	}
	//System.out.println(numArray);
	int sum=0;
	for(int i=0;i<n;i++)
	{
		sum+=numArray[i];
	}
	System.out.println(sum);
}
}
