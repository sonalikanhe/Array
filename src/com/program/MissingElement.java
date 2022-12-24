package com.program;

public class MissingElement {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,7,6,8,10,9};
		int n=a.length+1;
		int sum=(n*(n+1))/2;
		for(int i=0;i<a.length;i++) {
			sum=sum-a[i];
		}
	System.out.println("missing no is>>" +sum);
	}
}
