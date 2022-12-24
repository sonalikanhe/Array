package com.program;

public class SecondLargest {
public static void main(String[] args) {
	int a[]= {1,5,6,7,9,10,15,18};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
System.out.println("Second largest element in array>>" +a[1]);
}
}
