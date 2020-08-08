package com.lti.day4;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import java.util.Scanner;  
public class CSVFileReader 
{  
public static void main(String[] args)   
{  
String line = "";  
String splitBy = ",";  
Scanner ob= new Scanner(System.in);    //System.in is a standard input stream  
System.out.print("Enter bank Name- ");  
String str= ob.nextLine();
try   
{  
//parsing a CSV file into BufferedReader class constructor  
BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\aryan\\\\LTI\\\\FI - LnD Batch Repository - GET-845\\\\Mini Project\\\\I\\\\Problem Statement\\\\complaints.csv"));  
while ((line = br.readLine()) != null)   //returns a Boolean value  
{  
String[] employee = line.split(splitBy);    // use comma as separator  
if (employee[3] == str){
System.out.println( employee[0] + "," + employee[1] + "," + employee[2] + "," + employee[3] + ", " + employee[4] + "," + employee[5] +"," +employee[6] + "," + employee[7] + "," + employee[8] + "," + employee[9] + ", " + employee[10] + "," + employee[11] +","+employee[12] + "," + employee[13] );
}else {
	System.out.println("Bank does not Found in the Logs!!!");
	break;
}  
}  
}   
catch (IOException e)   
{  
e.printStackTrace();  
}  
}  
}