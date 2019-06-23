package com.hackerank;

import java.math.BigInteger;

public class RepeatedString {

	public static void main(String[] args) {
		repeatedString();
	}
	
	/**
	 * 
	 */
	private static void repeatedString() {
		String repeatedString = "asdwer";
		//long number = 736778906400;
		BigInteger bigNumber = new BigInteger("223344");
		//int integerNum = (int) number;
		String concatenatedString = "";
		 if(repeatedString.equals("a")) {
			 System.out.println(bigNumber.intValue());
	        }else if(!repeatedString.equals("a") && repeatedString.length()==1){
	        	System.out.println("0");
	        }else {
			/*for(int i=0;i<integerNum ;i++) {
				concatenatedString += repeatedString;
			}*/
			concatenatedString = new String(new char[bigNumber.intValue()]).replace("\0", repeatedString);
			System.out.println("Concatenated string : "+concatenatedString);
			String c = concatenatedString.trim().substring(0, bigNumber.intValue() );
			long counter = 0;
		    for (int i = 0; i < c.length(); i++) {
		      if (c.charAt(i)=='a')
		        counter++;
		    }
		    System.out.println(counter + " letters.");
		}
	}
}
