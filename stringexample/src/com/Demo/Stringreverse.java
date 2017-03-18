package com.Demo;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abcdef";
	      String reverse = new StringBuffer(string).reverse().toString();
	      System.out.println("\nString before reverse: "+string);
	      System.out.println("String after reverse: "+reverse);
	      
	      /* Last position of word*/
	      
	      String strOrig = "Hello world ,Hello Reader";
	      int lastIndex = strOrig.lastIndexOf("Hello");
	      
	      if(lastIndex == - 1){
	         System.out.println("Hello not found");
	      } else {
	         System.out.println("Last occurrence of Hello is at index "+ lastIndex);
	      }
	      
	      /***************************/
	      
	      String t1 = "Tutorialspoint";
	      int index = t1.lastIndexOf("p");
	      System.out.println(index);
  
	      /* Upper Case */
	      
	      String str = "string abc touppercase ";
	      String strUpper = str.toUpperCase();
	      System.out.println("Original String: " + str);
	      System.out.println("String changed to upper case: " + strUpper);
	}

}
