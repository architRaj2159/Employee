package com.lti.day4;
import java.io.FileReader;  
public class FileReaderExample {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("C:\\Users\\aryan\\LTI\\FI - LnD Batch Repository - GET-845\\Mini Project\\I\\Problem Statement\\complaints.csv");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    
