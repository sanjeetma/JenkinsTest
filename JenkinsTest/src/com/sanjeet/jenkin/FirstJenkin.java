package com.sanjeet.jenkin;
class Test{
	public static  int sum(int a ,int b) {
		return a+b;
	}
}
public class FirstJenkin {
	
public static void main(String[] args) {
	int sum=Test.sum(2, 3);
	System.out.println(sum);
}
}
