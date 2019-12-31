package com.sanjeet.jenkin;
class Test{
	public static  int sum(int a ,int b) {
		System.out.println(a+b);
		return a+b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
}
public class FirstJenkin {
	
public static void main(String[] args) {
	int sum=Test.sum(2, 3);
	System.out.println(sum);
	int mul=Test.mul(2, 3);
	System.out.println(mul);
}
}
