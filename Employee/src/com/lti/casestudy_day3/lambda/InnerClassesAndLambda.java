package com.lti.casestudy_day3.lambda;

class Outer{
	private int x = 10;
	
	//inner classes have access to private members as well
	class Inner{
		void check() {
			System.out.println(x);
		}
	}
	
	//static inner class
	static class InnerClass{
		void check() {
			System.out.println("Just checking....");
		}
	}
}

interface Printer{
	void print(String document);
}

class dotMatrixPrinter implements Printer{

	@Override
	public void print(String document) {
		System.out.println(document+ " printing started....");
	}
	
}
public class InnerClassesAndLambda {
	public static void main(String[] args) {
		
		
		Printer p = new dotMatrixPrinter();
		p.print("abc.txt");
		
		
		class DeskjetPrinter implements Printer{

			@Override
			public void print(String document) {
				System.out.println(document+ " printing started....");
				
			}
			
		}
		
		//inner class can be written inside a method as well
		Printer pr = new DeskjetPrinter();
		pr.print("xyz.txt");
		
		
		
		//anonymous inner class implementing printer interface
		Printer pt = new Printer() {
			
			@Override
			public void print(String document) {
				System.out.println(document+ " printing started....");
			}
		};
		
		pt.print("Hello World.txt");
		
		
		
		
		//First, we need to create the object of outer class
		//then we need to create the object for inner class
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.check();
		// The rule is same for any member of a class
		//without the object of the class we cannot call any member of it including inner class
		
		
		
		
		
		//In case of static inner class , we don't need to create object of outer class
		Outer.InnerClass ic = new Outer.InnerClass();
		ic.check();
		//To understand lambda expressions, we need to first understood:-
		//1. Inner Classes
		//2. Anonymous inner classes
		
		//We can say lambda is nothing but: anonymous function
		
		
		
		
		
		//Now introducing lambda expressions
		Printer pn = document -> {
			System.out.println(document+ " printing started....");
		};
		pn.print("Hi.txt");
		
		//we are creating an anonymous inner class which is overriding the print method
		//then object of the class was created by writing the code which is small and efficient
		//it converted 6 line anonymous inner class code to 3 lines.
		
		Printer pp = document -> System.out.println(document+ " printing started.....");
		pp.print("single.txt");
		
		//Lambda expression can be used with those interfaces which
		//contains only one abstract method such interfaces in java are called as @FunctionalInterface
	}

}
