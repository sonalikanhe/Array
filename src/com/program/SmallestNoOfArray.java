package com.program;

public class SmallestNoOfArray {
public static void main(String[] args) {
	int a[]= {1,3,6,5,8,9,4,7};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
System.out.println("smallest no. of array is>>" +a[0]);
}
}
