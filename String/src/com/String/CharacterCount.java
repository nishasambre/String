package com.String;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter any String:");
		
		String input = scan.nextLine();
		//System.out.println("enter any String:");
		
		int alphabetCount = 0;
        int digitCount = 0;
        int specialSymbolCount = 0;
        
        for(int i =0;i<input.length();i++) {
        	char ch = input.charAt(i);
        	if(ch>='a'&& ch<='z' || ch>'A'&& ch<='Z')
        		alphabetCount++;
        	else if (ch>='0'&&ch<='9')
        		digitCount++;
        	else
        		specialSymbolCount++;
        		
        }
        System.out.println("Alphabets count: " + alphabetCount);
        System.out.println("Digits count: " + digitCount);
        System.out.println("Special symbols count: " + specialSymbolCount);

       
    }

}

	


