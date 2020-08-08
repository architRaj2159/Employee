package com.lti.codility.lesson1;

public class NumSteps{
    public int numSteps(String s) {
        long decimal = Long.parseLong(s,2);
        
        if(decimal == 1){
            return 0;
        }else if(decimal%2 == 0){
            return 1 + numSteps(Long.toBinaryString(decimal/2));
        }else{
            return 1 + numSteps(Long.toBinaryString(decimal+1));
        }
    }
    
    public static void main(String[] args) {
		NumSteps ns = new NumSteps();
		String s = "1111110011101010110011100100101110010100101110111010111110110010";
		
		System.out.println(ns.numSteps(s));
	}
}
