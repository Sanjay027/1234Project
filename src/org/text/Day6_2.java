package org.text;

import java.util.Scanner;

public class Day6_2 {

	
	public static void main(String[] args) {
		Scanner str_1=new Scanner(System.in);
		System.out.println("enter the value");
		String str_101 = str_1.nextLine();
		System.out.println("enter the value is :"+str_101);
	
		int check = str_101.length();
        System.out.println("the lenght is:"+check);
        
        if (check<10) {
        System.out.println("invalid");
        
		} else {
			System.out.println("valid");

		}
        
        
	}
}
