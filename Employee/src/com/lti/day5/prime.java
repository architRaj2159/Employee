package com.lti.day5;

import java.util.Scanner;

public class prime{  
	static boolean checkForPrime(int inputNumber)
    {
        boolean isItPrime = true;
         
        if(inputNumber <= 1) 
        {
            isItPrime = false;
             
            return isItPrime;
        }
        else
        {
            for (int i = 2; i <= inputNumber/2; i++) 
            {
                if ((inputNumber % i) == 0)
                {
                    isItPrime = false;
                     
                    break;
                }
            }
             
            return isItPrime;
        }
    }
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        System.out.println("How many initial prime numbers you want?");
         
        int n = sc.nextInt();
         
        int counter = 1;
         
        int inputNumber = 2;
         
        System.out.println("Initial "+n+" Prime Numbers :");
         
        while (counter <= n)
        {   
            if (checkForPrime(inputNumber))
            {
                System.out.println(inputNumber);
                 
                counter++;
                 
                inputNumber++;
            }
            else
            {
                inputNumber++;
            }
        }
         
       sc.close();
    }
}
  