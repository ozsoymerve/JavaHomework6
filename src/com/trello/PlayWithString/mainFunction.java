package com.trello.PlayWithString;

import java.awt.image.ConvolveOp;

public class mainFunction {

	public static void main(String[] args) {
		String s1="Computer Science";
		int value=307;
		String s2=s1+" x";
		String s3=s1.substring(7,10);
		String s4="is fun";
		String s5=s2+" "+s4;
		
			System.out.println("s1="+s1);	
			System.out.println("s2="+s2);	
			System.out.println("s3="+s3);	
			System.out.println("s4="+s4);	
			System.out.println("s5="+s5);	
			
			int x=3;
			int y=5;
			int total=x+y;
			String s6="value of x:"+x+"\nvalue of y:"+y+"\ntotal:"+Integer.toString(total);
			
			String s7=Integer.toString(total)+x+y;
			String s8=" "+"x:"+x+"y:"+y+"total:"+total;
			
			System.out.println("s6="+s6);	
			System.out.println("s7="+s7);	
			System.out.println("s8="+s8);	
}

	

}
