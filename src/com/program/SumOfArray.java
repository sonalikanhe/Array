package com.program;

public class SumOfArray {
public static void main(String[] args) {
	int a[]= {10,20,30,50,80};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=a[i]+sum;	
	}
System.out.println("sum of element in array is>>" +sum);
}
}
