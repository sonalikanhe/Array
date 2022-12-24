package com.program;

import java.util.HashSet;

public class RemoveDuplicateUnsorted {
public static void main(String[]args) {
	int a[]= {1,5,6,2,3,5,5};
	HashSet<Integer> hs = new HashSet<Integer>();
	for(int i=0;i<a.length;i++) {
		hs.add(a[i]);
	}
 for(Integer no:hs) {
	 System.out.print(no + " ");
 }
}
}
