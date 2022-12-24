package com.program;

public class SortAscending {
public static void main(String[] args) {
	int a[]= {6,8,4,2,5};
	int temp=0;
	
  for(int i=0;i<a.length;i++) {
	  for(int j=i+1;j<a.length;j++) {
		  if(a[i]>a[j]) {
			  temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
		  }
	  }
  }
  System.out.println("elements of sorted array");
	for(int i=0;i<a.length;i++) {
	System.out.print(a[i] +" ");
	}	
}
}
