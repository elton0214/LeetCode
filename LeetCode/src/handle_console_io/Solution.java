package handle_console_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

class Solution {
	public static void main(String[] args) throws IOException {
        
		InputStreamReader r = new InputStreamReader(System.in);  
        BufferedReader br   = new BufferedReader(r);
        String line = "";
        
        
        //1. no limit input times
//        while ((line = br.readLine()) != null) {
//        	String[] numbers = line.split(" ");
//        	
//        	System.out.printf("output:%s %s\n",numbers[0],numbers[1]);
//        }
        
        
        //2. limit input times
//        int times = Integer.valueOf(br.readLine());
//        int lineNo = 0;
//        while (lineNo < times) {
//        	String[] numbers = br.readLine().split(" ");
//
//        	System.out.printf("output:%s %s\n",numbers[0],numbers[1]);
//        	lineNo++;
//        }
        
        //3. stop by input particular word
        String input="";  
        
        while(!input.equals("stop")){  
        	System.out.print("Enter data: ");  
        	input=br.readLine();  
        	System.out.println("data is: "+input);  
        }  
        
        br.close();  
        r.close();  
        
	  }
}



