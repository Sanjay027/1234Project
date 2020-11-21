package org.text;

import java.util.Scanner;

public class Dsy6_3 {

	
	public static void main(String[] args) {
		Scanner str_1=new Scanner(System.in);
		System.out.println("enter the value");
		String str_101 = str_1.nextLine();
		System.out.println("enter the value is :"+str_101);
		
		String replace = str_101.replace(" " ,"#");
		System.out.println(replace);
		
	}
}
