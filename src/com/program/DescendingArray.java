package com.program;

public class DescendingArray {
public static void main(String[] args) {
	int a[]= {2,5,6,8,4,7};
	int temp=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			
		}
	System.out.println("element in descending order is>>");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
}
}

