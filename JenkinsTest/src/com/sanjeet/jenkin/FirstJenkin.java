package com.sanjeet.jenkin;
class Test{
	public static  int sum(int a ,int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public static void show() {
		System.out.println("In main Class");
	}
	
}
public class FirstJenkin {
	
public static void main(String[] args) {
	int sum=Test.sum(2, 3);
	System.out.println(sum);
	Test.show();
	
}
}
