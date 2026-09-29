package com.pack13;
import java.util.Scanner;
public class Array1 {
	Scanner sc=new Scanner(System.in);
	void meth1() {
	int rows=sc.nextInt();
	int cols=sc.nextInt();
	
	int[][]arr=new int[rows][cols];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]+"");
		}
		System.out.println();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1 aobj=new Array1();
		aobj.meth1();

	}

}
