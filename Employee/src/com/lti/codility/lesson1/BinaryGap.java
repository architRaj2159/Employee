package com.lti.codility.lesson1;

import java.util.Scanner;

//10010001010
public class BinaryGap {
	public int solution(int N) {
		int binaryGap=0;
	    int tempGap=0;
	    boolean binaryOpen=false;

	    String str = Integer.toBinaryString(N).toString();

	    for(int i=0; i < str.length(); i++){
	      if(str.charAt(i) == '1'){
	        if(((i+1) < str.length()) && str.charAt(i+1) == '0'){
	          binaryOpen = true;  
	          if(tempGap > binaryGap){
	        	  binaryGap = tempGap;
	          	}
	          tempGap = 0;
	        }else{
	          binaryOpen = false;
	        }
	      }else{
	        tempGap++; 
	      }
	      
	      if((i+1) == str.length()){
	         if(binaryOpen == false){
	          if(tempGap > binaryGap){
	          binaryGap = tempGap;
	          tempGap = 0;
	          }
	        }
	      }
	    }
	    return binaryGap;
	 }
	
	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter digit: ");
		int N = Integer.parseInt(sc.nextLine());
		
		int value = bg.solution(N);
		
		System.out.println(value);
		sc.close();
	}
}
